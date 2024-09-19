public class mergSort {
    
    public static void main(String[] args) {
        int[] arr = {23, 1, 10, 5, 2};  
        merge(arr);
    }
    public static void merge(int [] arr){
        if(arr.length<=1){
            return;
        }
        int[] left = new int[arr.length/2];
        int[] right = new int[arr.length - left.length];
        System.arraycopy(arr, 0, left, 0, left.length);
        System.arraycopy(arr, left.length, right, 0, right.length);
        merge(left);
        merge(right);
        for( int i = 0; i < arr.length; i++){
            
        }
    }
}