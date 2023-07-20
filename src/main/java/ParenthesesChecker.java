import java.util.Stack;

public class ParenthesesChecker {

    public boolean checkParentheses(String testString){

        Stack<Character> stack = new Stack<>();
        for (char character :testString.toCharArray()){


// Check for ()
            if(character == '(')
            {stack.push(character);
            }if (character==')') {
                if (stack.isEmpty()) {
                    return false;
                } else {stack.pop(); }
            }

// Check for {}
            if(character == '{')
            {stack.push(character);
            }if (character=='}') {
                if (stack.isEmpty()) {
                    return false;
                } else {stack.pop();}
            }


// Check for []
            if(character == '[') {
                stack.push(character);
            }if (character==']') {
                if (stack.isEmpty()) {
                    return false;
                } else {stack.pop();}



            }

        }

        return stack.isEmpty();
    }}





