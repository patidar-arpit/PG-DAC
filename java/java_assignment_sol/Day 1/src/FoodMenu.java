import java.util.*;

class FoodMenu{
     
    public static void main(String [] argv){
      
 
           Scanner sc=new Scanner(System.in);
          
           	System.out.println("1.Dosa");
		System.out.println("2.Idli");
		System.out.println("3.Maggi");
		System.out.println("4.Samosa");
                System.out.println("5.Generate Bill");
	      
                boolean exit=false;
                 	//int choice=sc.nextInt();
                       int qty=0;
                int totalPrice=0;        
                while(!false){

                    switch (sc.nextInt()){
                              
                         case 1:
				int priceDosa=70;
                             	System.out.println("Enter the quantity");
                                qty=sc.nextInt();                                                                                             
                                totalPrice+=qty*priceDosa;
                                break;
			case 2:
				int priceIdli=60;
                             	System.out.println("Enter the quantity");
                                qty=sc.nextInt();                                                                                             
                                totalPrice+=qty*priceIdli;
                                break;
   			case 3:
                                int priceMaggi=50;
                             	System.out.println("Enter the quantity");
                                qty=sc.nextInt();                                                                                             
                                totalPrice+=qty*priceMaggi;
                                break;
			case 4:
 				int priceSamosa=15;
                             	System.out.println("Enter the quantity");
                                qty=sc.nextInt();                                                                                             
                                totalPrice+=qty*priceSamosa;
                                break;

                         case 5:
           
	                        System.out.println("Generated Total Bill:"+totalPrice);
				exit=true;
				System.exit(0);
                                break;
			
                          
 				   	


 
  
                   }
                   
                }
           
		
    }


}