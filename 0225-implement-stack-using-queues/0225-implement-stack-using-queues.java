class MyStack {
       Queue < Integer > q = new LinkedList < > ();

    public MyStack() {
        
    }
    
    public void push(int x) {
         q.add(x);//1 2 3 
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());//3 2 1
            //remove from front and add to to the back becox in stack back se mtlb last me add hota h
    }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */