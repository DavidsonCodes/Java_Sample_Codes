package Online_Code_Samples.Week1;

import java.util.Scanner;

public class TabulatedTimesTable {

    public static void main(String[] args) {
        System.out.print("This is a well structured multiplication table");
        System.out.print("\nEnter the number you want to print: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("========================================================");

        int count = 1;
        while(count < 13){
            System.out.printf("%s \t X \t %s \t = \t%s \n", number, count, (number * count));
//            System.out.println(number + "\tX\t" + count + "\t=\t" + (number * count) + "\n");
            count++;
        }

    }
}
