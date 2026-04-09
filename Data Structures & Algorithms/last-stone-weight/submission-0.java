class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> mp=new PriorityQueue<>(Collections.reverseOrder());
        for(int st:stones){
         mp.offer(st);
        }
        while(mp.size()>1){
            int first=mp.poll();
            int sc=mp.poll();
            if(first>sc){
                mp.offer(first-sc);
            }
        }
        return (mp.size()==0)?0:mp.peek();
        
    }
}
