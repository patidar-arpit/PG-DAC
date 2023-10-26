package p1;

public class ConsoLePrinter implements Printer {

	public void print(String message) {
		System.out.println("Printing msg o nthe console"+message);
	}
	
	// specific method for only ConsolePrinter
	public void console() {
		System.out.println("console:");
	}
}
