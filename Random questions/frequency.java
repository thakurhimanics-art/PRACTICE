//frequency of every element in array using HASHMAP//
import java.util.HashMap;
import java.util.Scanner;

public class frequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("enter elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap <Integer,Integer> freq =new HashMap<>();
        for(int x:arr){
        freq.put(x,freq.getOrDefault(x,0)+1);
        }
        System.out.println(freq);

    }
}
