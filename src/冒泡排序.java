public class 冒泡排序 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 8, 3, 5, 2};

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println();
    }
}
