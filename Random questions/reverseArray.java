import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[5];
        int left=0;
        int right=arr.length-1;
        System.out.println("enter elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        while (left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
        }
        
    System.out.println("The reverse array is:");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]); 
    }
}

    
}
