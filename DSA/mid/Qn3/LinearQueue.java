public class LinearQueue {
    class QueueUsingStacks {
        StackUsingArrays stack1;
        StackUsingArrays stack2;

        QueueUsingStacks(int size){
            stack1 = new StackUsingArrays(size);
            stack2 = new StackUsingArrays(size);
        }

        void enqueue (int item) {
            if (! stack1.isFull()){
                stack1.push(item);
            } else {
                System.out.println("Overflow");
            }
        }

        void dequeue() {
            if (stack1.isEmpty()) {
                System.out.println("It is Empty");
            } else {
                while (! stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }

                stack2.pop();

                while (stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }
            }
        }
    }

    public static void main(String[] args{
        QueueUsingStacks queue = new QueueUsingStacks(3);
        queue.enqueue(23);
        queue.enqueue(25);
        queue.dequeue();
    }
}