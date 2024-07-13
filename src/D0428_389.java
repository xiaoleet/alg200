public class D0428_389 {
    public static void main(String args[]){
        String s = "";
        String t = "y";
        char res = findTheDifference(s,t);
        System.out.println(res);
    }
    public static char findTheDifference(String s, String t) {
        int n = s.length();
        int m = t.length();
        int sumS = 0;
        int sumT = 0;
        for(int i = 0;i<n;i++){
            sumS = sumS+s.charAt(i);
        }
        for(int j = 0;j<m;j++){
            sumT = sumT+t.charAt(j);
        }
        char source =  'a';
        int diff = sumT-sumS-'a';
        while (diff>0){
            source++;
            diff--;
        }
        return source;
    }
}
