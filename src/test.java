import java.util.*;

public class Test {
    
        public int findPeakElement(int[] nums) {
          //  List<Integer>findPeakElements =new ArrayList<>();
            if(nums.length==1)
            return 0;
           else if(nums[0]>nums[1]){
               return 0;
           }
            if(nums[nums.length-1]>nums[nums.length-2])
            {
            
                return nums.length-1;
            }
            for(int i=1;i<nums.length-1;i++){
                if(nums[i]>=nums[i-1]&&nums[i]>=nums[i+1]){
                    return i;
                }
            }
            return 0; 
            
        }
      
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 7, 3, 9, 1};
        peakelement(array, array.length);
    }

