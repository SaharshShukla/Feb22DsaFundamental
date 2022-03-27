/*2. https://leetcode.com/problems/valid-parentheses/ */
package march.week3.assignment11;
import java.util.*;
public class Qst2 {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{') {
                stack.push(a);
            } else if(stack.empty()) {
                return false;
            } else if(a == ')' && stack.pop() != '(') {
                return false;
            } else if(a == ']' && stack.pop() != '['){
                return false;
            } else if(a == '}' && stack.pop() != '{') {
                return false;
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        String strOne  = "()(())){{}}[{}]";
        System.out.println(isValid(strOne));
        String strTwo  = "()";
        System.out.println(isValid(strTwo));
        String strThree = "()[]{}";
        System.out.println(isValid(strThree));
        String strFour = "(]";
        System.out.println(isValid(strFour));
    }

}
/*
Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */
