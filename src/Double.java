import java.util.Scanner;
public class Double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size:");
        int size=sc.nextInt();
        int ar[]=new int[10];
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Arranging the array in reverse order :");
        for(int i=0;i<size/2;i++){
            System.out.print(ar[i]+" ");
            }
        for(int i=size-1;i>=size/2;i--){
            System.out.print(ar[i]+" ");
        }
        }
    }
