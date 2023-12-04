public class nestedForLoops {
    /*Programmer: James Keller
      Date: 12/4/23
      Description: 4.3 Nested Loops Practice
    */
    public static void main(String[] args) {
        //call each number method 
        //remember to print the number first
        //add a blank line between activities as shown
        //For example, the first one has been done for you
        System.out.println("Number 1:");
        number1();
        System.out.println("");
        System.out.println("Number 2:");
        number2();
        System.out.println("");
        System.out.println("Number 3:");
        number3();
        System.out.println("");
        System.out.println("Number 4:");
        number4();
        System.out.println("");
        System.out.println("Number 5:");
        number5();
        System.out.println("");
        System.out.println("Number 6:");
        number6();
        System.out.println("");
        System.out.println("Number 7:");
        number7();


    }

    //create a number method for each activity
    //each method must use nested for loops to generate the output
    public static void number1(){
        for (int i=1;i<7;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
        System.out.println("");
        }


    }

    public static void number2(){
        for (int i=1;i<10;i++){
            for (int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    

    }

    public static void number3(){
        for (int i=0;i<5;i++){
            System.out.print("*");
            for (int j=3;j<10;j+=3){
                System.out.print(j);
            }
            System.out.println("*");
        }

    }

    public static void number4(){
        for (int i=0;i<4;i++){
            for (int j=2+i;j<6+i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }


    }

    public static void number5(){
        for (int i=1;i<7;i++){
            if (i%2!=0){
                for (int j=2;j<9;j+=2){
                    System.out.print(j);
                }
            } else {
                for (int k=1;k<5;k++){
                    System.out.print(k);
                }
            }
            System.out.println("");
        }


    }

    public static void number6(){
        for (int i=1;i<10;i++){
            if (i<5){
                for (int j=0;j<i;j++){
                    System.out.print("*");
                }
            } else if (i==5){
                for (int k=0;k<5;k++){
                    System.out.print("*");
                }
            } else if (i>5){
                for (int l=10;l>i;l--){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }

    
    public static void number7(){
        for (int i=1;i<=9;i++){
            for (int j=i;j<=9;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
            
        }

    }
}
