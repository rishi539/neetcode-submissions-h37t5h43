class MinStack {
       Stack<Integer> st;
       Stack<Integer> min;
    public MinStack() {
        st=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(!min.isEmpty()&&min.peek()<val){
            min.push(min.peek());}
        else{
            min.push(val);
        }
        return;
    }
    
    public void pop() {
        if(st.isEmpty())return;
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        
    }
}

