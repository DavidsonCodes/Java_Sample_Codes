package Online_Code_Samples.Week1;

public class IncrementalDemo {
    public static void main(String[] args) {

        int count = 1;

        System.out.println(++count + count++);
        System.out.println(count);

        System.out.println(++count + (--count + count--));
        System.out.println(count);
    }
}
