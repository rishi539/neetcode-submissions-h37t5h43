class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        int m=n;
        n=Math.abs(n);
        while(n>0){
            if(n%2==1){
                ans*=x;
                n=n-1;
            }else{
                x=x*x;
                n=n/2;
            }
        }
        return (m>0)?ans:1/ans;
        
    }
}
