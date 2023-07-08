import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue {
    public static void sortQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            int current = queue.poll();

            while (!stack.isEmpty() && stack.peek() > current) {
                queue.offer(stack.pop());
            }

            stack.push(current);
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(30);
        queue.offer(11);
        queue.offer(15);
        queue.offer(4);

        sortQueue(queue);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
