class Solution {
    public int[] countBits(int n) {
        int[] output=new int[n+1];
        
        for(int i=0;i<=n;i++){
            output[i]=hammingWeight(i);
            
        }
        return output;
        
    }
     public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += (n & 1) == 1 ? 1 : 0;
            n >>= 1;
        }
        return res;
    }
}
