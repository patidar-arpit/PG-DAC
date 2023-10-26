package params_passing;
public class TestParamPassing1 {
	public static void main(String[] args) {
		// write a static method to update emp sal.
		Emp e1 = new Emp(1, "aa", 1000);

		System.out.println("orig sal bef  =" + e1.getSal()); // print 1000;
		testMe(e1.getSal(), 100);  //    print 1100;
		System.out.println("in main, after updation  =" 
		+ e1.getSal());  //1000
	}

	static void testMe(double sal, double inc) {
		sal += inc;
		System.out.println("in meth sal=" + sal);   
	}

}
