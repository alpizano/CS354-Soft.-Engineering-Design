// Alberto Pizano

import java.util.ArrayList;

public class Node {
	private String name;
	private int id;
	private ArrayList<NetworkInterfaceCard> networks1;
	
	
	public Node() {
		name = "";
		id = 0;
		networks1 = new ArrayList<NetworkInterfaceCard>();
	}
	
	public Node(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Node(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getID() {
		return id;
	}
	
	 public void addInterface(NetworkInterfaceCard i) {
		  networks1.add(i);
		  //id++;
	  }
	
	public ArrayList<NetworkInterfaceCard> getInterfaces() {
	    return this.networks1;
	}
}


