import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(numMap.containsKey(diff)) {
                return new int[] {numMap.get(diff), i};
            }
            numMap.put(nums[i],i);
        }


        return null;
    }

    /*public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }*/

    public static void main(String[] args) {
        int[] arr = new int[] {2,7,11,15};
        int target = 9;
        //System.out.println(twoSum(arr,target));
    }
}