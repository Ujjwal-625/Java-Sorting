import java.util.Scanner;

public class HeapSort {

    static void printArr(int [] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void heapify(int [] arr,int n,int i){
        int l=2*i+1;
        int r=2*i+2;
        int p=i;

        if(l<n && arr[l] > arr[p]){
            p=l;
        }

        if(r<n && arr[r] > arr[p]) {
            p=r;
        }

        if(p!=i){
            arr[i]=arr[p]^arr[i];
            arr[p]=arr[p]^arr[i];
            arr[i]=arr[p]^arr[i];
            heapify(arr,n,p);
        }
    }

    static void heapSort(int [] arr,int n){

        //creating max heap

        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }

        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0)  ;
        }
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

        System.out.println("Before implementing Quick Sort ");
        printArr(nums);

        //qs(nums,0,nums.length-1);

        heapSort(nums,nums.length);

        System.out.println("After implementing Quick Sort ");

        printArr(nums);
    }

}
