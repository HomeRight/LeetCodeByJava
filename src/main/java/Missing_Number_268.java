import java.util.*;

public class Missing_Number_268 {
    public static void main(String[] args) {

        int[] nums = new int[]{3, 0, 1};

        int result = missingNumber(nums);

        System.out.println(result);
    }


    private static int missingNumber(int[] nums) {

//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i <= nums.length; i++) {
//            set.add(i);
//        }
//
//        Arrays.sort(nums);
//
//
//        for (int num : nums) {
//            if (set.contains(num)) {
//                set.remove(num);
//            }
//        }
//
//        Iterator<Integer> iterator = set.iterator();
//
//        while (iterator.hasNext()) {
//            return iterator.next();
//        }
//
//        return nums.length;


        int length = nums.length;
        int total = (length * (length + 1)) / 2;

        for (int num : nums) {
            total -= num;
        }

        return total;


    }

}
