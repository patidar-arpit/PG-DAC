package p1;

public class FilePrinter implements Printer {

	@Override
	public void print(String message) {
		System.out.println("Saving a ms in file"+message);
	}
    
}
