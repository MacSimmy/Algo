package puzzles;

/**
 * Created by mahendra.chhimwal on 6/1/2016.
 */
public class ArrayUtil {
    public static int findSecondMax(int[]array){
        int firstMax =0;
        int secondMax = 0;
        if(array != null && array.length>=2){
            if(array[0]>array[1]){
                firstMax = array[0];
                secondMax = array[1];
            }else {
                firstMax = array[1];
                secondMax = array[0];
            }


            for (int i=2;i<array.length;i++){
                if(array[i]>firstMax){
                    secondMax = firstMax;
                    firstMax = array[i];
                }else if(array[i]>secondMax){
                    secondMax = array[i];
                }
            }
        }
        return secondMax;
    }
}
