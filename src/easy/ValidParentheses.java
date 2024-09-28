package easy;

// Problem: https://leetcode.com/problems/valid-parentheses/submissions/1405183144/
// Approach: Stack

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        if(s.length() <= 1 || s.charAt(0) == '}' || s.charAt(0) == ')'||s.charAt(0) == ']') return  false;

        for(char c: s.toCharArray()){

            if(c == '['||c == '{' ||c == '(' ){
                stack.push(c);
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else{
                return false;
            }

        }

        return stack.isEmpty();
    }
}
