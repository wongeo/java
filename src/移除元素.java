public class 移除元素 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int size = new Solution().removeElement(nums, 3);
        System.out.println(size);
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int i = 0, j = 0;
            while (i < nums.length) {
                int temp = nums[i];
                if (temp != val) {
                    nums[j] = temp;
                    j++;
                }
                i++;
            }
            return j;
        }
    }
}
