import java.util.Arrays;

public class SelectionSort extends SortAlgorithm {

    @Override
    protected void sort(int[] array) {
        for(int lastUnsortedIndex = array.length - 1; 0 < lastUnsortedIndex; lastUnsortedIndex--) {

            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++) {

                if(array[largest] < array[i]) {
                    largest = i;
                }
            }
            swap(lastUnsortedIndex, largest, array);
        }
    }
}
