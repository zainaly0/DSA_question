package DSA;
public class GoodFirst{
    public static void main(String[] args){
        // good first
        int[] arr ={ 1, 2, 3, 2, 1, 1, 3};
        // int[] arr ={ 1, 1, 1, 1};

        int num = 0;
        for(int a = 0; a<arr.length; a++){
            for(int b = 0; b<arr.length; b++){
                if(arr[a] == arr[b] && a < b){
                // if(arr[a] == arr[b] && a != b){ // iss case mai yeh phle ulta check krke bhi value ko return krr dega, repetance of value
                num++;
                    System.out.println(a+ " and " + b);

                }
            }
        }
        System.out.println(num);

    }
}