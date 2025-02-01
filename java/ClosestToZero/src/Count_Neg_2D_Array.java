
public class Count_Neg_2D_Array {
    public static void main(String[] args) {
       int[][] arr= {{10,9,8,7},{6,5,4,3},{2,1,0,1},{-2,-3,-4,-5}};
       System.out.println(Passingarray(arr));
    }
    public static int Passingarray(int[][] arr) {

        int count = 0;
        for (int[] nums : arr) {
            count =count+binarySearch(nums);
        }
        return count;
    }

    public static int binarySearch(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int count=0;
        if (arr[end]<0) {
            while(start <= end){
                int mid=start+(end-start)/2;
                if(arr[mid]>= 0){
                    start=mid+1;
                }else if(arr[mid]<0){
                    end=end-1;
                    count++;
                }
            }
        }
        return count;
    }

}
