public class StackOfIntegers {
    //Declare containers
    private int[] elements;
    private int size;

    //Constructors
    public StackOfIntegers()
    {
        elements = new int[16];
        size = -1;
    }
    //Overloaded Constructor
    public StackOfIntegers(int capacity)
    {
        elements = new int[capacity];
        size = -1;
    }

    //Return if stack is empty
    public Boolean empty()
    {
        return (size == -1);
    }
    //Return Peek value (Value at top of stack)
    public int peek()
    {
        //Safety check
        if(this.size == -1)
            return -9999;
        //Return top stack element
        return (this.elements[this.size]);
    }

    //Push to stack
    public void push(int value)
    {
        //Safety check
        if(this.size >= (this.elements.length - 1))
        {
            System.out.println("Stack Overload");
            return;
        }

        //Increment size(Head)
        ++this.size;
        //Store value into element
        this.elements[this.size] = value;
    }

    //Pop from stack
    public int pop()
    {
        //Safety check
        if(this.size == -1)
        {
            System.out.println("Error no element in stack");
            return -9999;
        }

        //Store head value in a temp variable
        int temp = this.elements[this.size];
        //Pop the value by reducing size
        this.size--;
        //Return temp value
        return temp;
    }

    //Get size of elements present in stack
    public int getSize()
    {
        return (this.size + 1);
    }
}
