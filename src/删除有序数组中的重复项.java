import java.util.*;

public class 删除有序数组中的重复项 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int num = new Solution().removeDuplicates(nums);
        System.out.println(num);

    }

    static class Solution {

        public int removeDuplicates(int[] nums) {
            List<Integer> list = new ArrayList<>();
            Integer temp = null;
            for (int i : nums) {
                if (temp != null && temp == i) {

                } else {
                    list.add(i);
                }
                temp = i;
            }

            for (int i = 0; i < list.size(); i++) {
                int item = list.get(i);
                nums[i] = item;
            }
            return list.size();
        }

    }
}
