package Practice;

public class StackLL {
    static class Node {
        int data;  
        Node next;                            //reference to the next node

        Node(int data) {
            this.data = data;
            next = null;                      //reference set to null by default for the created newNode
        }
    }

    static class Stack {
        public static Node head;              //reference to the top node

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;               //if its the first node then assign it as head
                return;
            }
            newNode.next = head;              //the reference of the consecutive new nodes must be point to the previous head
            head = newNode;                   //Declare the new node as new head
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack UnderFlow");
                return -1;
            }
            int top = head.data;                //top to hold the head
            head = head.next;                   //make head move one step back by making it refer to the previous head
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack UnderFlow");
                return -1;
            }
            return head.data;
        }

        public void pushAtBottom(int data) {
            if (isEmpty()) {
                push(data);
                return;
            }
            int top = pop();                       //here remember to pop() or rewrite the entire pop function
            pushAtBottom(data);
            push(top);
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pushAtBottom(4);
        while (!s.isEmpty()) {
            System.out.print("\nThe Top element is: ");
            System.out.print(s.peek());
            s.pop();
        }
    }
}

