import java.util.*;


public class pos_nag_08 {
    public static void main(String[] args){


        Scanner scn = new Scanner(System.in);


        System.out.println("enter the num :");
        int num = scn.nextInt();

        if (num>0) {
            System.out.println("its positive number ");
            
        } else {
            System.out.println("its nagative number");
            
        }



        scn.close();
    }
    
}
