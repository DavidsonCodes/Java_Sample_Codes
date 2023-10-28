package Online_Code_Samples.Week2;

import java.util.ArrayList;
import java.util.List;

public class Array {

    //Let's write different arrays
    static Integer[] intArray = new Integer[]{1, 3, 4, 5, 6};
    static Double[] doubleArray = new Double[]{2.5, 5.5, 9.4, 50.0};
    static String[] stringArray = {"Mike", "Pence", "Peace", "John"};
    static Object[] objectArray = {new Dog("Rex", 3), 39, "Mike Pence", doubleArray[3], intArray};

    List<String> strings = new ArrayList<String>();

    public static void printArray(Object[] array) {
        for (Object obj : array) {
            System.out.println(obj);
        }
        System.out.println("=========================================");
    }

//    public T<? extends Number> T getMax(T a, T b){
//        Object first = a;
//        Object second = b;
//        if( a > b)
//            return (T)a;
//        else return (T)b;
//    }


    public static void main(String[] args) {
        printArray(intArray);
        printArray(stringArray);
        printArray(objectArray);




    }
}
