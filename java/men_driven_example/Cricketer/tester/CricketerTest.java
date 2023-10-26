package tester;

import java.time.Year;
import java.util.HashMap;
import java.util.Scanner;

import com.core.Cricketer;

import custom_exception.CricketException;
import utils.CricketerUtils;

public class CricketerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Cricketer> map = CricketerUtils.sampleData();

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				System.out.println("1.Accept minimum 5 Cricketers in the collection.");
				System.out.println("2.Modify Cricketer's rating");
				System.out.println("3.Search Cricketer by name");
				System.out.println("4. Display all Cricketers added in collection.");
				System.out.println("5.Display All Cricketers in sorted form by rating.");

				System.out.println("Enter choice");

				try {
					switch (sc.nextInt()) {

					case 1:

						System.out.println("Enter the email:");
						String email = sc.next();
						if (!email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"))
							throw new CricketException("Not a valid email");

						if (map.containsKey(email))
							throw new CricketException("Emial Already exist");

						System.out.println("Enter name,age,phone,rating");
						Cricketer ct = new Cricketer(sc.next(), sc.nextInt(), email, sc.next(), sc.nextInt());

						map.put(email, ct);

						System.err.println("Added.!");
						break;

					case 2:
						
						System.out.println("Enter email of cricketer whoes rating you have to modify");
						CricketerUtils.modifyRating(sc.next(), map);
						System.err.println("--------Modified----------");

						break;

					case 3:
						System.out.println("ENter the name of cricketer:");
						String name = sc.next();
						map.values().stream().filter(c -> c.getName().equals(name)).forEach(c -> System.out.println(c));

						System.err.println("-----------------------");
						break;

					case 4:

						map.values().stream().forEach(c -> System.out.println(c));

						System.err.println("----------------------------------");
						break;

					case 5:

						map.values().stream().sorted((c1, c2) -> ((Integer) (c1.getRating())).compareTo(c2.getRating()))
								.forEach(c -> System.out.println(c));

						break;

					default:
						break;
					}

				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}

		} catch (Exception e) {

		}

	}

}
