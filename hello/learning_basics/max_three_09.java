import java.util.*;

public class max_three_09 {

    public static void main(String[] args){


        Scanner scn = new Scanner(System.in);


        System.out.println("enter the num1 :");
        int num1 = scn.nextInt();


        System.out.println("enter the num2 :");
        int num2 = scn.nextInt();
        System.out.println("enter the num3 :");
        int num3 = scn.nextInt();

        if (num1>=num2 && num1>=num3) {
            System.out.println("num1 is max");
            
        } else if (num2>=num1 && num2>=num3) {
            System.out.println("num2 is max");
            
        }else {
            System.out.println("num3 is max");
            
        }



        scn.close();
    }
    
}
