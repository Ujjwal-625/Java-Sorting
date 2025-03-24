import java.util.Scanner;

public class BubbleSort {
    static void printArr(int [] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int [] arr){
        boolean swap=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[i]^arr[j];
                    arr[i]=arr[i]^arr[j];
                    swap=true;
                }
            }
            if(!swap){
                System.out.println("Already Sorted");
                return ;
                //already Sorted
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

        System.out.println("Before implementing Bubble Sort ");
        printArr(nums);

        bubbleSort(nums);

        System.out.println("After implementing bubble Sort ");

        printArr(nums);
    }
}
