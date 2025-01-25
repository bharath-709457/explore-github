public class celing_Number {
    public static void main(String[] args) {
        int[] arr={-9,-7,-4,-3,-1,1,4,5,7,8,22,87,99};
        int target=-5;
        System.out.println(ceelingNumber(arr,target));
    }

    private static int ceelingNumber(int[] nums, int target) {
        int start=0;
        int end=(nums.length)-1;

        while (start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return nums[mid];
            }
            if (target < nums[mid]) {
                end = end-1;
            }else{
                start=mid+1;
            }
        }

        return nums[start];
    }
}
