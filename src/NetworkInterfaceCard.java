
public class NetworkInterfaceCard {
	private String name;
	private String IPAddress;
	private int maskBits;
	
	public NetworkInterfaceCard() {
		name = "";
		IPAddress = "";
		maskBits = 0;
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
