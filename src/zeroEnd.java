import java.util.*;
class zeroEnd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of terms");
        int n = sc.nextInt();
        int ar[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(ar[i] != 0){
                ar[count++]=ar[i];
            }}
            for(int j=count;j<ar.length-1;j++){
                ar[j]=0;
            }
        for(int j=0;j<n;j++){
            System.out.print(ar[j]+" ");
        }
    }
}

//tcs nqt coding question.
