/**
 * Main.java
 * Authors: Luke O’Drobinak
 * Date: 11/14/2023
 * Collaborators:
 * Citations: Google, Oracle Java Docs, GitHub Documentation, Stack Overflow
 **/

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.getSize());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        stack.push(4);
        stack.push(5);
        stack.push(6);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
