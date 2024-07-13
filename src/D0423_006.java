public class D0423_006 {
    public static void main(String args[]){
        //int[] nums = {1,1,3,2};
        int[] nums = {1,2,4,6,10};
        int target = 8;
        int[] res = twoSum(nums,target);
        System.out.print(res[0]+","+res[1]);
    }
    public static int[] twoSum(int[] numbers, int target) {
       int i = 0;
       int j = numbers.length-1;
       int[] res = new int[2];
       while (i<j){
           int sum = numbers[i]+numbers[j];
           if( sum == target){
               res[0] = i;
               res[1] = j;
               break;
           }else if(sum>target){
               j--;

           }else {
               i++;
           }
       }
       return res;
    }
}
