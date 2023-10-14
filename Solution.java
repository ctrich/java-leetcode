import java.util.HashSet;
import java.util.Set;

public class Solution {
    //Takes an integer array nums, return true if any value appears at least
    // twice in the array, and return false if every element is distinct.
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
