class MinStack {
    ArrayList<Integer> ls= new ArrayList<>();
    int top;
    public MinStack() {
        top=0;
    }
    
    public void push(int val) {
        ls.add(val);
        top++;
    }
    
    public void pop() {
        ls.remove(top-1);
        top--;
    }
    
    public int top() {
        return ls.get(top-1);
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int x: ls)
        {
            if(x<min)
            min=x;
        }
        return min;
    }
}
