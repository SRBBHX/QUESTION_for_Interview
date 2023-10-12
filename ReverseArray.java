
// Reverse the array useing a new array.

// Traverse the array form back side and insert each element in a new array

import java.util.Scanner;
public class ReverseArray{
        public static void main(String[] args) {
            System.out.println("Enter the length of the array");   
            Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             int[] arr= new int[n];
             System.out.println("Enter array");
             for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
             }

             Reverse(arr);

        }


        public static void Reverse(int[] arr){
                int n=arr.length;
                int[] ans =new int[n];
                int j=0;
                for (int i = n-1; i >=0; i--) {
                        ans[j++]=arr[i];
                }
                for (int i : ans) {
                        System.out.print("Reverse of the array:"+ i + " ");
                }
        }
}