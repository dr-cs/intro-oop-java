import java.util.Arrays;

public class Sort {

    public static void insertionSort(Comparable[] a) {
        for (int j = 1; j < a.length; ++j) {
            assert isSorted(a, 0, j - 1);
            Comparable key = a[j];
            int i = j - 1;
            while(i >= 0 && (a[i].compareTo(key) > 0)) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = key;
        }
    }

    public static void quickSort(Comparable[] a) {
        qs(a, 0, a.length - 1);
    }

    private static void qs(Comparable[] a, int begin, int end) {
        if ((end - begin) <= 1) { // Base case: nothing to sort
            return;
        }
        int pivot = partition(a, begin, end);
        qs(a, begin, pivot);
        qs(a, pivot + 1, end);
    }

    private static int partition(Comparable[] a, int begin, int end) {
        int size = end - begin;
        Comparable[] temp = new Comparable[size];
        Comparable pivotValue = a[size/2];
        int i = begin - 1;
        for (int j = begin; j <= size - 1; j++) {
            if (a[j].compareTo(pivotValue) <= 0) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, size - 1);
        return i + 1;
    }

    private static void swap(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }


    // private static int split(Comparable[] a, int begin, int end) {
    //     int size = end - begin + 1;
    //     Comparable[] temp = new Comparable[size];
    //     Comparable pivotValue = a[begin];
    //     int up = 0;
    //     int down = size - 1;

    //     for (int i = begin + 1; i <= end; i++) {
    //         if (a[i].compareTeo(splitValue) <= 0) {
    //             temp[up] = a[i];
    //             up++;
    //         } else {
    //             temp[down] = a[i];
    //             down--;
    //         }
    //     }
    //     temp[up] = a[begin];


    // }

    private static boolean isSorted(Comparable[] array, int start, int end) {
        for (int i = start; i < end; ++i) {
            if (!(array[i].compareTo(array[i + 1]) < 0))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] a = {5, 2, 4, 6, 1, 3};
        System.out.println("Unsorted aray: " + Arrays.toString(a));
        quickSort(a);
        System.out.println("Sorted aray: " + Arrays.toString(a));
    }

}
