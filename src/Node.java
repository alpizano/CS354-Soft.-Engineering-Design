import java.util.ArrayList;

public class Node {
	private String name;
	private int id;
	ArrayList<NetworkInterfaceCard> networks;
	
	
	public Node() {
		name = "";
		id = 0;
		networks = new ArrayList<NetworkInterfaceCard>();
	}
	
	public String getName() {
		return name;
	}

	public int getID() {
		return id;
	}
	
	 public void addInterface(NetworkInterfaceCard n) {
		  networks.add(n);
	  }
	
	public ArrayList<NetworkInterfaceCard> getInterfaces() {
	    return this.networks;
	}
	
	
	
}


