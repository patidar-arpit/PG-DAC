package p1;

public class NetworkPrinter implements Printer {

	@Override
	public void print(String message) {
		System.out.println("Sending message to sever"+message);
	}

}
