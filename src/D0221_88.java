public class D0221_88 {
    public static void main(String[] args){
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        merge(nums1,3,nums2,3);
        for(int i = 0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        int j = m-1;
        int k = n-1;
        int i = nums1.length -1;
        for(;i>=0;i--){
            if(j>=0 && k>=0){
                if(nums1[j]>nums2[k]){
                    nums1[i] = nums1[j];
                    j--;
                }else{
                    nums1[i] = nums2[k];
                    k--;
                }
            }else {
                break;
            }
        }
        while (k>=0){
            nums1[i] = nums2[k];
            k--;
            i--;
        }
    }
}
