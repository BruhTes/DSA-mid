class stackUsingArrays{
    int capacity, top;
    int[] array;

    StackUsingArrays(int capacity){
        this.capacity = capacity;
        array = new int[capacity];
        top = -1;
    }
    
    boolean isFull() {
        return capacity - 1 == top;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full.");
        } else {
            array[top++] = item;
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
        } else {
            top--;
        }
    }
}

public static void main(String[] args){
    StackUsingArrays newStack = new StackUsingArrays(2);
    newstack.push(2);
    newStack.push(1);
    newStack.pop();
}