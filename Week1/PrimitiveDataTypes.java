package Online_Code_Samples.Week1;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte bite = 127; //1 bytes or 8 bits
        System.out.println(Byte.MAX_VALUE);
        System.out.println(bite);

        boolean bool = true && false; //1 bytes or 8 bits
        Boolean boolean1 = false;
        System.out.println(bool);

        short shot = 32767; //2 bytes or 16 bits
//        shot = bite;
        bite = (byte) shot;
        System.out.println(bite);
        char character = 'B'; //2 bytes or 16 bits

        int integer = -214748364; //4 bytes or 32 bits
        bite = (byte) integer;
        System.out.println(bite);
        float floater = 234445234F; //4 bytes or 32 bits

            double doubleNumber = 56444.60; //8 bytes or 64 bits
        integer = (int) (doubleNumber + doubleNumber);
        System.out.println(integer);
        long longNumber = 8999999999999999L; //8 bytes or 64 bits



    }

}
