import java.util.*;

public class QuickSort {
    static void printArr(int [] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j]> pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        int temp = arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }

    static void qs(int [] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }


    public static int [] quickSort(int [] arr) {
        // Write your code here.
        qs(arr, 0, arr.length - 1);
        return arr;
    }

    public static void main(String [] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Before implementing Merge Sort ");
        printArr(nums);

        qs(nums,0,nums.length-1);

        System.out.println("After implementing Merge Sort ");

        printArr(nums);
    }

}