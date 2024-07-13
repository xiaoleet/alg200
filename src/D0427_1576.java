public class D0427_1576 {
    public static void main(String args[]){
        //String s = "ubv??w";
        String s = "??yw?ipkj??";
        //String s = "b?a";
        String res = modifyString(s);
        System.out.println(res);
    }
    public static String modifyString(String s) {
        if(s == null || s.length() == 1 && !s.equals("?")){
            return s;
        }
        if(s.length() == 1 && s.equals("?")) {
            return "a";
        }
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            if(c[i] == '?'){
                c[i] = 'a';
                while ((i-1>=0 && c[i]==c[i-1])||(i+1<c.length && c[i] == c[i+1])){
                    c[i]++;
                }
            }
        }
        return new String(c);
    }

}
