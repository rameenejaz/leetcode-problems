import java.util.ArrayList;

public class removeDuplicates {

    public static int removeDuplicates(ArrayList<Integer> nums) {
        if (nums.size() == 0) {
            return 0; // empty list
        }

        int k = 1; // index for unique elements

        for (int i = 1; i < nums.size(); i++) {
            if (!nums.get(i).equals(nums.get(i - 1))) {
                nums.set(k, nums.get(i));
                k++;
            }
        }

        return k;
    }
}
