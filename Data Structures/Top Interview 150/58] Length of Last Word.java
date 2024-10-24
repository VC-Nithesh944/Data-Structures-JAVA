//This has 0ms runtime and Time complexity of O(N).
//One of the easiest questions I have ever solved.
class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();                //Trim the trailing spaces if present.
        int count = 0;
        for (int i = str.length() -1 ;i>=0;i--){     //Loop character from last until encountered by whitespace or tab, return count
            if (str.charAt(i) == ' ' || str.charAt(i) == '\t'){
                return count;
            }
            count++;
        }
        return count;
    }
}
