class MinStack {
    Stack<Integer> s;
    int min=Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
        s = new Stack<Integer>();
    }
    
    public void push(int x) {
        s.push(x);
        min=Math.min(min,x);
    }
    
    public void pop() {
        s.pop();
        int newmin=Integer.MAX_VALUE;
        for(int i:s){
            newmin=Math.min(newmin,i);
        }
        min=newmin;
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */