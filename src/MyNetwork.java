// Alberto Pizano

import java.util.ArrayList;
import java.util.Scanner;


public class MyNetwork {

	public static void main(String[] args) {
		
		ArrayList<String> IPs = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		// creates new Network object
		Network net = new Network();
		
		int moreNode = 1;
		int moreCard = 1;
		int id = 0;
		
		while(moreNode == 1)
		{
			id++;
			System.out.print("Enter node name: ");
			String name = input.next();
			
			//creates new node
			Node n = new Node(name, id);
			if(net.addNode(n) == 1)
			{
				moreCard = 1;
				while(moreCard == 1)
				{
					System.out.print("Enter name of network interface card: ");
					String cardName = input.next(); 
					boolean duplicate = false;
					
					System.out.print("Enter IP address: ");
					String IP = input.next();
					
					// checks for duplicate IP addresses
					for(int i = 0; i < IPs.size(); i++)
					{
						if(IP.equals(IPs.get(i)))
						{
							duplicate = true;
						}
					}
					if(duplicate)
					{
						System.out.println("Cannot have identical IP addresses.");
						continue;
					}
					IPs.add(IP);
					System.out.print("Enter subnet mask: ");
					int mask = input.nextInt();
					
					//mask bits must be 8, 16, or 24
					if(mask == 8 || mask == 16 || mask == 24)
					{
						NetworkInterfaceCard i = new NetworkInterfaceCard(cardName, IP, mask); // adds NIC name, ip, and subnet mask into array list
						n.addInterface(i);
					}
					else 
						System.out.println("Mask has to be 8, 16 or 24.");
					System.out.print("Want to add more network interface cards, press 1: ");
					moreCard = input.nextInt();
				}
				System.out.print("Want to add a node, press 1: ");
				moreNode = input.nextInt();
			}
			else
			{
				System.out.println("Cannot have identical nodes");
				System.out.print("To add more nodes, press 1: ");
				moreNode = input.nextInt();
			}
		}
		System.out.print("To add links, press 1: ");
		int moreLinks = input.nextInt();
		
		while(moreLinks == 1)
		{
			System.out.print("Enter the name of the first host: ");
			String host1 = input.next();
			System.out.print("Enter the name of the second host: ");
			String host2 = input.next();
			if(host1.equals(host2))
			{
				System.out.println("Cannot link a host to itself.");
			}
			if(net.addLink(host1, host2) == 0){
				System.out.println("Linking could not occur.");
			}
			System.out.print("To add links, press 1: ");
			moreLinks = input.nextInt();
		}
		
		int menu = 1;
		while(menu >= 1 && menu <= 3)
		{
			System.out.println("Enter 1 for host information.");
			System.out.println("Enter 2 for link information.");
			System.out.print("Enter 3 for router list.\nElse exit.\nEnter your choice: ");
			menu = input.nextInt();
			if(menu == 1)
			{
				System.out.println(net.displayHosts());
			}
			if(menu == 2)
			{
				System.out.println(net.displayLinks());
			}
			if(menu == 3)
			{
				System.out.println(net.displayRouters());
			}
		}
	}
}

