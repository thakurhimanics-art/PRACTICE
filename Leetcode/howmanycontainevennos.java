class Solution {
    public int findNumbers(int[] nums) {
        int even_count=0;
        for (int i=0;i<nums.length;i++){
            int digit=0;
            int n=nums[i];
            while(n>0){
                n=n/10;
                digit++;
            }
            if (digit%2==0){
                even_count++;

            }
        }
        return even_count;
    }
}
