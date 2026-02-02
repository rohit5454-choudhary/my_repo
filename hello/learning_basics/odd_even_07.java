import java.util.Scanner;

public class odd_even_07 {

    public static void main(String[] args){


        Scanner scn = new Scanner(System.in);


        System.out.println("enter the num :");
        int num = scn.nextInt();

        if (num%2 ==0) {
            System.out.println("its even number");
            
        } else {
            System.out.println("its odd number");
            
        }



        scn.close();
    }
    
}
