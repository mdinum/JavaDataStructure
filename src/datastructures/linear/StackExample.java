package datastructures.linear;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample {
    public static void main(String[] arg){
        StackImplementation obj  = new StackImplementation();
        obj.addData();
        obj.displayData();
        obj.operations();
    }
}

class StackImplementation{
    // Creating an empty Stack
    Stack stackObj;
    //Creating Integer stack
    Stack<Integer> stackSpecificObj = new Stack<>();

    public StackImplementation(){
        stackObj = new Stack();
    }

    public void addData(){
        //without specifying data type, we can store any type of Data
        stackObj.push(5);
        stackObj.push("Hello");
        stackObj.push(10.5);
        stackObj.push(45);
        System.out.println(stackObj);

        stackSpecificObj.push(12);
        stackSpecificObj.push(67);
    }

    public void operations(){
        /*
        there are five operations
        -------------------------------------------------------------------------------------------------
        |Method       |Modifier and Type    | Method Description                                        |
        |-----------------------------------------------------------------------------------------------|
        |empty()      |boolean              | checks the stack is empty or not                          |
        |push(E Item) |E                    | insert an element on to the top of the stack              |
        |pop()        |E                    | return top of the stack ( removed item from the stack )   |
        |peek()       |E                    | return top of the stack ( without removing )              |
        |search(Obj)  |int                  | Search and return the position                            |
        -------------------------------------------------------------------------------------------------
         */
        emptyCheck();
        insertData(15);
        displayData();
        popData();
        displayData();
        peekData();
        displayData();
        searchData(67);

        iterateStack();
        displayData();
        popData();
        displayData();
        peekData();
    }

    public void searchData(int value){
        System.out.println("---------search() Operation ="+value+"------------");
        System.out.println(stackSpecificObj.search(value));
    }

    public void peekData(){
        try {
            System.out.println("---------peek() Operation------------");
            System.out.println(stackSpecificObj.peek());
        } catch (EmptyStackException e){
            System.err.println("No more Data to peek");
        }
    }

    public void popData(){
        try {
            System.out.println("---------pop() Operation------------");
            System.out.println(stackSpecificObj.pop());
        } catch (EmptyStackException e){
            System.err.println("No more Data to pop");
        }
    }

    public void insertData(int value){
        System.out.println("---------insert(object) Operation------------");
        stackSpecificObj.push(value);
    }

    public void emptyCheck(){
        System.out.println("---------empty() Operation------------");
        if(stackSpecificObj.empty()){
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack isn't Empty");
        }
    }

    public void displayData(){
        System.out.println("---------Display Stack------------");
        System.out.println(stackSpecificObj);
    }

    public void iterateStack(){
        System.out.println("---------Iterate Stack------------");
        while(!stackSpecificObj.empty()){
            System.out.println(stackSpecificObj.pop());
        }
    }
}
