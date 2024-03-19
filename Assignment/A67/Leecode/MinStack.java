package A67.Leecode;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-14-03
 */

class MinStack {
    int arr[];
    int top;
    public MinStack() {
        arr = new int[5];
        top = 0;
    }

    public void push(int val) {

        arr[top] = val;
        top = top +1;
    }

    public int pop() {
        top = top -1;
        return arr[top];
    }

    public int top() {
    return top;
    }

    public int getMin() {
        int min = arr[0];
        for(int i=1; i<top; i++){
            int val = pop();
            if(val < min){
                min = val;
            }
            System.out.println("c ="+val);
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(13);
        obj.push(4);
        obj.push(-3);
        obj.push(1);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
        System.out.println("param_3="+param_3);
        System.out.println("min="+param_4);

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
