import java.util.Scanner;

public class InsertionSort {

    static void printArr(int [] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void insertionSort(int [] arr){
        int j=0;
        while(j<arr.length-1){
            int i=j+1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Before implementing Insertion Sort ");
        printArr(nums);

        insertionSort(nums);

        System.out.println("After implementing Insertion Sort ");

        printArr(nums);
    }
}
