//Insertion sorting has worst and average time complexity of O(n^2).
//But has the Best Time Complexity as O(n) when all the elements are in ascending order.
//And no Additional changes in the code is needed to make it O(n).

//Refer to https://github.com/VC-Nithesh944/Data-Structures/blob/main/Sort%20Methods/Insertion%20Sort.c for comments.

import java.util.Scanner;
class Sort{
    public static void insertion_sort(int[] arr,int n){
        for (int i = 0; i < n; i++){
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void Print(int[] arr, int n){
        for (int i = 0 ; i < n ; i++){
            System.out.print(" " +arr[i]);
        }
        System.out.println();
    }
    
    public static void main(String args[]){                            //Key takeaways:
        System.out.print("Enter the size of the array: ");             // 1.Cannot concatenate void return type with strings
        int n = new Scanner(System.in).nextInt();                      // 2.Don't follow Scanf("%d") for reading elements in Java
        int[] arr = new int[n];                                        // 3.Array are always declared in different kind in java
        for (int i = 0 ; i < n ; i++){
            System.out.print(String.format("Enter the %d element: ",i+1));
            arr[i] = new Scanner(System.in).nextInt();
        }
        System.out.println('\n');
        System.out.print("The Elements of the array before insertion sorting:" );
        Print(arr,n);
        insertion_sort(arr,n);
        System.out.print("The Elements of the array after insertion sorting:");
        Print(arr,n);
    }
}
