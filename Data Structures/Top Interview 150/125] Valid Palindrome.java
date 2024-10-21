//This solution has a time complexity of O(N) and runtime of 13ms. I had almost got it at the first shot.
class Solution {
    public boolean isPalindrome(String s) { 
        if (s.isEmpty()){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); //The ^ symbol means not.

        int front = 0;
        int rear = s.length() - 1;

        while (front < rear) {
            if (s.charAt(front) != s.charAt(rear)) {
                return false;
            }
            front++;
            rear--;
        }

        return true;
    }
}
