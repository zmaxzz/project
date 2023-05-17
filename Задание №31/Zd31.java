import java.math.BigInteger;
import java.util.*;

public class Zd31 {

    public static void main(String[] args){
        fibonacci(100);
    }
    public static void fibonacci(int n){
        if( 10 <= n && n <= 100000){

            BigInteger x = BigInteger.ONE;
            BigInteger y = BigInteger.ONE;
            BigInteger z = BigInteger.ONE;
            for (int i = 2; i < n;i++) {
                z = x.add(y);
                y = x;
                x = z;
            }
            System.out.println(x);
            int[] int1 = String.valueOf(x).chars().map(Character::getNumericValue).toArray();
            HashMap<Integer, Integer> counting = new HashMap<>();
            for(int j : int1) {
                if (counting.containsKey(j)){
                    counting.put(j, counting.get(j) + 1);
                }else{
                    counting.put(j, 1);
                }
            }
            int maxKey = 0;
            int maxVal = 0;
            for (Map.Entry<Integer, Integer> couples : counting.entrySet()) {
                if(couples.getValue() > maxVal){
                    maxVal = couples.getValue();
                }
                if(couples.getValue() == maxVal){
                    maxKey = couples.getKey();
                }
            }
            System.out.println(maxKey + " " + maxVal);
        }

    }
}