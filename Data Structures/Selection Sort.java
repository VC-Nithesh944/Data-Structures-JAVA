//Selection sorting has Worst, Average and Best case time complexity of O(n^2).

//Refer https://github.com/VC-Nithesh944/Data-Structures/blob/main/Sort%20Methods/Selection%20Sort.c for comments
import java.util.Scanner;
class Sort{
    public static void selection_sort(int[] arr,int n){
        for (int i = 0; i < n-1; i++){
            for (int j = i ; j < n ; j++){
                if ( arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void Print(int[] arr, int n){
        for (int i = 0 ; i < n ; i++){
            System.out.print(" " +arr[i]);
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        System.out.print("Enter the size of the array: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.print(String.format("Enter the %d element: ",i+1));
            arr[i] = new Scanner(System.in).nextInt();
        }
        System.out.println('\n');
        System.out.print("The Elements of the array before insertion sorting:" );
        Print(arr,n);
        selection_sort(arr,n);
        System.out.print("The Elements of the array after insertion sorting:");
        Print(arr,n);
    }
}
