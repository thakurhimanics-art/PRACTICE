import java.util.HashMap;

public class majorityEle169 {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> freq=new HashMap<>();
        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
            if (freq.get(x)>nums.length/2){
                return x;
            }
        }
        return -1;
        
    }
} 