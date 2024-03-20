package org.example.strategie;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2};
        SortContext context = new SortContext();

        // Utilisation de BubbleSort
        context.setStrategy(new BubbleSort());
        context.sortArray(array);

        // Utilisation de QuickSort
        context.setStrategy(new QuickSort());
        context.sortArray(array);

        // Utilisation de MergeSort
        context.setStrategy(new MergeSort());
        context.sortArray(array);
    }
}
