import java.util.Scanner;

public class MyNetwork {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Node node1;
		NetworkInterfaceCard nic1;
	
		System.out.println("Enter node name: ");
		String host1 = input.nextLine();
		new Node(host1);
		
		System.out.println("Enter name of network interface card: ");
		String eth0 = input.nextLine();
		new NetworkInterfaceCard(eth0);
		
		System.out.println("Enter IP address: ");
		System.out.println("Enter subnet mask: ");
		System.out.println("Want to add more network interface cards, press 1: ");
		System.out.println("Want to add a node, press 1: ");
		
		
	}

}
