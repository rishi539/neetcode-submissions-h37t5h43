class KthLargest {
    PriorityQueue<Integer> minHeap;
    int k;

    public KthLargest(int k, int[] nums) {
        this.minHeap= new PriorityQueue<>();
        this.k=k;
        for(int num: nums){
            minHeap.offer(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return;
        
    }
    
    public int add(int val) {
        minHeap.add(val);
       while(minHeap.size()>k){
        minHeap.poll();
       }
       return minHeap.peek();
        
    }
}
