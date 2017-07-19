/**
 * Created by JamesHartanto on 7/18/17.
 */
public class ReversePolishCalc {
    // You'll need a variable here to keep track of the top of the stack
    private int top = 0;

    // The array of the input string split up
    private String[] tokens;

    // The stack
    private String[] stack;

    // methods
    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = input.split(",");

        // 2. Allocate a stack as big as the number of tokens
        stack = new String[tokens.length];

        // 3. write the algorithm
        for(int i = 0; i < tokens.length; ++i) {
            // calls to push() and pop() and do the math here
            if (tokens[i].equals("+")){
                push(pop() + pop());
                continue;
            } else if(tokens[i].equals("-")){
                push(-pop() + pop());
                continue;
            } else if(tokens[i].equals("*")){
                push(pop() * pop ());
                continue;
            } else if(tokens[i].equals("/")){
                push(1 / pop() * pop());
            } else{
                push(tokens[i]);
            }
        }

        // 4. return the result
        return Double.parseDouble(stack[0]);
    }

    private void push(String number) {
        // push on the stack
        stack[top] = number;
        top = top + 1;
    }

    private void push(double d) {
        // change the double to a string and then push it on the stack
        String stringOfD = String.valueOf(d);
        stack[top] = stringOfD;
        top = top + 1;
    }

    private double pop() {
        // remove the string from the top of the stack and convert it to a double and return it
        if (top == stack.length){
            return -1;
        } else{
            top = top - 1;
            double value = Double.parseDouble(stack[top]);
            return value;
        }
    }
}
