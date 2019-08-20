public class InsertionSort extends SortAlgorithm {

    @Override
    protected void sort(int[] array) {

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int element = array[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; 0 < i && element < array[i-1]; i--) {
                array[i] = array[i-1];
            }
            array[i] = element;
        }
    }
}
