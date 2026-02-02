import java.util.Scanner;

public class circle_06 {

    public static void main(String[] args){


        Scanner scn = new Scanner(System.in);


        System.out.println("enter the pi :");
        int pi = scn.nextInt();

        System.out.println("enter the r :");
        int r  = scn.nextInt();


        //  formula     c=   2pir
        int perimeter_of_circle = 2*pi*r;


        int r_square = r*r;
        int area_of_circle = pi*r_square;



        System.out.println(perimeter_of_circle);
        System.out.println(area_of_circle);

        scn.close();
    }

    
}
