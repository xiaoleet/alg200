import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class D0327_179 {
    public static void main(String args[]){
        //int[] nums = {3,30,34,5,9};
        int[] nums = {10,2,1};
        String res = largestNumber(nums);
        System.out.println(res);
    }

    public static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        int i = 0;
        for(int num:nums){
             arr[i++] = String.valueOf(num);
        }
        //Arrays.sort(arr,((o1, o2) -> o2.compareTo(o1)));
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String order1 = o1+o2;
                String order2 = o2+o1;
                return order2.compareTo(order1);
            }
        });
        StringBuilder sb = new StringBuilder();
        char prefix = arr[0].charAt(0);
        for(int j = 0;j<arr.length;j++){
            if(arr[j].charAt(0) == prefix && arr[j].length()>1){

            }
        }
        for(String str:arr){
            sb.append(str);
        }
        return sb.toString();
    }
}
