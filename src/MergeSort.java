import java.util.Scanner;

public class MergeSort {
    static void printArr(int [] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void mergeSort(int [] num,int l,int r){
        if(l>=r){
            return ;
        }

        int m=l+(r-l)/2;
        mergeSort(num, l, m);
        mergeSort(num, m+1, r);
        merge(num,l,m,r);
    }

    static void merge(int [] arr,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;

        int [] arr1=new int[n1];
        int [] arr2=new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i]=arr[i+l];
        }
        for(int i=0;i<n2;i++){
            arr2[i]=arr[i+m+1];
        }

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(arr1[i] <arr2[j]){
                arr[k++]=arr1[i++];
            }
            else{
                arr[k++]=arr2[j++];
            }
        }

        while(i<n1){
            arr[k++]=arr1[i++];
        }
        while(j<n2){
            arr[k++]=arr2[j++];
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

        System.out.println("Before implementing Merge Sort ");
        printArr(nums);

        mergeSort(nums,0,nums.length-1);

        System.out.println("After implementing Merge Sort ");

        printArr(nums);
    }
}
