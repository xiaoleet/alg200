import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int val) {
        st.add(val);
        if (minSt.isEmpty() || val < minSt.peek()) {
            minSt.add(val);
        }
    }

    public void pop() {
        if(!st.isEmpty()){
            int val = st.peek();
            if (val == minSt.peek()) minSt.pop();
            st.pop();
        }
    }
//    public void push(int val) {
//        st.add(val);
//        if (!minSt.isEmpty() && val > minSt.peek()) {
//            Stack<Integer> backSt = new Stack<>();
//            while (!minSt.isEmpty() && val > minSt.peek()) {
//                backSt.add(minSt.pop());
//            }
//            minSt.add(val);
//            while (!backSt.isEmpty()) {
//                minSt.add(backSt.pop());
//            }
//        }else if(minSt.isEmpty() || val<=minSt.peek() ){
//            minSt.push(val);
//        }
//    }

//    public void pop() {
//        if(!st.isEmpty()){
//            int val = st.peek();
//            if (!minSt.isEmpty() && val != minSt.peek()) {
//                Stack<Integer> backSt = new Stack<>();
//                while (!minSt.isEmpty() && val != minSt.peek()) {
//                    backSt.add(minSt.pop());
//                }
//                minSt.pop();
//                while (!backSt.isEmpty()) {
//                    minSt.add(backSt.pop());
//                }
//            }else if(minSt.isEmpty() || val==minSt.peek() ){
//                minSt.pop();
//            }
//            st.pop();
//        }
//    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        if (!minSt.isEmpty()) {
            return minSt.peek();
        } else {
            return 0;
        }
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