package circular_linkedList;


public class TestCircularLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList l1 = new CircularLinkedList();
		l1.addLast(10);
		l1.addLast(20);
		l1.addLast(30);
		l1.addLast(40);
		l1.addLast(50);

		l1.display();  // 10 20 30 40 50 
		
		l1.addFirst(100);
		l1.addFirst(200);
		l1.addLast(3000);
		
		l1.display();   // 200 100 10 20 30 40 50 3000 
		
		l1.insert(3, 90);  
		
		l1.display(); // 200 100 90 10 20 30 40 50 3000
		
		System.out.println(l1.getSize()); //9
		
		System.out.println(l1.removeLast());  // 3000
		System.out.println(l1.removeLast());  //50
		System.out.println(l1.removeLast());  // 40
		System.out.println(l1.removeFirst()); //200
        System.out.println(l1.remove(3));   // 10 
        
        l1.display();        //    100 90 20 30 
        System.out.println(l1.getSize());  // 4
        System.out.println(l1.removeLast()); //30
        System.out.println(l1.removeLast()); //20
        System.out.println(l1.removeLast()); //90 
        System.out.println(l1.getSize()); // 1
        System.out.println(l1.removeLast());  // 100 
        System.out.println(l1.getSize());  // 0
        System.out.println(l1.removeFirst()); //  list is empty
        System.out.println(l1.getSize()); // 0
        l1.display();
      
		
		
	}

}
