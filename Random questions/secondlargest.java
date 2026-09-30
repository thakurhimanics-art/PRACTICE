import java.util.Scanner;
public class secondlargest {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("enter elements");
    for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
    }
    int largest=Integer.MIN_VALUE;
    int second_largest=Integer.MIN_VALUE;
    for(int i=0;i<5;i++){
        if(arr[i]>largest){
            second_largest=largest;
            largest=arr[i];
        }
        else if(arr[i]>second_largest && arr[i]!=largest ) {
            second_largest=arr[i];
            

        }
        
    }
    System.out.println("the largest and secondlargest element is:"+largest+"\n" +second_largest);
}
    
}
