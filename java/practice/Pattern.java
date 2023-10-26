public class Pattern {
    public static void main(String[] args) {

        //pattern1();
        //pattern2();
        //pattern3();
        //pattern4();
        //pattern5();
        //pattern6();
        //pattern7();
        //pattern8();
        //pattern9();
        pattern10();
    }
    public static void pattern1(){
        for (int i=1;i<=5;i++){

            for(int k=5;k>i;k--){
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");

            }
            System.out.println("");
        }
    }

    public static  void pattern2(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public  static  void pattern3(){
        for(int i=1;i<=5;i++){
            for(int k=5;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("");
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static  void pattern4() {

     for(int i=1;i<=5*2-1;i++){

         if(i<=5){
             int space=10-i*2;
             for(int k=1;k<=space/2;k++){
                 System.out.print(" ");
             }
             for(int j=1;j<=i*2-1;j++){
                 System.out.print("*");
             }
             for(int k=1;k<=space/2;k++){
                 System.out.print(" ");
             }
             System.out.println("");

         }
         else {
             int spaces=2*i-10;

             for (int k=1;k<=spaces/2;k++){
                 System.out.print(" ");
             }
             for(int j=1;j<=(10-i)*2-1;j++){
                 System.out.print("*");
             }

             for (int k=1;k<=spaces/2;k++){
                 System.out.print(" ");
             }

             System.out.println("");

         }

     }


    }

    public static void pattern5(){
        for (int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static  void pattern6(){
        for (int i=1;i<=5;i++){
            int space=5-i;
            for (int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public  static  void  pattern7(){
        for (int i=5;i>=1;i--){
            int space=5-i;
            for (int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public  static  void  pattern8(){
        for (int i=5;i>=1;i--){
            int spaces=5-i;
            for (int s=1;s<=spaces;s++){
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }

    public static void pattern9(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
    public static void pattern10(){

        for (int i=1;i<=5*2-1;i++){
            if(i<=5){
                int spaces=5-i;
                for (int s=1;s<=spaces;s++){
                    System.out.print(" ");
                }
                for (int j=1;j<=i;j++){
                    System.out.print("*");
                }

                System.out.println("");
            }

            else {
                int spaces=i-5;

                for (int s=1;s<=spaces;s++){
                    System.out.print(" ");
                }
                for (int j=1;j<=10-i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }






}
