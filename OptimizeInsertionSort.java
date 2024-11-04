
package arraytest;

import java.util.Arrays;

/**
 *
 * @author Nilusha Udayangani
 */
public class OptimizeInsertionSort {
    
    static Integer [] array = {76,6,107,92,21,23,5,9,8,1843};
    static int outerIndex;
    static int temp;

    public static int shift(int startIndex) {
        temp = array [startIndex];
        int i = startIndex;

        for(; i>0 && array [i-1] > temp; i--){
           array[i] = array[i-1];
            System.out.println("i:"+ i + ",j:" +(i-1) + "," +"Array State: " + Arrays.deepToString(array));
      
    }
   
return i;
    }

        public static void insert(int endIndex){
            int position = shift(endIndex);
            
            array[position] = temp;
            
            System.out.println("After i =" + outerIndex + "," + Arrays.deepToString(array));
        }
        
        public static void insertionSort(){
            for(outerIndex = 1; outerIndex < array.length; outerIndex++){
                insert(outerIndex);
            }
        }
            
            public static void main(String[] args){
                System.out.println("Arrays before Sorting:" + Arrays.deepToString(array));
                
                insertionSort();
                
                System.out.println("Arrays after Sorting:" + Arrays.deepToString(array));
                
            }

             
}
    

