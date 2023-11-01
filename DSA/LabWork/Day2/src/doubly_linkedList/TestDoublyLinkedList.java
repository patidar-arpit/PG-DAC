package doubly_linkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList d1 = new DoublyLinkedList();
		
		d1.addLast(10);
		d1.addLast(20);
		d1.addLast(30);
		d1.addLast(40);
		d1.addLast(50);

		d1.display();  // 10 20 30 40 50 
		
		d1.addFirst(100);
		d1.addFirst(200);
		d1.addLast(3000);
		
		d1.display();   // 200 100 10 20 30 40 50 3000 
		
		d1.insert(3, 90);  
		
		d1.display(); // 200 100  10  90 20 30 40 50 3000
		
		System.out.println(d1.getSize()); //9
		
		System.out.println(d1.removeLast());  // 3000
		System.out.println(d1.removeLast());  //50
		System.out.println(d1.removeLast());  // 40
		System.out.println(d1.removeFirst()); //200
        System.out.println(d1.remove(3));   // 10 
        
        d1.display();        //    100 90 20 30 
        System.out.println(d1.getSize());  // 4
        System.out.println(d1.removeLast()); //30
        System.out.println(d1.removeLast()); //20
        System.out.println(d1.removeLast()); //90 
        System.out.println(d1.getSize()); // 1
        d1.display();
        System.out.println(d1.removeLast());  // 100 
        System.out.println(d1.getSize());  // 0
        d1.display(); //
        System.out.println(d1.removeFirst()); //  list is empty give exception
        System.out.println(d1.getSize()); // 0
        System.out.println(d1.removeFirst());
        
		

	}

}
