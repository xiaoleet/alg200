import java.util.List;
import java.util.ArrayList;
public class D0319_139 {
    public static void main(String args[]){
       String s = "applepenapple";
       List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        wordBreak(s,wordDict);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        return backtrack(s,wordDict,new StringBuilder());
    }

    public static boolean backtrack(String s,List<String> wordDict,StringBuilder sb){
        if(sb.length() == s.length()){
            if(sb.toString().equals(s)){
                return true;
            }
        }
        if(sb.length()>s.length()){
            return false;
        }
        for(String item:wordDict){
            backtrack(s,wordDict,sb.append(item));
            sb.setLength(sb.length() - item.length());
        }
        return false;
    }
}
