public class Main {
    public static void main(String[] args) {
        System.out.println("Stacking");
        MyStack stack = new MyStack();
        stack.push("first one");
        stack.push("second one");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmplty());

        System.out.println("Queuing");
        MyQueue queue = new MyQueue();
        queue.add("first one");
        queue.add("second one");
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}
