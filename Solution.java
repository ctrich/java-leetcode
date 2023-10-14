import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (setNums.contains(nums[i])) {
                return true;
            } else {
                setNums.add(nums[i]);
            }
        }
        return false;
    }
}
