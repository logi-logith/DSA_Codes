package slidingWindowPattern;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeating {
    public static int lengthOfLongestSubString(String s){
        if (s==null||s.isEmpty())
            return 0;
        Set<Character> seen = new HashSet<>();
        int left=0;
        int maxLength=0;

        for(int right=0;right<s.length();right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s="abbcdab";
        System.out.println("Maximum Length: " + lengthOfLongestSubString(s));
    }
}
