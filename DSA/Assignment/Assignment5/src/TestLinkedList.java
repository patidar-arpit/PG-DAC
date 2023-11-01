import java.util.Scanner;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		System.out.println("Enter the count of the element :");
		int n = sc.nextInt();
		
		
		while(true) {
			
			System.out.println("1.Show the content of the element\n"
					+ "2.Insert the data in the Linked list\n"
					+ "3.Check how many elements are there in Linked List\n"
					+ "4.Check to see if linked list is empty\n"
					+ "5.Exit");
			
			System.out.println("Enter the choice:");
			
			switch (sc.nextInt()) {
			
			case 1:
				
			   l1.display();
				break;
				
			case 2:
				
				System.out.println("Enter the element");
			    l1.addLast(sc.nextInt());
			    break;
			    
			case 3:
				
				System.out.println(l1.getSize());
				break;
				
				
			case 4:
				if(l1.getSize() ==0)
					System.out.println("True");
				else
					System.out.println("False");
				break;
				
			case 5:
				System.out.println("Exit");
				System.exit(0);

			default:
				break;
			}
		}
	}
}
