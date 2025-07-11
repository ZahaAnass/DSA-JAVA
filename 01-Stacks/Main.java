import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // stack = LIFO data structure, Last In First Out
        //         stores objects into a sort of "vertical tower"
        //         push() to add to the top
        //         pop() to remove from the top

        // uses of stacks?
        // 1. undo/redo functionality in applications
        // 2. moving back/forward in web browsers history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        Stack<String> stack = new Stack<String>();

        // Check if the stack is empty
        // System.out.println("Is the stack empty? " + stack.isEmpty());

        stack.push("Minecraft");
        stack.push("Roblox");
        stack.push("Fortnite");
        stack.push("BorderLands");
        stack.push("Grand Theft Auto V");

        // Check if the stack is empty
        // System.out.println("Is the stack empty? " + stack.isEmpty());

        String myFavGame = stack.pop(); // Removes "Grand Theft Auto V"
        stack.pop(); // Removes "BorderLands"

         // Displays the top element without removing it, which is "Fortnite"
        System.out.println("Top game in the stack: " + stack.peek());

        System.out.println("My favorite game is: " + myFavGame);
        System.out.println(stack);

        // Check if the stack contains a specific game
        System.out.println(stack.search("Roblox") + " is the index of Roblox in the stack.");

    }

}