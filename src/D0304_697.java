import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
public class D0304_697 {
    public static void main(String args[]){
        //int[] nums = {1,2,2,3,1};
        //int[] nums = {1,2,2,3,1,4,2};
        int[] nums = {1,2};
        int res = findShortestSubArray(nums);
        System.out.println(res);
    }
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer,int[]> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                int[] arr = new int[3];
                arr[0]=1;//第0位，记录频次
                arr[1]=i;//第0位，记录频次
                map.put(nums[i],arr);
            }else {
                int[] arr = map.get(nums[i]);
                int right = i;
                arr[0] = arr[0]+1;//第0位，记录频次
                arr[2] = right;//第2位，记录最左边
                map.put(nums[i],arr);
            }
        }
        int highestFrequncy = 1;
        int lenMin = Integer.MAX_VALUE;
        Iterator<Map.Entry<Integer,int[]>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<Integer,int[]> item = iter.next();
            int[] value = item.getValue();
            if(value[0]>=highestFrequncy){
                int len = value[2]-value[1]+1;
                int newFrequncy = value[0];
                if(value[2] == 0){
                    len = 1;
                    newFrequncy = 1;
                    continue;
                }
                if(newFrequncy > highestFrequncy){
                    highestFrequncy = value[0];
                    lenMin = len;
                }else if(newFrequncy == highestFrequncy && lenMin>len){
                    lenMin = len;
                }
            }
        }
        return lenMin==Integer.MAX_VALUE?1:lenMin;
    }
}
