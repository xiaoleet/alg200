public class D0411_004 {
    public static void main(String args[]){
        int[] nums = {2,2,3,2};
        int res = singleNumber(nums);
        System.out.println(res);
    }
    public static int singleNumber(int[] nums) {
        int[] arr = new int[32];
        for (int i = 0; i < 32; i++) {
            for (int j = 0;j<nums.length;j++) {
                arr[i] = arr[i]+(nums[j]&1);
                nums[j] = nums[j]>>1;
            }
        }
        int res = 0;
        for(int i = 0;i<32;i++){
            if(arr[i]%3!=0) {
                res = res+(1<<i);
            }
        }

        return res;
    }
}
