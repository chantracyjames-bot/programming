import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Queue;

public class DSAPractice {
    static void testStack() {
        Stack test = new Stack();
        System.out.println("isEmpty: " + test.isEmpty());
        System.out.println("pop: " + test.popElement());
        test.pushNew(1);
        test.pushNew(2);
        test.pushNew(3);
        System.out.println("pop: " + test.popElement());
        System.out.println("peek: " + test.peekElement());
        System.out.println("traverse");
        test.traverse();
    }

    static void testQueue() {
        TestQueue test = new TestQueue();
        System.out.println("isEmpty: " + test.isEmpty());
        System.out.println("pop: " + test.popElement());
        test.pushNew(1);
        test.pushNew(2);
        test.pushNew(3);
        System.out.println("pop: " + test.popElement());
        System.out.println("peek: " +  test.peekElement());
        System.out.println("traverse");
        test.traverse();
    }

    static void mainProgram() {
        try (Scanner in = new Scanner(System.in)) {
            Object userInput = new Object();
            DataStructures ds;
            System.out.println("Enter Data Structure");
            System.out.printf("%s\n%s\n%s",
                "1. Stack",
                "2. Queue",
                "Input: "
            );
            userInput = in.nextLine();
            switch (userInput) {
                case "1":
                    ds = new Stack();
                    break;
                case "2":
                    ds = new TestQueue();
                    break;
                default:
                    throw new InputMismatchException();
            }
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n",
                "Enter Operation",
                "1. Push",
                "2. Pop",
                "3. Peek",
                "4. isEmpty",
                "5. Size"
            );
            while(!userInput.equals("-1")) {
                System.out.print("Input: ");
                userInput = in.nextLine();
                switch (userInput) {
                    case "1":
                        System.out.print("Enter value to add: ");
                        String temp = in.nextLine();
                        ds.pushNew(Integer.parseInt(temp));
                        System.out.println("Pushed " + temp);
                        break;
                    case "2":
                        System.err.println("Popped " + ds.popElement());
                        break;
                    case "3":
                        System.err.println("Peeked " + ds.peekElement());
                        break;
                    case "4":
                        System.out.println("isEmpty?: " + ds.isEmpty());
                        break;
                    case "5":
                        System.out.println("Size: " + ds.getSize());
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            }
            System.exit(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid Input");
        } catch (Exception e) {
            System.out.println("an Exception occured");
        }
    }

    public static void testProgram() {
        System.out.println("Stack");
        testStack();
        System.out.println("\n\nQueue");
        testQueue();
    }

    public static void main(String[] args) {
        mainProgram();
    }
}

interface DataStructures {
    public boolean isEmpty();
    public void pushNew(Object element);
    public Object popElement();
    public Object peekElement();
    public int getSize();
    public void traverse();
}

class Stack implements DataStructures {
    private int size;
    private List<Object> store;
    Stack() {
        this.store = new ArrayList<Object>();
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void pushNew(Object element) {
        this.store.add(element);
        this.size += 1;
    }

    public Object popElement() {
        if (!this.isEmpty()) {
            Object temp = this.store.get(this.size - 1);
            this.store.remove(this.size - 1);
            this.size -= 1;
            return temp;
        }
        System.out.println("Stack is empty.");
        return null;
     
    }

    public Object peekElement() {
        if (!this.isEmpty()) {
            return store.getLast();
        }
        System.out.println("Stack is empty.");   
        return 0;
    }

    public int getSize() {
        return this.size;
    }

    public void traverse() {
        List<Object> current = this.store;
        for(int i = this.getSize() - 1; i > -1; i--) {
            System.out.println(i);
        }
    }
}

class TestQueue implements DataStructures {
    private int size;
    private List<Object> store;

    TestQueue() {
        this.size = 0;
        store = new ArrayList<Object>();
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void pushNew(Object element) {
        this.store.add(element);
        this.size += 1;
    }

    public Object popElement() {
        if (!this.isEmpty()) {
            Object temp = this.store.getFirst();
            this.store.remove(0);
            this.size -= 1;
            return temp;
        }
        System.out.println("Queue is empty.");
        return 0;
    }

    public Object peekElement() {
        if (!this.isEmpty()) {
            return this.store.get(0);
        }
        System.out.println("Queue is empty.");
        return 0;
    }

    public int getSize() {
        return this.size;
    }

    public void traverse() {
        List<Object> current = this.store;
        for(Object i : current) {
            System.out.println(i);
        }
    }
}