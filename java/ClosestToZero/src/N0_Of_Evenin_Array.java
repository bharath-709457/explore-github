
/* https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/ */

public class N0_Of_Evenin_Array {
    public static int findNumbers(int[] nums) {
        int temp=0;
        for (int i:nums)
            if (count_Digits(i) % 2 == 0)
                temp ++;
        return temp;
    }

    public static int count_Digits(int num){
        int count=0;
        while(num>0){
            count += 1;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
       int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
