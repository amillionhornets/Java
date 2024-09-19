public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {23, 1, 10, 5, 2};  
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int count = i - 1;
            while (count >= 0 && arr[count] > key) {
                arr[count + 1] = arr[key];
                count--;
            }
            arr[count+1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}