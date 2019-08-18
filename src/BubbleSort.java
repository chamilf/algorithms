public class BubbleSort extends SortAlgorithm {

    @Override
    protected void sort(int[] array) {

        for(int lastUnsortedIndex = array.length - 1; 0 < lastUnsortedIndex; lastUnsortedIndex--) {

            for(int i = 0; i < lastUnsortedIndex; i++) {

                if(array[i] > array[i +1]) {
                    swap(i, i+1, array);
                }
            }
        }
    }
}
