
public class D0220_155 {
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    public static void main(String[] args){
        MinStack obj = new MinStack();
        /*
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        int param_4 = obj.getMin();
        System.out.println(param_4);
        obj.pop();
        int param_3 = obj.top();
        System.out.println(param_3);
        int param_5 = obj.getMin();
        System.out.println(param_5);*/
        obj.push(512);
        obj.push(-1024);
        obj.push(-1024);
        obj.push(512);
        obj.pop();
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());
    }
}
