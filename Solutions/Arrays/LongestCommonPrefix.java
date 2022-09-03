package Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i=0; i<strs.length; i++) {
            while(strs[i].indexOf(prefix) !=0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }


    public static void main(String args[]) {
        String strs[] = {"flower", "abc"};
        String result = longestCommonPrefix(strs);
        System.out.println("The result is "+ result);
    }
}
