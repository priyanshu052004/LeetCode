package Day_1.ValidPalandrom;

public class Solution {


    public static String change(String a){
        String ans = "";
        if(a == null || a.isEmpty()){
            return "";
        }
        for (char c : a.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                ans = ans + c;
            }
        }
        String b = ans.toLowerCase();


        return b;
    }
    public boolean isPalindrome(String s) {
        String a = s.trim();
        String str =a.replaceAll("\\s", "");
        String fstr = Solution.change(str);
        int left = 0;
        int right = fstr.length()-1;
        char [] arr = fstr.toCharArray();
        while(left < right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }


}