import java.util.*;

public class D0215_347 {
    public static void main(String[] args){
        //int[] nums = {1,1,1,2,2,3};
        int[] nums = {4,1,-1,2,-1,2,3};
        int k = 2;
        int[] res = topKFrequent(nums,k);
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        int i = 0;
        int[] res = new int[k];
        for(Map.Entry<Integer,Integer> item:list){
            if(i<k){
                res[i] = item.getKey();
                i++;
            }else {
                break;
            }
        }
        return res;
    }
}
