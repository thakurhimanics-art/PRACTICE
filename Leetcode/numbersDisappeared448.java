
import java.util.*;

class numbersDisappeared448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            seen.add(num);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!seen.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}

