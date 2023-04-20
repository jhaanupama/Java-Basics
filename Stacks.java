import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(34);
        stack.push(12);
        stack.push(14);
        System.out.println(stack.pop());
        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(3);
        queue.add(5);

        System.out.println(queue.remove());
    }
}
