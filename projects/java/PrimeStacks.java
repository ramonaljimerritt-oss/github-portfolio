//**********************************
// Course: COSC-1337-8B
// Name: Ramon Merritt
// Date: 11/20/25
// PrimeNumberStacks
//**********************************
public class PrimeStacks<E> {
	
	// ArrayList to store the elements of the stack.
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    // method adds a new element to the top of the stack.
    public void push(E item) {
        list.add(item);
    }

    // method removes and returns the element at the top of the stack.
    public E pop() {
        // Get the last index (top of the stack).
        int lastIndex = list.size() - 1;

        // Get the element at that index.
        E item = list.get(lastIndex);

        // Remove the element from the list.
        list.remove(lastIndex);

        // Return the removed element.
        return item;
    }

    // method returns the element at the top without removing it.
    public E peek() {
        return list.get(list.size() - 1);
    }

    // method returns true if the stack has no elements.
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // method returns the number of elements in the stack.
    public int getSize() {
        return list.size();
        
    }

}
