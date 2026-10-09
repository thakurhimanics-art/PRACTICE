import java.util.Arrays;
import java.util.HashSet;

public class intersection349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set=new HashSet<>();
        HashSet<Integer> resultSet=new HashSet<>();
        for(int x:nums1){
            set.add(x);
        }
        for(int x:nums2){
            if(set.contains(x)){
            resultSet.add(x);
        }
        }
        int [] result=new int[resultSet.size()];
        int i=0;
        for(int x:resultSet){
        result[i]=x;
            i++;
        }
        return result;
        
    }
    public static void main(String[] args) {
        int arr1[]={3,4,5,6,6};
        int arr2[]={3,2,1,1,6};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));

    }
}


    

