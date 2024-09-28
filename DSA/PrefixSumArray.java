package DSA;

public class PrefixSumArray {
    public static void main(String[] args){
        int[] arr = {2, 3, 7, 5};
        int i = 3;
        int prefix = 0;
        for(int a = 0; a<=i; a++){
            prefix += arr[a];
        }
        System.out.println(prefix);
    }
}
