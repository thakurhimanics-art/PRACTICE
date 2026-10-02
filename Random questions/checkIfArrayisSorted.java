import java.util.Scanner;
public class checkIfArrayisSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter elements");
        for(int i =1;i<5;i++){
            arr[i]=sc.nextInt();
        }
        boolean sorted=true;
        for(int i=1;i<5;i++){
            if(arr[i]<arr[i-1]){
                sorted=false;
                break;
            }

        }
        System.out.println("array is sorted"+ " "+sorted);
    }

}
