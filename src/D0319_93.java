import java.util.ArrayList;
import java.util.List;

public class D0319_93 {
    public static void main(String args[]){
        String s = "25525511135";
        List<String> res = restoreIpAddresses(s);
        System.out.println(res);
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        List<String> item = new ArrayList<>();
        if (s == null || s.length() == 0)
            return res;
        backtrack(res, item, s, 0);
        return res;
    }

    public static void backtrack(List<String> res, List<String> item, String s, int start) {
        if (item.size() == 4 && start < s.length()) {
            return;
        }
        if (item.size() == 4 && start >= s.length()) {
            StringBuilder sb = new StringBuilder();
            for (String sub : item) {
                sb.append(sub);
                sb.append(".");
            }
            sb.deleteCharAt(sb.length() - 1);
            res.add(sb.toString());
        }
        for (int i = start; i < s.length(); i++) {

            String sub = s.substring(start, i + 1);
            if (s.charAt(start) == '0' && sub.length() > 1) {
                return;
            }
            if (sub.length() > 3 || Integer.parseInt(sub) > 255) {
                return;
            }
            item.add(sub);
            backtrack(res, item, s, i + 1);
            item.remove(item.size() - 1);
        }
    }
}