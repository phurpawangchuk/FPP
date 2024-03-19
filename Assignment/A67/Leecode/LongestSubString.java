package A67.Leecode;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 *
 * @year 2024-10-03
 */
public class LongestSubString {
    public static void main(String[] args) {
        String[] strings = new String[]{"Flowaterwer", "Flowate", "Flowa"};

        String res = findLongest(strings);
        System.out.println(res);

    }

    public static String findLongest(String[] strs) {
        // Iterate through the characters of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            // Compare the character with corresponding characters of other strings
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    // If characters don't match or if we reach the end of any string, return the prefix
                    return strs[0].substring(0, i);
                }
            }
        }
        // If all strings have the same prefix, return the prefix of the first string
        return strs[0];
    }
}
