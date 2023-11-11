// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class InstanceOf{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Solution s  = new Solution();
        s.main();
    }
}



class Student{}
class Rockstar{   }
class Hacker{}


class Solution{
   
   static void count(ArrayList mylist){
      int a = 0,b = 0,c = 0;
      
      for(Object o : mylist){
          
          if(o instanceof Student)
             a++;
          else if( o instanceof Hacker)
             b++;
          
          else
            c++;
          
      }
      System.out.println(a+" "+b+" "+c);
      
   }

   public static void main(){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      sc.nextLine();
      while(t>0){
          String s = sc.next();
          if(s.equals("Student"))
              mylist.add(new Student());
          else if(s.equals("Hacker"))
              mylist.add(new Hacker());
          
          else
              mylist.add(new Rockstar());
           
          t--;   
      }
      count(mylist);
   }
}