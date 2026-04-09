class Solution {
    public int minEatingSpeed(int[] piles, int ho) {
        int l=1;
        int h=Arrays.stream(piles).max().getAsInt();
        int ans=0;
        while(l<=h){
            int mid=(l+h)/2;
            int total=0;
            for(int i:piles){
                total+=Math.ceil((double)i/mid);

            }
            if(total<=ho){
                ans=mid;
                h=mid-1;

            }else{
                l=mid+1;
            }
        }
        return ans;
        
    }
}
