import java.util.List;

public class D0208_75 {
    public static void main(String[] args){
        //int[] nums = {2,0,2,1,1,0};
        int[] nums = {0,0};
        //int[] nums = {2,0,1};
        sortColors(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void sortColors(int[] nums) {
        int left =0;//维护0区间，left左侧都是0
        int current = 0;//当前是0 就跳过
        int right = nums.length-1;//维护2区间，right右侧都是2
        while (current<=right){
            if(nums[current] == 0){
                swap(nums,current,left);//(1)2,0,2,1,1,0->0,2,2,1,1,0;current =1;left=1;
                left++;//left始终指向第一个不是0的位置
                current++;
                //(3) 0,0,2,1,1,2;current = 2;left=2;
            }else if(nums[current] == 2){//(2)0,0,2,1,1,2;current=1,right=right-1
                swap(nums,current,right);
                right--;
                //(4) 0,0,1,1,1,2,2 current = 2,right = right-1;
            }else if(nums[current] == 1){
                current++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    //并不是荷兰国旗算法，会改变1的原有位置，只是也满足题目要求的原地排序
    public static void sortColors2(int[] nums) {
        int pre = 0;
        int last = nums.length-1;
        while (pre<last){
            while (nums[pre]!=2 && pre<last){
                pre++;
            }
            if(pre<last){
                int tmp = nums[last];
                nums[last] =nums[pre];
                nums[pre] =tmp;
                last--;
            }
        }
        pre = 0;
        last = nums.length-1;
        while (pre<last){
            while (last>=0 && nums[last] == 2){
                last--;
            }
            while (pre<last && nums[pre]==0){
                pre++;
            }
            if(pre<last){
                int tmp = nums[last];
                nums[last] =nums[pre];
                nums[pre] =tmp;
                last--;
            }
        }
    }
}
