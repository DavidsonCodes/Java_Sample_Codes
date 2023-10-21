package Online_Code_Samples.Week1;

public class ArrayIntroduction {

    //Let's write different arrays
    static Integer[] intArray = {1, 3, 4, 5, 6};
    static int[] numbers = new int[20];
    static String[] stringArray = {"Mike", "Pence", "Peace", "John"};
    static Object[] objectArray = {new Dog("Rex", 3), 39, "Mike Pence", true};

    public static <T> void printArray(T[] array){
        for(T obj: array){
            System.out.print(obj.toString() + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(intArray);
        printArray(stringArray);
        printArray(objectArray);
    }
}
