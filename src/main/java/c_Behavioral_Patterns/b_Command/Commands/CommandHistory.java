package c_Behavioral_Patterns.b_Command.Commands;
import java.util.Stack;

// The global command history is just a stack.

public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);    // Push the command to the end of the history array.
    }

    public Command pop() {
        return history.pop();   // Get the most recent command from the history.
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
