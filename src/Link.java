import java.util.ArrayList;

public class Link {
	private Node[] links;

	public Link(Node node1, Node node2) {
		links = new Node[]{node1, node2}; // sets links between two nodes
	}
	
	public Node[] getNodes() {
		return links;
	}
}
