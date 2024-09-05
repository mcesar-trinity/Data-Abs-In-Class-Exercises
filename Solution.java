import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        if(s.length() <= 1) {return false;}

        Stack<Character> x = new Stack<Character>();
        char[] check = s.toCharArray();

        //leftmost character is open, so it won't be a matching string
        if((check[0] == ')') || (check[0] == ']') || (check[0] == '}') || (check.length%2 != 0)) {return false;}

        for(int i = 0; i<check.length; i++) {
            if(check[i] == '(' || check[i] == '{' || check[i] =='[') {
                x.push(check[i]);
            }
            else {
                if(check[i] == ')') {
                    if(x.pop() != '(') { return false; }
                }
                if(check[i] == '}') {
                    if(x.pop() != '{') {return false;}
                }
                if(check[i] == ']') {
                    if(x.pop() != '[') {return false;}
                }
            }
        }

        if(x.isEmpty() == true) {return true;}
        else {return false;}

    }

    public static void main (String[] args) {
        Solution x = new Solution();
        System.out.println(x.isValid("({}])"));
    }
}

    //when i see a left parenthesis, push. when i see a right parenthesis, pop. 
    //if stack is empty at the end, return true. if stack is not empty, return false.

    

