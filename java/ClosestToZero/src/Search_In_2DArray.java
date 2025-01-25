import java.util.Arrays;

public class Search_In_2DArray {


    public static void main(String[] args) {
        int[][] arr={{1,3,56},{23,45,89,4,5},{24,67,5,88}};
        int target=88;
        System.out.println(Arrays.toString(Linear_Search_2Darray(arr,target)));
    }

     static int[] Linear_Search_2Darray(int[][] arr, int target) {
        if(arr.length==0) {
            return new int[]{-1, -1};
        }
        for(int i=0;i < arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                if(target == arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
