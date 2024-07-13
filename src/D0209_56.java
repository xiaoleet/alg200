import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D0209_56 {
    public static void main(String[] args){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};//[[1,6],[8,10],[15,18]]
        //int[][] intervals = {{1,4},{4,5}};//[[1,6],[8,10],[15,18]]
        int[][] res = merge(intervals);
        for(int i =0;i<res.length;i++){
            System.out.println(res[i][0]+","+res[i][1]);
        }
    }
    public static int[][] merge(int[][] intervals) {
        if(intervals.length == 0 || intervals.length == 1) return intervals;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 0;i<intervals.length;i++){
            if(intervals[i][0]<=end && intervals[i][1]>end){
                end = intervals[i][1];
            }else if(intervals[i][0]>end){
                List<Integer> item = new ArrayList<>();
                item.add(start);
                item.add(end);
                res.add(item);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        List<Integer> item = new ArrayList<>();
        item.add(start);
        item.add(end);
        res.add(item);
        int[][] arr = new int[res.size()][2];
        for(int i = 0;i<arr.length;i++){
            arr[i][0] = res.get(i).get(0);
            arr[i][1] = res.get(i).get(1);
        }
        return arr;
    }
}
