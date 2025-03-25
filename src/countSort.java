import java.util.Scanner;

public class countSort {

    static void printArr(int [] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void countSort(int [] arr,int k){
        int [] countFreq=new int[k];

        for(int i=0;i<arr.length;i++){
            countFreq[arr[i]]++;
        }

        int index=0;
        for(int i=0;i<k;i++){
            while(countFreq[i]>0){
                arr[index++]=i;
                countFreq[i]--;
            }
        }
    }


    public static void main(String [] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the maximum element of the array");
        int k= scanner.nextInt()+1;

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Before implementing Count Sort ");
        printArr(nums);

        //qs(nums,0,nums.length-1);

        countSort(nums,k);

        System.out.println("After implementing Count Sort ");

        printArr(nums);
    }

}
