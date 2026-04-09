class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] cnt=new int[26];
        for(char t:tasks){
            cnt[t-'A']++;
        }
        PriorityQueue<Integer> mp=new PriorityQueue<>(Collections.reverseOrder());
        for(int c:cnt){
            if(c>0)mp.add(c);
        }
        Queue<int[]> q=new LinkedList<>();
        int time=0;
        while(!mp.isEmpty()||!q.isEmpty()){
            time++;
             if (mp.isEmpty()) {
                time = q.peek()[1];
            }
            else{
                int ct=mp.poll()-1;
                if(ct>0)q.add(new int[]{ct,time+n});
            }
            if(!q.isEmpty() && time==q.peek()[1]){
                mp.add(q.poll()[0]);
            }
        }
       return time;

    }
}
