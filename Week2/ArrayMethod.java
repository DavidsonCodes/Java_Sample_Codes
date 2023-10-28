package Online_Code_Samples.Week2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethod {
    /*
    Create an object of int[] to hold the int inputs
    Use scanner to collect the inputs
    use a loop to iterate five times to ensure full collection
    return the populated array
     */
    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[5];
        for( int i = 0; i < 5; i++ ){
            System.out.println("Enter an input: ");
            int entered = scanner.nextInt();
            intArray[i] = entered;
        }
        return intArray;
    }

    public static String[] readString(){
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = new String[5];
        for( int i = 0; i < 5; i++ ){
            System.out.println("Enter an input: ");
            String entered = scanner.nextLine();
            stringArray[i] = entered;
        }
        return stringArray;
    }
}

class ArrayTest{
    public static void main(String[] args) {
        int[] collectedInput = ArrayMethod.readIntegers();
        System.out.println(Arrays.toString(collectedInput));
        String[] collectedString = ArrayMethod.readString();
        System.out.println(Arrays.toString(collectedString));
    }
}