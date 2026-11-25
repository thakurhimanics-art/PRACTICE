class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentstreak=0;
        int maxstreak=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==1){
                currentstreak++;
                if(currentstreak>maxstreak){
                    maxstreak=currentstreak;
                }
            }else{
                currentstreak=0;
            }
     

        }
        return maxstreak;
        
    }
}
