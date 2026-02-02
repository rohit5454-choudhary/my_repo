import java.util.Scanner;


public class cel_to_fer {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("enter the temp:");
        int user_input = scanner.nextInt();

        System.out.println(user_input);



        // int x =5;
        int formula = (user_input*9/5) +32;

        System.out.println(formula);

        scanner.close();

        
        

    }
}
