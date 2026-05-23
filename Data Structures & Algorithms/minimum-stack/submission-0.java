class MinStack {
    private Stack<Integer> st;
    public MinStack() {
        st=new Stack<>();
    }
    public void push(int val) {
        st.push(val);  
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer> temp=new Stack<>();
        int mini=Integer.MAX_VALUE;
        while(!st.isEmpty()){
            int num=st.pop();
            mini=Math.min(mini,num);
            temp.push(num);
        }
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return mini;

    }
}
