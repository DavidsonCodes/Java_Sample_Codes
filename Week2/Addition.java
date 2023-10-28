package Online_Code_Samples.Week2;

public class Addition {
    public static void main(String[] args) {
        int[] arrays = {200, 9, 29, 310, 98, 5, 6, 3};
        int max = getMaximum(arrays);
        System.out.printf("Maximum number is : %s", max);
    }


    public static int getMaximum(int[] array){ //Method declaration
        int max = array[0];

        for(int i = 1; i < array.length; i++ ){
            if( array[i] > max ){
                max = array[i];
            }
        }
        return max; //Math class static method 'max' called within
    }
}

