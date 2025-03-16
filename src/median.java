import java.util.*;
class median{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        double ar[]= new double[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("The median is");
        System.out.println(median(ar));
    }
    public static double median(double ar[]){
        int length=ar.length;
        Arrays.sort(ar);
        double median;
    if(length%2==0){
        median= (ar[(length/2)-1]+ar[(length/2)])/2;
    }
    else{
        median=ar[((length+1)/2)-1];
    }
return median;
    }
}
