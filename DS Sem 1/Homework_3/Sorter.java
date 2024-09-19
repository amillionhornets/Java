import java.util.Arrays;
import java.util.Stack;
public class Sorter implements GodricsHat {
    public void insertion ( int [] array ){
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int count = i - 1;
            while (count >= 0 && array[count] > key) {
                array[count + 1] = array[count];
                count--;
            }
            array[count+1] = key;
        }
    }
    public void merge ( int [] array ){
        if(array.length<=1){
            return;
        }
        int[] left = new int[array.length/2];
        int[] right = new int[array.length - left.length];
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, left.length, right, 0, right.length);
        merge(left);
        merge(right);
        int i=0; 
        int li = 0; 
        int ri = 0;
        for( i = 0; i < array.length; i++){
            if (li > left.length -1){
                array[i] = right[ri++];
            } else if (ri > right.length -1){
                array[i] = left[li++];
            } else if (left[li] <= right[ri]){
                array[i] = left[li++];
            } else {
                array[i] = right[ri++];
            }
        }
        // Arrays.sort(array);
    } // use recursion only
    public void quick ( int [] array , int p , int r){
        if (p < r){
            int x = array[r];
            int i = p - 1;
            for(int j = p; j < r; j++){
                if(array[j] < x){
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            int temp = array[i + 1];
            array[i + 1] = array[r];
            array[r] = temp;
            int q = i + 1;
            quick(array, p, q-1);
            quick(array, q+1, r);
        }
    }
    public void quickLoopy ( int [] array ){
        // Start a stack to store indexs
        Stack<Integer> quickLoopyStack = new Stack<>(); 
        // r is the end element of the arr
        int r = array.length - 1;
        // p is the start element
        int p = 0;
        
        quickLoopyStack.push(p);
        quickLoopyStack.push(r);
        while(!quickLoopyStack.isEmpty()){
            // Partition Section
            r = quickLoopyStack.pop();
            p = quickLoopyStack.pop();
            int x = array[r];
            int i = p - 1;
            for(int j = p; j < r; j++){
                if(array[j] < x){
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            int temp = array[i + 1];
            array[i + 1] = array[r];
            array[r] = temp;
            int q = i + 1;
            // Partition Section
            if(q-1 > p){ // Check the left side for me elements
                quickLoopyStack.push(p);
                quickLoopyStack.push(q-1);
            }
            if(q+1 < r){ // Check the right side for more elements
                quickLoopyStack.push(q+1);
                quickLoopyStack.push(r);
            }
        }
        
        // Arrays.sort(array);
    }
    public void counting ( int [] array ){
        int i = 0, j = 0, k = 0, max = Integer . MIN_VALUE ;
        for (i = 0; i < array.length; i++)
            max = array[i] > max ? array[i] : max;
        int [] counts = new int[max + 1];
            for (i = 0; i < array.length; i++)
                counts[array[i]]++;
        for (i = 0; i < counts.length; i++)
            for (j = 0; j < counts[i]; j++)
            array[k++] = i;
    }
}
