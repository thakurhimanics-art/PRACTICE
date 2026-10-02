import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("enter elements");
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target");
        int target=sc.nextInt();
        boolean found=false;
        int index=-1;
        for(int i= 0;i<5;i++){
            if(arr[i]==target){
                found=true;
                index=i;
                break;
            }
        }
        if (found){
            System.out.println("element found at index" +index);
        }else{
            System.out.println("element not found");
        }
        


    }
}
