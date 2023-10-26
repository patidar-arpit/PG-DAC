import java.util.Scanner;

class Hotel{

    private int id;
    private String name;
    private String category;
    private double price;
    private double rating;


    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


}
public class Java_IPA1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hotel [] ho=new Hotel[4];

        for(int i=0;i<ho.length;i++){

            Hotel h=new Hotel();
            ho[i]=h;

            h.setId(sc.nextInt());
            h.setName(sc.nextLine());
            h.setCategory(sc.nextLine());
            sc.nextLine();
            h.setPrice(sc.nextDouble());
            h.setRating(sc.nextDouble());
        }

//        String str=sc.nextLine();

        String s=sc.next();

        int result=abc(s,ho);

        if(result==0)
            System.out.println("No Such Hotels");

        else
            System.out.println(result);
    }

    private static int abc(String str, Hotel[] ho) {
        int count =0;
        for(Hotel h1:ho){
            if(h1.getCategory().equals(str) && h1.getRating()>4)
                  count++;
        }

        return count;
    }


}
