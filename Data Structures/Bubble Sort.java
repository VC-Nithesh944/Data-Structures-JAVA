// Bubble sort has the Worst, Average case Time Complexity of O(n^2)
//But has the Best case Time Complexity of O(n) when all elements are in ascending order.
//Some Alteration to the code needs to made in order to achieve O(n).

//Refer https://github.com/VC-Nithesh944/Data-Structures/blob/main/Sort%20Methods/Bubble%20Sort.c for comments.
import java.util.Scanner;
class Sort{
    public static void bubble_sort(int[] arr,int n){
        boolean swapped = false;
        for (int i = 0; i < n-1; i++){
            for (int j = 0 ; j < n-1 ; j++){
                if ( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
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
        bubble_sort(arr,n);
        System.out.print("The Elements of the array after insertion sorting:");
        Print(arr,n);
    }
}
