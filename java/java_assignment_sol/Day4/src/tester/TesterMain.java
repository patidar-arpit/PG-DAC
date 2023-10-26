package tester;

import java.util.Scanner;

import core.Point2D;

public class TesterMain {
	
   
    public static void plotPoint(Point2D [] p,int index) {
    	
    	Scanner sc =new Scanner(System.in);
		
        if( index < 0 || index > p.length-1)					  
  		   System.out.println("Index Invalid");	
  	    else {
  	    	
  	    	if( p[index] == null) {
  	    		System.out.println("Enter X and Y:");
  	  	    	Point2D p1= new Point2D(sc.nextDouble(),sc.nextDouble());
  	    		p[index] = p1;
  	    		
  	    	}
  	    	else
  	    		System.out.println("Point exist on that index");
  	    	
  		    
  	    	
  	    }
  	}
    
    public static void doCheck(Point2D [] p,int index1,int index2) {
    	
    	if (index1 >p.length-1 || index1 < 0 || index2 >p.length-1 || index2 < 0) {
    		System.out.println("Index Invalid");	
    	}
    	else {
    		
    		if( p[index1] != null && p[index2] != null) {
    			if(p[index1].isEqual(p[index2])) {
    				System.out.println("Same points");
    			}
    			else {
    				System.out.println("Distance is:"+p[index1].distance(p[index2]));
    			}
    		}
    	}
              
    }
       
		
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter how many points you want to store:");
		Point2D [] p = new Point2D [sc.nextInt()];
		
		System.out.println("1.PLOT A POINT");
		System.out.println("2.dISPLAY X,Y FOR ALL POINTS");
		System.out.println("3.aCCEPT 2 INDICES FROM USER:");
		
		while(true) {
			System.out.println("Enter choice:");
			int choice =sc.nextInt();

			switch(choice) {
			
		     	case 1:
		     		 
		     		System.out.println("Enter the index on which you want to plot point in range (0 - :");
		      	    int index=sc.nextInt();
		     		plotPoint(p,index);
		     		break;
		     		
		     		
		     	case 2:
		     		
		     		for(Point2D point:p) {
		    			if(point !=null)
		    				 System.out.println(point.show());
		    		}
		     		break;
			
				case 3: 
					
					System.out.println("Enter  2 indices from user: ");
					doCheck(p,sc.nextInt(),sc.nextInt());
					break;
					
				case 0:
					System.exit(0);
					
				default:
					 System.out.println("Invalid Choice Bhai");
					
					
					
					
					
				
			
		  }
	
	  }
   }
	
}

	
