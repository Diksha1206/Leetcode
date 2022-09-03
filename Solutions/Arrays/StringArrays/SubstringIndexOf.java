package Arrays.StringArrays;

public class SubstringIndexOf {

    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }
        int i=0, j=0, k=0;
        while(i < haystack.length() && j<needle.length()) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                if (j==1){
                    k = i;
                }
                i++; j++;
            } else {
                if (j !=0){
                    i = k;
                }
                j=0;
                i++;
            }
        }
        if(j==needle.length()) {
            int result = i - needle.length();
            return result;
        }
        return -1;
    }

    public static void main(String args[]) {
        String haystack = "mississippi";
        String needle = "issip";
        int result = strStr(haystack, needle);
        System.out.print("The output is");
        System.out.print(result);
    }
}
