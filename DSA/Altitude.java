package DSA;

import java.util.*;

public class Altitude {
    public static void main(String[] args) {
        int[] arr = { -5, 1, 5, 0, -7 };
        int max = 0;
        int count = 0;
        /**
         * all numbers sum store in count and we are comparing that who is max count or max
         * ak ak value ko add krke count mai store kr denge 
         * aur count or max mai se jo bhi max value hn usko hum max mai store kr denge 
         * aur agar next count value greater hoti hn max se to hum use max mai store kr denge
         * agr count next value max nahi hn to max variable value he altitude hogi array ki 
         */        
        for (int a = 0; a < arr.length; a++) {
            count += arr[a];    
            max = Math.max(count, max);
        }
       System.out.println(max);
    }
}