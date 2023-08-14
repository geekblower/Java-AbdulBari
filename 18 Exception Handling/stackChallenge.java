class StackOverflowException extends Exception {
    public String toString() {
        return "Exception : Stack Overflow";
    }
}

class StackUnderflowException extends Exception {
    public String toString() {
        return "Exception : Stack Underflow";
    }
}

class Stack {
    public int arr[], size, top;

    public Stack(int s) {
        size = s;
        top = -1;
        arr = new int[size];
    }

    public void push(int val) throws StackOverflowException {
        if(top == size-1) {
            throw new StackOverflowException();
        }

        top++;
        arr[top] = val;
    }

    public void pop() throws StackUnderflowException {
        if(top == -1) {
            throw new StackUnderflowException();
        }

        top--;
    }
}

public class stackChallenge {
    public static void main(String[] args) {
        Stack st = new Stack(3);

        try {

            st.push(05);
            st.push(10);
            st.push(15);
            st.push(20);
        
        } catch(Exception e) {
            
            System.out.println(e);
        
        }

        try {

            st.pop();
            st.pop();
            st.pop();
            st.pop();
        
        } catch(Exception e) {
            
            System.out.println(e);
        
        }
    }
}