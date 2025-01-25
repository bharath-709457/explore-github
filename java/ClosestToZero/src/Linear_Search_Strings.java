import java.util.Arrays;

public class Linear_Search_Strings {

    static int string_Linear_Search(String str,char target){
        if(str.isEmpty())
            return -1;
        for(int i=0;i<=str.length();i++)
            if (target == str.charAt(i))
                return i;
        return -1;
    }
    public static void main(String[] args) {
        String str="bharath";
        char target='t';
        System.out.println(string_Linear_Search(str,target));
        //it will change string into array
        System.out.println(Arrays.toString(str.toCharArray()));

    }
}
