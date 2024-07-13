public class D0221_977 {
    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        int[] res = sortedSquares(nums);
        for(int num:res){
            System.out.print(num+" ");
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int first = 0;int last = nums.length-1;int index = nums.length-1;
        while (index>=0){
            if(nums[first]*nums[first]<nums[last]*nums[last]){
                res[index] = nums[last]*nums[last];
                last--;
            }else {
                res[index] = nums[first]*nums[first];
                first++;
            }
            index--;
        }
        return res;
    }
}
