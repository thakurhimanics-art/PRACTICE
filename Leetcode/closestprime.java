class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime=new boolean[right+1];
        for(int i=2;i<=right;i++){
            isPrime[i]=true;
        }
        for(int i=2;i*i<=right;i++){
            if(isPrime[i]==true){
                for(int j=i*i;j<=right;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        ArrayList <Integer> primes= new ArrayList<>();
        for(int i=left; i<=right;i++){
            if(isPrime[i]==true){
                primes.add(i);
            }
        }
        if(primes.size()<2){
            return new int [] {-1,-1};

        }
        int mindiff=Integer.MAX_VALUE;
        int num1=-1;
        int num2=-1;

        for(int i=1; i<primes.size();i++){
            int prev=primes.get(i-1);
            int curr=primes.get(i);
            int diff=curr-prev;
        
        if(diff<mindiff){
            mindiff=diff;
            num1=prev;
            num2=curr;
        }
        }
        return new int[]{num1,num2};
    }
}