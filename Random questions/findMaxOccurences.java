//in single traversal only//
import java.util.Scanner;
public class findMaxOccurences {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter elements");
        for (int i=0; i<5;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int count=1;
        for (int i=1; i<5;i++){
            if(arr[i]>max){
                max=arr[i];
                count=1;
            }
            else if(arr[i]==max){
                count++;
            }   
        }
        System.out.println("the max element is ="+max + "\n its occurence is"+count);
    }
    
}
