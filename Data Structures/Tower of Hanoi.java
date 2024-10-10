import java.util.Scanner;

class HelloWorld {
    public static void ToH(int n, char a, char b, char c){                //We get 2^n - 1 moves for this program
        if (n==1){
            System.out.println(String.format("Move Disk %d from Rod %c to Rod %c",n,a,c));
            return;
        }
        ToH(n-1,a,c,b);                                                   //move a to b using c according to base case
        System.out.println(String.format("Move Disk %d from Rod %c to Rod %c",n,a,c));
        ToH(n-1,b,a,c);                                                   //move b to c using a according to base case
    }
    
    public static void main(String args[]){
        System.out.print("Enter the number of Disks in ToH: ");
        int n = new Scanner(System.in).nextInt();                         // anonymous object declaration 
        ToH(n,'A','B','C');
    }
    
}
