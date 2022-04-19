public class 最长公共前缀 {
    public static void main(String[] args) {
//        String[] strs = {"flower", "flow", "flight"};
        String[] strs = {"dog", "racecar", "car"};
        System.out.println(new Solution().longestCommonPrefix(strs));
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            StringBuffer sb = new StringBuffer();
            String header = null;
            for (int i = 0; i < strs.length; i++) {
                String str = strs[i];
                if (header != null) {
                    char[] chars = str.toCharArray();
                    int len = 0;
                    for (int j = 0; j < chars.length; j++) {
                        char c = chars[j];
                        if (j < header.length() && c == header.charAt(j)) {
                            len = j + 1;
                        } else {
                            break;
                        }
                    }
                    header = header.substring(0, len);
                } else {
                    header = str;
                }
            }
            return header;
        }
    }
}
