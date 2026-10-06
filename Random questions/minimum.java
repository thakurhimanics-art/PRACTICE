//WAP to find minimum element in an array//
import java.util.Scanner;
public class minimum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int x:arr){
            if(x<min){
                min=x;

            }
        }
        System.out.println("the minimum element is"+min);

    }
    
}
