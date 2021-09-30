package inheritance;

public class TrafficCardAccountEX {

	public static void main(String[] args) {
		TrafficCardAccount traffic = new TrafficCardAccount("122-14", 10000, "ȫ�浿", "3333-44", true);
		System.out.println(traffic.payTrafficCard("3333-44", 1800));

	}

}
