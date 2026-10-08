
import java.util.ArrayList;
import java.util.HashSet;

public class removeduplicate {
    public static ArrayList<Integer> remDuplicate(int arr[]) {
        HashSet<Integer> set= new HashSet<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int x:arr){
            if(!set.contains(x)){
                set.add(x);
                result.add(x);
            }
            
        }
        return result;
        
    }
    public static void main(String[] args) {
        int arr1[]={3,4,5,3,4};
        System.out.println(remDuplicate(arr1));
        
    }
} 
