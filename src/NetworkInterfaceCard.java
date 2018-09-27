// Alberto Pizano

public class NetworkInterfaceCard {
	private String name; // i.e. eth0
	private String IPAddress;
	private int maskBits;
	
	public NetworkInterfaceCard() {
		name = "";
		IPAddress = ""; // octet format i.e. 192.168.0.1
		maskBits = 0; // use 8 16 and 24
	}
	
	public NetworkInterfaceCard(String name, String IPAddress, int maskBits) {
		this.name = name;
		this.IPAddress = IPAddress;
		this.maskBits = maskBits;
	}
	
	
	public NetworkInterfaceCard(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIPAddress(String ip) {
		IPAddress = ip;
	}
	
	public void setSubnetMask(int maskBits) {
		this.maskBits = maskBits;
	}
	
	public String getName() {
		return name;
	}
	
	public String getIPAddress() {
		return IPAddress;
	}

	public int getMaskBits() {
		return maskBits;
	}
}
