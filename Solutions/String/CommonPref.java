package String;

// Another version of Longest common prefix
public class CommonPref {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0) {
            return "";
        }
        String commonPrefix = strs[0], temp = "";
        for (int i = 1; i < strs.length; i++) {
            int length = commonPrefix.length() < strs[i].length() ? commonPrefix.length() : strs[i].length();
            temp = "";
            for (int j = 0; j < length; j++) {
                if (commonPrefix.charAt(j) == strs[i].charAt(j)) {
                    temp += commonPrefix.charAt(j);
                } else {
                    commonPrefix = temp;
                    break;
                }
            }
            commonPrefix = temp;
        }
        return commonPrefix;
    }

    public static void main(String args[]) {
        String arrayString[] = { "ab", "a" };
        String result = longestCommonPrefix(arrayString);
        System.out.println(result);
    }
}
