import  java.util.*;
class Student{
    private int rollNo;
    private  String name;

    public  Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    public  String toString(){

        return  this.rollNo+":"+this.name;
    }
}

class Employee{

    private int id;
    private  String name;

    public  Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public  String toString(){

        return  this.id+":"+this.name;
    }

}
public class Generics1 {

    public static void main(String[] args) {
        Student s1=new Student(1,"Arpit");
        Student s2=new Student(2,"Virat");

        Employee e1=new Employee(101,"Arpit");


        ArrayList l1=new ArrayList();  // I make this for adding tthe students object into arraylist

        l1.add(s1);
        l1.add(s2);
        l1.add(e1);  // And by mistake someone add employeee object and we are thinking that it contains only student object at that time this not give error but aage dikkat dega


        // Now its time for retrieving students object

        Iterator itr=l1.iterator();
        while (itr.hasNext()){
            Student obj=(Student)itr.next(); // We typeCast into the type of student beacause we are thinking it returns the student type object only
                                            // But this will give error because we are not thinking that someone add employee object into the l1 and we cannt typecast it into the student object so it will give exception that classcastexception
            System.out.println(obj);        //So here comes generics into picture see next example file
        }


    }
}
