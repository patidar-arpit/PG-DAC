package tester;

import java.util.Scanner;

import core.Box;

public class TestBox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Box[] brr = new Box[2];

		for (int i = 0; i < 2; i++) {
			brr[i] = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}

		for (Box b : brr) {
			System.out.println(b);
			if (b.getBoxVolume() > 100) {
				b.setWidth(b.getWidth()*2);
			}
		}
		for (Box b : brr) {
			System.out.println(b);
		}
		
		
		
		
		

		sc.close();

	}
}
