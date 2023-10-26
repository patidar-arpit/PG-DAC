package p1;

public class Testprinter {

	public static void main(String[] args) {
//		ConsoLePrinter cp = new ConsoLePrinter();
//		cp.print("some msg");
//		
//		FilePrinter fp =new FilePrinter();
//		fp.print("another msg");
		
		//Printer p =new Printer(); cant make a obj of interface Printer
		
//		Printer p;
//		p = new ConsoLePrinter();  //offcourse yes upcsating;
//		
//		p.console();  // it will say method is undefined in the Printer 
//		p.print("Hello"); // ConsoLePrinter class print gets called at runtime decided by jvm;
//		
//		p = new FilePrinter();
//		p.print("Hii");
//		
		
		
		Printer [] prr = {
				new ConsoLePrinter(),
				new FilePrinter(),
				new NetworkPrinter()
		};
		
		for(Printer p :prr) {
			p.print("SAME");
		}
		
		for(Printer p: prr) {
			if(p instanceof ConsoLePrinter) {
				((ConsoLePrinter)p).console();
			}
		}
				

	}

}
