class MinStack {

    Stack<Integer> dataStack ;

    Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (!dataStack.empty()&&!minStack.empty()){
            dataStack.push(x);
            int currentMin = minStack.peek();
            if (x<currentMin){
                minStack.push(x);
            }else {
                minStack.push(currentMin);
            }
        }
        else {
            dataStack.push(x);
            minStack.push(x);
        }

    }

    public void pop() {
        if (!dataStack.empty()){
            dataStack.pop();
            minStack.pop();
        }
    }

    public int top() {
        if (!dataStack.empty()){
            return dataStack.peek();
        }
        return 0;
    }

    public int getMin() {
        return minStack.peek();
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