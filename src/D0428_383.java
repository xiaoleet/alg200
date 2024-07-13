public class D0428_383 {
    public static void main(String args[]){
        String ransomNote = "a";
        String magazine = "b";
        boolean res = canConstruct(ransomNote,magazine);
        System.out.println(res);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] res = new char[26];
        for(int i =0 ;i<magazine.length();i++){
            res[magazine.charAt(i)-'a']++;
        }
        for(int i = 0;i<ransomNote.length();i++){
            if(res[ransomNote.charAt(i)-'a']>0){
                res[ransomNote.charAt(i)-'a']--;
            }else {
                return false;
            }
        }
        return true;
    }
}
