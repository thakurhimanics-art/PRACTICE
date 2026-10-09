import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class intersection350{

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> freq1=new HashMap<>();
        for (int x:nums1){
            freq1.put(x,freq1.getOrDefault(x,0)+1);
        }
        ArrayList <Integer> result=new ArrayList<>();
        for (int x:nums2){
            if(freq1.getOrDefault(x,0)>0){
                result.add(x);
                freq1.put(x,freq1.get(x)-1);
            }

        }
        int ans[]=new int[result.size()];
        for (int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr1[]={1,2,2,1};
        int arr2[]={2,2};
        System.out.println(Arrays.toString(intersect(arr1,arr2)));

    }
} 
    

