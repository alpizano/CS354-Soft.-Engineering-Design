// Alberto Pizano
//CS354

public class Link {
	private Node[] links1;

	public Link(Node node1, Node node2) {
		links1 = new Node[]{node1, node2}; // sets links between two nodes
	}
	
	public Node[] getNodes() {
		return links1;
	}
}
