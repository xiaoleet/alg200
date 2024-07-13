public class D0314_45 {
    public static void main(String args[]){
        int[] nums = {2,3,1,1,4};
        int res = jump(nums);
        System.out.println(res);
    }

    public static int jump(int[] nums) {
        int cover = 0;//更新cover的次数就是跳的次数
        int next = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            next = Math.max(next,nums[i]+i);
            if(i==cover && i<nums.length-1){//走完了最大的覆盖范围，但是还没走到，就需要更新范围了
                cover = next;
                count++;
                if( cover>=nums.length-1)
                    break;
            }
        }
        return count;
    }
}
