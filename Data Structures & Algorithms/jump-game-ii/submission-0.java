class Solution {
    public int jump(int[] nums) {
        int l=0;
        int r=0;
        int far=0;
        int jump=0;
        while(r<nums.length-1){
            for(int i=l;i<=r;i++){
                far=Math.max(i+nums[i],far);
            }
            jump+=1;
            l=r+1;
            r=far;

        }
        return jump;
        
    }
}
