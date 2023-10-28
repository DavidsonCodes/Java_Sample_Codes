package Online_Code_Samples.Week2;

import java.util.Scanner;

public class NumberFive {
    public static void main(String[] args) {
        int count = 1;
        int fiveSeries = 0, total = 0;
        int[] sumOfNumbers = new int[4];
        int arrayIndex = 0;

        Scanner scanner = new Scanner(System.in);
        do{
            for( int i = 0; i < 5; i++){
                System.out.println("Please enter an integer: ");
                int entered = scanner.nextInt();
                fiveSeries += entered;
            }
            System.out.printf("Series %d Total : %d\n", count, fiveSeries);
            sumOfNumbers[arrayIndex++] = fiveSeries;
            fiveSeries = 0;
            count++;
        }while( count <= 4);
        scanner.close();
        for( int x : sumOfNumbers ){
            total += x;
        }
        System.out.println("Total summation: " + total);
    }
}
