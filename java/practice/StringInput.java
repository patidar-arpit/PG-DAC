package local;

import java.util.Scanner;

public class StringInput {
	  public static void main(String[] args) {
		
		  Scanner sc =new Scanner(System.in);
		   int n = sc.nextInt();
		   while(n>0) {
			  sc.nextLine();
			  String s = sc.nextLine();
			  long phoneNo = sc.nextLong();
			  System.out.println(s);
			  System.out.println(phoneNo)
		   }

	}
}

// 3
// hdhsd hdhsd
// 678987
// dssdgbsd jsdjkdh
// 3939339
// fggghghhh
// 9876543
