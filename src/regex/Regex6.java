package regex;

public class Regex6 {
	
	void checkIP(String ip) {
		String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" + "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
		System.out.println("ip " + ip + " is OK? - " + ip.matches(regex));
	}
	
	public static void main(String[] args) {
		String ip1 = "172.30.18.11";
		String ip2 = "226.13.268.19";
		String ip3 = "0.0.0.0";
		Regex6 regex = new Regex6();
		regex.checkIP(ip1);
		regex.checkIP(ip2);
		regex.checkIP(ip3);
	}
}
