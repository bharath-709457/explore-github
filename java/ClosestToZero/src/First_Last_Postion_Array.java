import java.util.Arrays;

public class First_Last_Postion_Array {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        boolean startIndex;
        int start = first_Occurrence(nums ,target ,startIndex=true);
        int end = first_Occurrence(nums ,target ,startIndex = false);

        ans[0]=start;
        ans[1]=end;



        return ans;
    }
    static int first_Occurrence(int[] nums , int target , boolean startIndex){
        int ans = -1;
        int start=0;
        int end=(nums.length)-1;
        while (start <= end){
            int mid = start+(end-start)/2;

            if (target < nums[mid]) {
                end = mid-1;
            }else if(target > nums[mid]){
                start=mid+1;
            }else {
                ans = mid;
                if(startIndex){
                    end =mid-1;
                }else{
                    start =mid+1;
                }
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
