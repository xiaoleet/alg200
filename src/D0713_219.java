import java.util.HashSet;

public class D0713_219 {
    public static void main(String args[]){
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        boolean res = containsNearbyDuplicate(nums,k);
        System.out.println(res);

    }
    //暴力，超出时间限制
    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<=i+k && j<nums.length;j++){
                if(nums[i]==nums[j]) return true;
            }
        }
        return false;
    }

    /**
     * 标签：哈希
     * 维护一个哈希表，里面始终最多包含 k 个元素，当出现重复值时则说明在 k 距离内存在重复元素
     * 每次遍历一个元素则将其加入哈希表中，如果哈希表的大小大于 k，则移除最前面的数字
     * 时间复杂度：O(n)，n 为数组长度
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size()>k) set.remove(nums[i-k]);//保证顺序移除，能移除最前面的那个数
        }
        return false;
    }
}
