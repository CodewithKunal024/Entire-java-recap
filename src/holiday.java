import java.util.*;
class holiday{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        String ar[]={"mon","tues","wed","thu","fri","sat","sun"};
        int i;
        for(i=0;i<ar.length;i++) {
            if (ar[i].equals(str))
                break;
        }
        int remaining=6-i;
        int count=1;
        n=n-remaining;
        if(n>0){
            count+=n/7;
        }
        System.out.println(count);
    }
}