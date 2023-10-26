import  java.util.*;
class Student1{
    private int rollNo;
    private  String name;

    public  Student1(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    public  String toString(){

        return  this.rollNo+":"+this.name;
    }
}

class Employee1{

    private int id;
    private  String name;

    public  Employee1(int id,String name){
        this.id=id;
        this.name=name;
    }

    public  String toString(){

        return  this.id+":"+this.name;
    }

}
public class Generics2 {

    public static void main(String[] args) {
        Student s1=new Student(1,"Arpit");
        Student s2=new Student(2,"Virat");

        Employee e1=new Employee(101,"Arpit");


        ArrayList<Student> l1=new ArrayList<>();  //Now this will accept only STUDNET type object

        l1.add(s1);
        l1.add(s2);
//        l1.add(e1); // Now this will give error because l1 will accepting only studnt type object so compile time pr pata chl jaega ki erroe hai to ye cheej acchi hai

        Iterator itr=l1.iterator();
        while (itr.hasNext()){
            Student obj =(Student)itr.next();
            System.out.println(obj);
        }



    }
}

