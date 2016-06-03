package generics;

import java.util.List;

/**
 * Created by mahendra.chhimwal on 5/26/2016.
 */
public class NumberCounter {
    public int countPrime(List<? extends Number> numbers) {
       int  totalCount =0;
        for (Number number : numbers){
            if(isPrime((int)number)){
                totalCount++;
            }
        }
        return totalCount;
    }


    private boolean isPrime(int n){
        if(n<1)
            return false;
        else if (n<=3)
            return true;
        else if (n %2 == 0 || n% 3==0)
            return false;
        int i = 5;
        while(i*i<=n){
            if(n % i == 0 || n% (i+2) ==0){
                return false;
            }
            i=i+6;
        }
        return true;
    }
}
