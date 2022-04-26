public class 实现strStr {
    public static void main(String[] args) {
        int index = new Solution().strStr("aaaaa", "a");
        System.out.println(index);
    }

    static class Solution {
        public int strStr(String haystack, String needle) {
            if (needle != null && needle.length() == 0) {
                return 0;
            }
            char[] chars = haystack.toCharArray();
            char[] chars2 = needle.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (c == chars2[0]) {
                    int temp = i;
                    int k = i;
                    for (int j = 0; j < chars2.length; j++, k++) {
                        char c2 = chars2[j];
                        if (k >= chars.length || c2 != chars[k]) {
                            temp = -1;
                            break;
                        }
                    }
                    if (temp >= 0) {
                        return temp;
                    }
                }
            }
            return -1;
        }
    }
}
