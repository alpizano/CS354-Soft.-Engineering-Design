// Alberto Pizano

import java.util.ArrayList;
import java.util.HashMap;


public class Network {
	
	private ArrayList<Node> nodeInstances; // list of Node instances
	private ArrayList<Link> links2; // list of link instances
	private HashMap<String, Node> key;
	
	/* constructor */
	public Network() {
		nodeInstances = new ArrayList<Node>();
		links2 = new ArrayList<Link>();
		key = new HashMap<String, Node>();
	}
	
	/* add node method */
	public int addNode(Node n) {

		if(nodeInstances.size() > 0)
		{
			for(int i = 0; i < nodeInstances.size(); i++)
			{
				if(nodeInstances.get(i).getName().equals(n.getName()))
				{
					return 0;
				}
			}
		}
		nodeInstances.add(n); // adds node into Array List
		key.put(n.getName(), n); // hash map
		return 1;
	}
	
	/* add link method */
	public int addLink(String n1, String n2) {
		
		boolean tag = false;
		ArrayList<NetworkInterfaceCard> nic1 = key.get(n1).getInterfaces();
		ArrayList<NetworkInterfaceCard> nic2 = key.get(n2).getInterfaces();
		Link list = new Link(key.get(n1), key.get(n2));
		
		if(links2.size() > 0)
		{
			for(int i = 0; i < links2.size(); i++)
			{
				if((links2.get(i).getNodes()[0] == (list.getNodes()[0]) && links2.get(i).getNodes()[1] == (list.getNodes()[1])) || (links2.get(i).getNodes()[0] == (list.getNodes()[1]) && links2.get(i).getNodes()[1] == (list.getNodes()[0])))
				{
					return 0;
				}
			}
		}
		for(int i = 0; i < nic1.size(); i++)
		{
			String testString1 = nic1.get(i).getIPAddress();
			int snmBits = nic1.get(i).getMaskBits();
			int p = 0;
			int split = 0;
			
			for(int j = 0; j < testString1.length(); j++)
			{
				if(testString1.charAt(j) == '.')
				{
					p++;
				}
				if((p == 3 && snmBits == 8) || (p == 2 && snmBits == 16) || (p == 1 && snmBits == 24))
				{
					split = j;
				}
			}
			for(int k = 0; k <nic2.size(); k++)
			{
				String testString2 = nic2.get(k).getIPAddress();
				if(testString2.length()>split && testString1.substring(0, split).equals(testString2.substring(0,split)))
				{
					tag = true;
					break;
				}
				
			}
			if(tag)
			{
					break;
			}
		}
		if(tag)
		{
			links2.add(list);
			return 1;
		}
		return 0;
	}
	
	// display hosts method
	public String displayHosts()
	{
		String hostString = "The hosts on the network are: \n";
		
		for(int i = 0; i < nodeInstances.size(); i++)
		{
			hostString += nodeInstances.get(i).getName()+" ID: "+ nodeInstances.get(i).getID()+"\n";
		}
		return hostString;
	}
	
	public String displayLinks() {
		String linksString = "";
		
		for(int i = 0; i<links2.size(); i++)
		{
			Node[] n = links2.get(i).getNodes();
			linksString += n[0].getName() + " has link with " + n[1].getName() + "\n";
		}
		return linksString;
	}
	
	public String displayRouters() {
		String routersString = "The routers on the network are: ";
		
		// begin nested for loop
		for(int i = 0; i< nodeInstances.size(); i++)
		{
			int counter = 0;
			for(int j = 0; j < links2.size(); j++)
			{
				Node[] n = links2.get(j).getNodes();
				if(nodeInstances.get(i) == n[0] || nodeInstances.get(i) == n[1])
				{
					counter++;
				}
				if(counter >=2 ){
					routersString += nodeInstances.get(i).getName()+" ";
					break;
				}
			}
		}
		return routersString;
	}
	
}

