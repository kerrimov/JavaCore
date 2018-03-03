package dz_5;

import java.util.Random;

public class QuickSort {
    public static int arr_length = 30;
    private static int[] array = new int[arr_length];
    public static Random random = new Random();

    public static void Add () {
        for (int i = 0; i < arr_length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static void Sort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int pivot = i - (i - j) / 2;
        while (i < j) {
            while (i < pivot && (array[i] <= array[pivot])) {
                i++;
            }
            while (j > pivot && (array[pivot] <= array[j])) {
                j--;
            }
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                if (i == pivot)
                    pivot = j;
                else if (j == pivot)
                    pivot = i;
            }
        }
        Sort(start, pivot);
        Sort(pivot + 1, end);
    }

    public static void Print() {
        for (int i = 0; i < arr_length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[arr_length - 1]);
    }

    public static void main(String[] args) {
        int start = 0;
        int end = arr_length-1;

        Add();
        Print();
        Sort(start, end);
        Print();
    }
}

