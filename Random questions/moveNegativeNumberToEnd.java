import java.util.Scanner;
public class moveNegativeNumberToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
           arr[i]=sc.nextInt();
        }
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]>=0)
                left++;
            else if(arr[right]<0)
                right--;
            else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }    
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        } 
    }
}
