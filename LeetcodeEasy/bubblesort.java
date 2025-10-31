import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if out of order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("------------------------");
        }

        System.out.print("Bubble sorted array: ");
        for (int n : arr) System.out.print(n + " ");

    }
}
