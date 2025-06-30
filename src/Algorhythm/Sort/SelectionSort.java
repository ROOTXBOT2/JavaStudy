package Algorhythm.Sort;

/**
 * @author rua
 */
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,6,2,3,4,7,8,1};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                    count++;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            for (int N : arr){
                System.out.print(N+" ");
            }
            System.out.println(" ");

        }
    }
}
