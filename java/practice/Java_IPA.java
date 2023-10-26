import java.util.Arrays;
import java.util.Scanner;

class  University{

    private int universityId;
    private  String universityName;
    private String location;

    private double rating;
    private boolean innovationLab;

    public int getUniversityId() {
        return universityId;
    }

    public boolean isInnovationLab() {
        return innovationLab;
    }

    public void setInnovationLab(boolean innovationLab) {
        this.innovationLab = innovationLab;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

     public String toString(){
        return this.universityName+":"+this.universityId+":"+this.location+":"+this.rating+":"+this.innovationLab;
      }

}


public class Java_IPA {


    public static void main(String[] args) {

        University [] arr=new University[4];

        Scanner scanner=new Scanner(System.in);

        for (int i=0;i<arr.length;i++){

            University un =new University();
            arr[i]=un;

            int id = scanner.nextInt();

            String name = scanner.next();

            String loc = scanner.next();

            double rat = scanner.nextDouble();

            boolean res = scanner.nextBoolean();


            arr[i].setUniversityId(id);
            arr[i].setUniversityName(name);
            arr[i].setLocation(loc);
            arr[i].setRating(rat);
            arr[i].setInnovationLab(res);

        }

        String lo=scanner.next();
        double rat=scanner.nextDouble();

        System.out.println(Arrays.toString(arr));


        int result=findInnovationLab(arr,lo,rat);

        if(result!=0)
            System.out.println(result);

        else
            System.out.println("No Such Universities");

    }

    public static int findInnovationLab(University [] arr,String lo,double rat){
        int count=0;
        for (University i :arr){
            if(i.getLocation().equals(lo) && i.isInnovationLab()==true && i.getRating()>=rat)
                count++;
        }
        return count;

    }
}






