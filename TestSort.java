package sort;

import java.util.Arrays;

public class TestSort {

    public static int[] mergeSort(int[] arr, int L, int R) {
        if (L >= R) {
            int[] singleArr = {arr[L]};
            return singleArr;
        }
        int M = L + (R - L) / 2;
        int[] a1 = mergeSort(arr, L, M);
        int[] a2 = mergeSort(arr, M + 1, R);

        int i = 0, iL = 0, iR = 0;
        int n = a1.length + a2.length;
        int[] result = new int[n];

        while (iL < a1.length && iR < a2.length) {
            if (a1[iL] <= a2[iR]) {
                result[i++] = a1[iL++];
            } else {
                result[i++] = a2[iR++];
            }

        }
        while (iL < a1.length) {
            result[i++] = a1[iL++];

        }
        while (iR < a2.length) {
            result[i++] = a2[iR++];
        }
        return result;
    }

    static void main() {
        int[] arr = {2, 1, 3, 2, 1, 3, 2, 1};
        arr = mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
