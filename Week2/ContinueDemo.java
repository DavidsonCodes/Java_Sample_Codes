package Online_Code_Samples.Week2;

public class ContinueDemo {
    public static void main(String[] args) {
        for( int i = 1; i <= 25; i++ ){
            if( i%4 == 0)
                continue;
            System.out.println(i);
        }
    }
}
