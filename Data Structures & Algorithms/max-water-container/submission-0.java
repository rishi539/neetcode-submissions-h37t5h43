class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        for(int i=0;i<heights.length;i++){
            
            for(int j=heights.length-1;j>=0;j--){
            if(i>=j)break;
            int min=Math.min(heights[i],heights[j]);
            int area=min*(j-i);
            max=Math.max(max,area);
            




            
            }
        }
        return max;
        
    }
}
