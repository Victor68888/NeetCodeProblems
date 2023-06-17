import java.util.ArrayList;
import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args){
        int[] nums = new int[3];
        nums[0]    = 2;
        nums[1]    = 1;
        nums[2]    = 3;
        System.out.println(containsDuplicate(nums));
    }

   public static boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
       for (int i = 0; i < nums.length - 1; i++) {
           if (nums[i] == nums[i + 1]) {
                  return true;
                 }
            }

            return false;
        }
    }

