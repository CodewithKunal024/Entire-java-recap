import java.util.Scanner;

public class insertAtDifferentpositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of positions you want to insert");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the numbers");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Displaying the original array");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        insertAtTheEnd(insertAtBegining(size,arr,5),10);
    }

    public static int[]  insertAtBegining(int size, int arr[], int newnumber) {
        int ar[] = new int[size + 1];
        ar[0] = newnumber;
        for (int i = 0; i < size; i++) {
            ar[i+1] = arr[i];
        }
        System.out.println("\nDisplaying the array after adding begining element");
        for(int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
   return ar;
    }
    public static void insertAtTheEnd( int arr[], int newnumber) {
        int atr[] = new int[arr.length + 1];
        atr[arr.length] = newnumber;
        for(int  i=0;i<arr.length;i++) {
            atr[i]=arr[i];
        }
        System.out.println("\nDisplaying the array after adding ending element");
        for(int i = 0; i < atr.length; i++) {
            System.out.print(atr[i] + " ");
        }
    }
}
// god job mr shaw