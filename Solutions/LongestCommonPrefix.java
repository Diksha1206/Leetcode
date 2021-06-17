package Solutions;

public class LongestCommonPrefix {
    public String computerCommonPrefix(String string1, String string2) {
        String commonPrefix = "";
        if (string1 != "" || string2 != "") {
            int lengthOfString = string1.length() < string2.length() ? string1.length() : string2.length();
            for (int inCount = 0; inCount < lengthOfString; inCount++) {
                if (string1.charAt(inCount) == string2.charAt(inCount)) {
                    commonPrefix += string1.charAt(inCount);
                } else if (commonPrefix != "") {
                    string1 = commonPrefix;
                    return string1;
                } else if (commonPrefix == "") {
                    return commonPrefix;
                }
            }
        } else {
            return "";
        }
        return commonPrefix;
    }

    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        if (strs.length > 1) {
            commonPrefix = computerCommonPrefix(strs[0], strs[1]);
            for (int count = 2; count < strs.length; count++) {
                commonPrefix = computerCommonPrefix(commonPrefix, strs[count]);
            }
        } else {
            return strs[0];
        }
        return commonPrefix;
    }
}
