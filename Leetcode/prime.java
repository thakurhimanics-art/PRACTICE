public class Solution{
    public boolean prime(int n){
        if(n<=1){
            return false;
        }
        for (i=2;i*i<=n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
