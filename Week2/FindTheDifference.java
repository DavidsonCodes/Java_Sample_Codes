package Online_Code_Samples.Week2;

import java.util.Arrays;

public class FindTheDifference {

    public static char findTheDifference(String first, String second){
        char result = ' ';
        char[] firstWord = first.toCharArray();
        char[] secondWord = second.toCharArray();
        for( int i = 0; i < firstWord.length; i++ ){
            for( int j = 0; j < secondWord.length; j++ ){
                if( firstWord[i] == secondWord[j] ){
                    firstWord[i] = ',';
                    secondWord[j] = ',';

                    try{
                        Thread.sleep(3000);
                        System.out.println("Iteration " + (i+1));
                        System.out.println(Arrays.toString(firstWord));
                        System.out.println(Arrays.toString(secondWord));
                        System.out.println();
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());                    }
                    break;
                }
            }

        }
        for( char found : secondWord ){
            if( found != ','){
                result = found;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("aaaaee", "eaabaae"));
    }

}
