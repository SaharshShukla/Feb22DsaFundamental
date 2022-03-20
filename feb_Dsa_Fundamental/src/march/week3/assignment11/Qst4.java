/*4. Reverse only words in a string using stacks. */
package march.week3.assignment11;
import java.util.*;
public class Qst4 {
    static void reverseString(String s){

        Stack<String> stc = new Stack<>();

        String temp = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                stc.add(temp);
                temp = "";
            }
            else{
                temp = temp + s.charAt(i);
            }

        }
        stc.add(temp);

        while(!stc.isEmpty()){
            temp = stc.peek();
            System.out.print(temp + " ");
            stc.pop();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "Hunds Of Justice";
        System.out.println("\"Reverse string is: \"");
        reverseString(s);
    }

}

