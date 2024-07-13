import java.util.Arrays;

public class D0318_75 {
    public static void main(String args[]){
        //int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr1 = {28,6,22,8,44,17};
        //int[] arr2 = {2,1,4,3,9,6};
        int[] arr2 = {22,28,8,6};
        int[] res = relativeSortArray(arr1,arr2);
        for(int num:res){
            System.out.print(num+" ");
        }
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        //int[] res = new int[arr1.length];
        //int k = 0;
        int start = 0;
        int len = arr1.length;
        int end = len-1;
        for(int i = 0;i<arr2.length;i++){
            end = len-1;
            while (start<end){
                while (start<end && arr1[start]== arr2[i]){
                    start++;
                }
                while (start<end && arr1[end]!= arr2[i]){
                    end--;
                }
                //int tmp = arr1[end];
                arr1[end] = arr1[start];
                arr1[start] = arr2[i];
                //arr1[start] = arr2[i];
                //arr1[start] = tmp;
            }
//            for(int j = 0;j<arr1.length;j++){
//                if (arr2[i] == arr1[j] && arr1[j]!=-1){
//                    res[k] = arr1[j];
//                    arr1[j] = -1;
//                    k++;
//                }
//            }
        }
        for(int num:arr1){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println(start);
        Arrays.sort(arr1,start,len);
 //       Arrays.sort(arr1);
//        for (int j = 0;j<arr1.length;j++){
//            if(arr1[j]!=-1){
//                res[k] = arr1[j];
//                arr1[j] = -1;
//                k++;
//            }
//        }

        //return res;
        return arr1;
    }
}
