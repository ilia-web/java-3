public class lesson3_task2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean x = sameFirstLast(nums);
        System.out.println(x);
    }

    private static  boolean sameFirstLast(int[] nums){
        int first = nums[0];
        int last = nums[nums.length-1];
        if (first == last){
            return true;
        }else {
            return false;
        }
    }
}
