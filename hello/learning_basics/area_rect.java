import java.util.Scanner;


public class area_rect  {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("enter the length :");
        int length = scn.nextInt();

        System.out.println("enter the width :");
        int width = scn.nextInt();


        int per = 2*(length+width);

        int area = length*width;


        System.out.println(area);
        System.out.println(per);

        //  area of rectangle a=wl

        scn.close();





    }




    
}