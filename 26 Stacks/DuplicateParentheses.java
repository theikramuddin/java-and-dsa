import java.util.*;
public class DuplicateParentheses {
    
    public static boolean duplicateParentheses(String str) { //O(n)
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //closeing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                
                if (count < 1) {
                    return true; //duplicate
                } else {
                    s.pop(); //opening pair
                }
            } else {
                //opeing
                s.push(ch);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        
        // String str = "(((a+(b)))+(c+d))";
        String str = "(a+b)"; //true

        System.out.println(duplicateParentheses(str));
    }
}
