//checking whether the given array is a circular array
// 
import java.util.Scanner;
public class rotatedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        int n=arr.length;
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<7;i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;

            }
        }
        boolean result=count<=1;
        System.out.println("the array is sorted n rotated" +" " +result);
    }
    
    
}
