import java.util.Scanner;
public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int slow=0;
        for(int fast=1;fast<arr.length;fast++){
            if(arr[fast]!=arr[slow]){
                slow++;
                arr[slow]=arr[fast];
            }
        }
        int uniquecount=slow+1;
        System.out.println("the unique elements are"+uniquecount);
        System.out.println("the array containing unique elements is:");
        for(int i=0;i<uniquecount;i++){
            System.out.println(arr[i]);
        }
    }
    
}
