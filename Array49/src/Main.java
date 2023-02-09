public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 2, 7, 8, 9, 10 };
        int[] nums_test = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int i = 0; i < nums.length; i++){
            for (; i < nums_test.length; ){
                if (nums[i]-1 == nums_test[i]){
                    System.out.println("all good " + i);
                }
                else {
                    System.out.println("index in nums " + i);
                }
                break;
            }
        }
    }
}