import java.util.*;
public class ArrayRev {
    public static void arrayRevrec(int start, int end , int ar[]){
        int temp=0;
        if(start<end){
            temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            arrayRevrec(start+1, end-1, ar);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Displaying the array elements");
        for (int i = 0; i < size; i++) {
            System.out.print(ar[i] + " ");
        }
        int temp=0;
        int i;
        int j = ar.length - 1;
        for (i = 0; i < size / 2; i++) {
            temp=ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            j--;
        }
        System.out.println("\nDisplay Reverse of the array elements");
        for ( i = 0; i < size; i++) {
            System.out.print(ar[i] + " ");
        }
        arrayRevrec(0,size-1,ar);
            System.out.println("\nDisplay Reverse of the array elements");
            for ( i = 0; i < size; i++) {
                System.out.print(ar[i] + " ");
        }
    }

}
//good job shaw
