import java.util.*;
class CheckDouble
{
	public static void main(String[] args)
	{
		
              Scanner sc=new Scanner(System.in);
          
              System.out.println("Enter two double values:");
               
              if(sc.hasNextDouble())
		{
                    double d1=sc.nextDouble();
                    if(sc.hasNextDouble())
			{
                           double d2=sc.nextDouble();
                            System.out.println("Average is:"+((d1+d2)/2));
                     }
                     else{

                          System.out.println("Number two is not double");
                    }
              }
              else{
                   System.out.println("Numb1 is not double");
              }
         }
      

}