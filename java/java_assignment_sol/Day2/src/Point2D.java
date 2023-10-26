
import java.lang.Math; 

class Point2D{

      private int x;
      private int y;
   
      public Point2D(int x,int y)
	{
       
          this.x=x;
          this.y=y;
      	}

      public void show()
	{
          
          System.out.println("X:"+this.x+"Y:"+this.y);
      	}

      public int getX()
	{
	  return this.x;
	}
	
      public int getY()
	{
	  return this.y;
	}	
      public boolean isEqual(Point2D obj2)
	{
	  if(this.x==obj2.x && this.y==obj2.y)
		return true;
	  else
		return false;	 
	}
	 
	 public double calculateDistance(Point2D obj2){
		 int x=(obj2.x-this.x)*(obj2.x-this.x); 
		 int y=(obj2.y-this.y)*(obj2.y-this.y);
		 
		 
  
        return Math.sqrt(x+y);  
	     	 
	 }

}

	

	
