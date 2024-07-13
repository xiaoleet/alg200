import java.util.*;

public class D0208_49 {
    public static void main(String[] args){
        //String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs = {"eat", "ate", "tea", "tan", "nat", "bat"};
        List<List<String>> res = groupAnagrams(strs);
        for(int i = 0;i<res.size();i++){
            System.out.println(res.get(i));
        }

    }
    public static  List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(map.containsKey(key)){
                List<String> item = map.get(key);
                item.add(strs[i]);
            }else {
                List<String> item = new ArrayList<>();
                item.add(strs[i]);
                map.put(key,item);
            }
        }
        Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            res.add(new ArrayList<>(iterator.next().getValue()));
        }
        return res;
    }
}
