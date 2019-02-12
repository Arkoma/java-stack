public class Main {

    static Stack stack = new Stack();

    public static void main(String[] args) {
        stackStuff();
    }

    private static void stackStuff() {
        stack.reportNumOfItems();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.reportNumOfItems();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.reportNumOfItems();
    }
}
