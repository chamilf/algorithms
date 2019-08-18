public abstract class SortAlgorithm {

    abstract protected void sort(int[] array);

    protected void swap(int i, int j, int[] array) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
