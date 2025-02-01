
//https://leetcode.com/problems/find-in-mountain-array/description/
//find a first possible target in an array
//1)serach peak mountain array problem and binary search and the find asc array else check in desc array
public class Search_In_Mountain_Array {
    public static int findInMountainArray(int[] arr,int target) {
        int max= peakMountainArray(arr);
        int firsttry=binarySearch(arr,target,0,max);
        if(firsttry!= -1){
            return firsttry;
        }

        return binarySearch(arr,target,max+1,arr.length-1);
    }
    public static int binarySearch(int[] arr,int target,int start,int end){
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }

        }
        return -1;
    }
    public static int peakMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start != end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid+1;
            }else{
                end= mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(arr,target));

    }
}
