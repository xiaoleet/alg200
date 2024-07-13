public class D0411_724 {
    public static void main(String args[]){
        int[] nums = {1, 7, 3, 6, 5, 6};
        int res = pivotIndex(nums);
        System.out.println(res);
    }

    public static int pivotIndex(int[] nums) {
        int len = nums.length;
        if(len == 1) return 0;
        int i = 0;
        int j = len-1;
        int left = 0;
        int right = nums[len-1];
        while (left!=right){
            while (j-i!=1 && left>right){
                right = right+nums[j];
                j--;
            }
            while(j-i!=1 && left<right){
                left = left+nums[i];
                i++;
            }
        }
        if(left == right) return j-1;
        else return -1;
    }
}
