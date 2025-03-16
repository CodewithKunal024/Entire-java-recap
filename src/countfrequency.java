import java.util.*;
class countfrequency{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        frequency(ar,size);
    }
    public static void frequency(int ar[], int size){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            if(map.containsKey(ar[i])){
                map.put(ar[i],map.get(ar[i])+1);
            }
            else {
                map.put(ar[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        }
    }
