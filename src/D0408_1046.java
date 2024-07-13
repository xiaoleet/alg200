import java.util.PriorityQueue;

public class D0408_1046 {
    public static void main(String args[]){
        int[] stones = {2,7,4,1,8,1};
        int res = lastStoneWeight(stones);
        System.out.println(res);
    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));
        int first = 0;
        int second = 0;
        for(int stone:stones){
            queue.add(stone);
        }
        while (!queue.isEmpty()){
            first = queue.poll();
            if(!queue.isEmpty()){
                second = queue.poll();
            }else {
               queue.add(first);
               break;
            }
            queue.add(first-second);
        }
        return queue.peek();
    }
}
