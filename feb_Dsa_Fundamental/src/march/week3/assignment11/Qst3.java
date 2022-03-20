/*3. Remove adjacent chars in a string. */
package march.week3.assignment11;
import java.util.*;
public class Qst3 {
    static String adjacentString(String str1){

        Stack<Character> st =new Stack<Character>();
        int i = 0;// Store the index of str


        while (i < str1.length()){
            if (st.isEmpty() ||str1.charAt(i) != st.peek()){
                st.add(str1.charAt(i));
                i++;
            }else{// If top element of the stack is equal to the current character
                st.pop();
                i++;
            }
        }


        if (st.isEmpty()){
            return ("Empty String");
        }else{// If stack is not Empty
            String short_String = "";
            while (!st.isEmpty()){
                short_String = st.peek()+short_String;
                st.pop();
            }
            return (short_String);
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str1 ="azzxzy";
        System.out.print("Adjacent string is: "+adjacentString(str1));
    }

}

