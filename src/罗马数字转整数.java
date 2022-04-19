import java.util.*;

public class 罗马数字转整数 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int res = solution.romanToInt("III");
        System.out.println(res);
    }

    static class Solution {

        Map<Character, Integer> m1 = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        public int romanToInt(String s) {
            int res = 0;
            int temp = 0;
            int[] ints = new int[s.length()];
            for (int i = 0; i < ints.length; ++i) {
                char c = s.charAt(i);
                int cur = m1.get(c);
                if (temp != 0 && temp >= cur) {
                    res += temp;
                    temp = cur;
                } else if (temp != 0) {
                    res += (cur - temp);
                    temp = 0;
                } else {
                    temp = cur;
                }
            }
            res += temp;
            return res;
        }
    }
}
