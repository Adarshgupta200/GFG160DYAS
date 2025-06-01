import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MajorityEleII {
    public List<Integer> findMajorityElements(int[] nums) {
        int count1 = 0, count2 = 0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (count1 == 0 && nums[i] != ele2) {
                count1 = 1;
                ele1 = nums[i];
            } else if (count2 == 0 && nums[i] != ele1) {
                count2 = 1;
                ele2 = nums[i];
            } else if (nums[i] == ele1) {
                count1++;
            } else if (nums[i] == ele2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        // Verify counts
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == ele1) count1++;
            else if (num == ele2) count2++;
        }

        List<Integer> ans = new ArrayList<>();
        if (count1 > n / 3) ans.add(ele1);
        if (count2 > n / 3) ans.add(ele2);

        Collections.sort(ans); // optional, to return in increasing order
        return ans;
    }

    public static void main(String[] args) {
        MajorityEleII me = new MajorityEleII();
        int[] nums = {3, 2, 3, 1, 1, 2, 2};
        List<Integer> result = me.findMajorityElements(nums);
        System.out.println("Majority elements: " + result);
    }
}
