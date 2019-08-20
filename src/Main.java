import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {100, 20, -1, 30, -20, 80};

        SortAlgorithm sortAlgorithm = null;

        //sortAlgorithm = new BubbleSort();
        //sortAlgorithm = new SelectionSort();
        sortAlgorithm = new InsertionSort();

        sortAlgorithm.sort(array);

        Arrays.stream(array).forEach(System.out::println);
    }
}
