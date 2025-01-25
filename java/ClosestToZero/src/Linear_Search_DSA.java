public class Linear_Search_DSA {

    static int linear_Search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<=arr.length;i++){
            if (target==arr[i]){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={12,14,73,37,98};
        int target=73;
        System.out.println(linear_Search(arr,target));
    }
}
