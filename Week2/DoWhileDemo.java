package Online_Code_Samples.Week2;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do{
            System.out.println("Please enter a String, enter (quit) to stop loop: ");
            input = scanner.nextLine().toLowerCase();
            System.out.println("You've entered : " + input);
            if( input.equals("quit"))
                System.out.println("You've entered 'quit' to stop the program");
        } while( !input.equalsIgnoreCase("quit"));
    }
}
