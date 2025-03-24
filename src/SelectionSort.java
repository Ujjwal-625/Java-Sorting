import java.util.Scanner;

public class SelectionSort {

    static void printArr(int [] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void selectionSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                //swap needed
                arr[i]=arr[i]^arr[minIndex];
                arr[minIndex]=arr[i]^arr[minIndex];
                arr[i]=arr[i]^arr[minIndex];
            }
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

        System.out.println("Before implementing Selection Sort ");
        printArr(nums);

        selectionSort(nums);

        System.out.println("After implementing Selection Sort ");

        printArr(nums);
    }
}
