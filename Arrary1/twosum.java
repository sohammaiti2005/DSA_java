public class twosum {
    public static int[] twoSum(int nums[], int target) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                return new int[] { start, end };

            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8 };
        int target = 8;
        // System.out.println( "wddW"+twoSum(nums,target));
        int arr[] = twoSum(nums, target);
        System.out.print("( ");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println(")");
        // System.out.println(arr[1]);

    }
}
