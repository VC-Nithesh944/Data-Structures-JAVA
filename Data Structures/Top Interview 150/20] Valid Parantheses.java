//This solution has a runtime of 2ms and Time complexity of O(N).
class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true; // empty string is valid
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);

            switch (symbol) {
                case '(':
                case '[':
                case '{':
                    stack.push(symbol);
                    break;

                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty()) {
                        return false; // there's no matching opening bracket
                    }
                    char next = stack.pop();
                    if (!Matching(next, symbol)) {
                        return false; // unmatched pair
                    }
                    break;

                default:
                    return false;
            }
        }
        return stack.isEmpty(); // ensure no unmatched opening brackets remain
    }

    public boolean Matching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}
