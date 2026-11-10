class Solution{
    public boolean isPalindrome(int n){
        if (n<0){
            return false;
        }
        int original=n;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if (rev==original){
            return true;

        }else{
            return false;
        }

    }
}
