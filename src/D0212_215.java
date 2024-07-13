import java.util.PriorityQueue;

public class D0212_215 {
    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int res = findKthLargest(nums,k);
        System.out.println(res);
    }
    //最小堆
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0;i<k;i++){
            minHeap.add(nums[i]);
        }
        for(int i = k;i<nums.length;i++){
            if(minHeap.peek()<nums[i]){
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }
        return minHeap.peek();
    }
}
