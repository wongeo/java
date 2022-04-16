import java.util.Stack;

public class 有效的括号 {

    public static void main(String[] args) {
        String s1 = "[";
        boolean isValid = new Solution().isValid(s1);
        System.out.println(isValid);
    }

    static class Solution {

        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                switch (c) {
                    case '(':
                        stack.push(')');
                        break;
                    case '[':
                        stack.push(']');
                        break;
                    case '{':
                        stack.push('}');
                        break;
                    case ')':
                    case ']':
                    case '}':
                        if (stack.isEmpty()) {
                            return false;
                        }
                        char r = stack.pop();
                        if (r != c) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
            return stack.isEmpty();
        }
    }

}

