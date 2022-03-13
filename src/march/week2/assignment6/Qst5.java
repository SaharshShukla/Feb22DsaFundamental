/*5.Write a recursive code to check if a string is a palindrome or not.
[Hint: reverse the string and send both strings into the function and check.]"
*/
package march.week2.assignment6;

public class Qst5 {
    static void isPalindrome(String str, int start, int end){

        //base condition
        if(start >= end ){
            return;
        }

        //logic
        if(str.charAt(start) != str.charAt(end)){
            System.out.println("String is not a plaindrome");
        }else{
            System.out.println("String is  a plaindrome");
        }

        isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args){
        String str = "saharsh";
        int start = 0;
        int end = str.length() -1;
         isPalindrome( str, start, end);
    }
}
