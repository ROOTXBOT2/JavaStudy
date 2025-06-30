package Algorhythm.Sort;

/**
 * @author rua
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] lists = {6,4,3,7,1,8,9};

        for (int i = 0; i < lists.length; i++ ) {
            for (int j = lists.length - 1; j > i; j--) {
                if ( lists[j] < lists[j-1]){
                    int temp = lists[j];
                    lists[j] = lists[j-1];
                    lists[j-1] = temp;
                }
            }
        }
        for (int N :lists) {
            System.out.print(N);
        }
    }
}
