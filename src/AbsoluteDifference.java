import java.util.*;
class AbsoluteDifference{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int ar[]=new int[10];
    for(int i=0;i<10;i++){
        ar[i]=sc.nextInt();
    }
    int size=ar.length;
    int pos=sc.nextInt();
    AbsoluteDifference(ar,pos,size);
    }
public static int AbsoluteDifference(int ar[],int pos,int size) {
    int sum=0;
    for (int i = pos; i < size-1; i--) {
        sum = sum+Math.abs(ar[i] - ar[i + 1]);
    }
return sum;
    }
}