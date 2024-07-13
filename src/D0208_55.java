public class D0208_55 {
    public static void main(String[] args){
        //int[] nums = {2,3,1,1,4};
        //int[] nums = {1,2,3};
        //int[] nums = {3,2,1,0,4};
        int[] nums = {3,0,8,2,0,0,1};

        boolean res = canJump(nums);
        System.out.println(res);
    }
    public static boolean canJump(int[] nums) {
       int cover =  0+nums[0];

        //2,--3(1+3==4);
        //2--(0+2=2)
        //2,--3---1(2+1==3);
        //3+1=4

        //3,2,1,0,4(4)
        //0+3 = 3;
        //1+2 = 3;
        //1+2 = 3;
        //0+3-->3---false

        for(int i = 0;i<=cover;i++){
            System.out.println("i:"+i+" cover:"+cover);
            if(cover >= nums.length-1){
                return true;
            }else {
                cover = Math.max(i+nums[i],cover);
            }
        }
        if(cover>=nums.length-1)
            return true;
        else
            return false;
    }
}
