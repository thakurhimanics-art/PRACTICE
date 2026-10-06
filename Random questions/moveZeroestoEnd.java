import java.util.Scanner;
public class moveZeroestoEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
            
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        System.out.println("the revised array is:");   
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
