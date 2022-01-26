import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Declare scanner and choice
        Scanner input = new Scanner(System.in);
        int choice;

        //Infinite while loop for question choice
        while (true)
        {
            //Prompt user menu
            System.out.println("CSC1009 Week 04 Lab");
            System.out.println("1 - Question 1");
            System.out.println("2 - Question 2");
            System.out.println("3 - Question 2 Custom stack");
            System.out.println("0 - Exit");
            System.out.println("----------------------------");
            System.out.print("Enter a number: ");
            //Take in user input
            choice = input.nextInt();

            //Break if 0
            if(choice == 0)
                break;

            //Run choice question
            switch (choice) {
                case 1 -> Question_01(input);
                case 2 -> Question_02();
                case 3 -> Question_02_Custom(input);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void Question_01(Scanner input)
    {
        //Containers
        double weight,height;
        //Prompt user for input
        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        height = input.nextDouble();

        //Create new obj
        BMI myBMI = new BMI(weight,height);

        //Print Results
        System.out.println("BMI is: " + myBMI.getBMI());
        System.out.println(myBMI.getInterpretation());

        //Remove obj
        myBMI = null;
    }

    static void Question_02()
    {
        //Make new stack obj
        StackOfIntegers stack = new StackOfIntegers();

        //Push value into stack
        for(int i = 0; i < 10; ++i)
            stack.push(i);

        //Pop all values from stack
        while (!stack.empty())
            System.out.print(stack.pop() + " ");

        //Create a new line
        System.out.println();
        //Delete obj
        stack = null;
    }

    static void Question_02_Custom(Scanner input)
    {
        //Ask user to create array or use default array
        System.out.println("Stack Question (Press number to select)");
        System.out.println("1 - Use default Stack size");
        System.out.println("2 - Use custom Stack size");
        System.out.print("Input: ");
        //Take in user choice
        int choice = input.nextInt();

        //Build the stack
        //Declare the stack obj
        StackOfIntegers myStack;

        //Declare new container to store size
        int sizeOfContainer = 0;
        //If custom stack ask user to input size
        if(choice == 2)
        {
            System.out.print("Enter the stack size:");
            sizeOfContainer = input.nextInt();
        }

        //Create Stack Obj
        myStack = (choice == 2? new StackOfIntegers(sizeOfContainer): new StackOfIntegers());

        //While loop to ask user for stack operation
        //This while loop will never stop
        while(true)
        {
            //Reset choices
            choice = -1;
            //Print menu
            System.out.println("Stack Operation... (Press number to select)");
            System.out.println("1 - Push a number");
            System.out.println("2 - Pop a number");
            System.out.println("3 - Peek at top value of stack");
            System.out.println("0 - Exit");
            System.out.println("-------------------------------------------");
            System.out.print("Enter a number: ");
            choice = input.nextInt();

            //Check if need to break while loop
            if(choice <= 0)
                break;
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a number: ");
                    choice = input.nextInt();
                    myStack.push(choice);
                }
                case 2 -> System.out.println("Number Popped: " + myStack.pop());
                case 3 -> System.out.println("Top number: " + myStack.peek());
                default -> System.out.println("Invalid choice");
            }
        }

        //Delete the obj
        myStack = null;
    }
}
