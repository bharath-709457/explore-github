public class Binary_Search_Infinite_Array {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 9, 10};
        int target = 8;
        System.out.println(ans(nums ,target));
    }
    public static int ans(int[] arr, int target){
        int start=0;
        int end=1;
        while(arr[end]< target){
            int temp=end+1;
             end=end+(end-start+1)*2;
             start=temp;

        }

        return binary_Search(arr,target,start,end);
    }
    public static int binary_Search(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid=start+(end-start)/2;
            if(target < arr[mid]){
                end=mid-1;
            }else if(target > arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
