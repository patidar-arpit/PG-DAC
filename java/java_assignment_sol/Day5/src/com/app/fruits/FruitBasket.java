package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of basket:");
		Fruit[] basket = new Fruit[sc.nextInt()];
		int count = 0;

		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display all the name of all fruits int the basket.");
		System.out.println("5.Display name,color,wieght,taste of all fresh fruits in the basket");
		System.out.println("6.Mark a fruit in a basket as not fresh : Give index");
		System.out.println("7.Mark all sour fruits stale");
		System.out.println("8.Invoke fruit specify funcs (pulp/juice/jam) :Give Index");
		System.out.println("9.Exit");

		while (true) {
			System.out.println("Enter Choice:");
			switch (sc.nextInt()) {
			case 1:

				if (count < basket.length)
					basket[count++] = new Mango(sc.next(), sc.nextDouble(), sc.next());
				else
					System.out.println("Basket Full..!");

				break;

			case 2:

				if (count < basket.length)
					basket[count++] = new Orange(sc.next(), sc.nextDouble(), sc.next());
				else
					System.out.println("Basket Full..!");
				break;

			case 3:

				if (count < basket.length)
					basket[count++] = new Apple(sc.next(), sc.nextDouble(), sc.next());
				else
					System.out.println("Basket Full..!");
				break;

			case 4:

				for (Fruit f : basket) {
					System.out.println(f.getName());
				}

				break;

			case 5:

				for (Fruit f : basket) {
					if (f.isFresh()) {
						System.out.println(f.toString());
						System.out.println(f.taste());
					}

				}
				break;

			case 6:

				System.out.println("Enter index of fruit that have to be marked unfresh:");
				int index = sc.nextInt();
				if (index < 0 || index > basket.length - 1) {
					System.out.println("Invalid index");
				}

				else {

					if (basket[index] != null) {
						basket[index].setFresh(false);
					}

				}

				break;

			case 7:

				for (Fruit f : basket) {
					String s1 = f.taste();
					if (s1.equals("sour")) {
						f.setFresh(false);
					}
				}
				break;

			case 8:

				System.out.println("Enter index:");
				int i = sc.nextInt();
				if (basket[i] instanceof Apple) { /// DownCasting only here because i want to call the methods which are
													/// not present in the Fruit class
					Apple a = (Apple) basket[i];
					a.jam();
				} else if (basket[i] instanceof Mango) {
					((Mango) basket[i]).pulp();
				} else if (basket[i] instanceof Orange) {
					((Orange) (basket[i])).juice();
				}
				break;

			case 9:

				System.exit(0);

			default:

				System.out.println("Invalid Choice");

			}

		}

	}

}
