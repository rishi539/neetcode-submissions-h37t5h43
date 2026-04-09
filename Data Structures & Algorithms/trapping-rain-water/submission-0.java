class Solution {
    public int trap(int[] heights) {
        int l=0;
        int r=heights.length-1;
       int  leftmax=heights[l];
       int  rightmax=heights[r];
        int res=0;
        while(l<r){
            if(leftmax<rightmax){
            l++;
            leftmax=Math.max(leftmax,heights[l]);
            res+=leftmax-heights[l];
            }
            else{
                r--;
                rightmax=Math.max(rightmax,heights[r]);
                res+=rightmax-heights[r];
            }
        }
        return res;

        
    }
}
