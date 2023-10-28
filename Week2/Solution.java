package Online_Code_Samples.Week2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public int getHighestNumber(List<int[]> list){
        Comparator<Integer> comparator = (a,b) -> b - a;
        for( int[] array : list){
            Arrays.sort(array);
        }
        int listIndex = 0;
        int[] controlArray = list.get(listIndex++);
        while( list.size()-1 >= listIndex){
            if( controlArray == list.iterator().next())
                continue;
            int[] arrayWithin = list.get(listIndex++);

        }
        return 0;
    }

}
