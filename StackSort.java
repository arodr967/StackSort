/*
File name: StackSort.java
Sort a Stack in ascending order.
 */
//*********PROPERTY OF ALICIA RODRIGUEZ**********
package stacksort;
import java.util.Stack;
//*********PROPERTY OF ALICIA RODRIGUEZ**********
public class StackSort {
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * (a) Write a method in Java to sort a stack of integer numbers, s, in
     * ascending order. You should not make any assumptions about how the stack
     * is implemented. The following are the only functions that should be used
     * to write this program: push, pop, peek, and isEmpty. Hint: use one more
     * stack.(b) What is the running time complexity of your method? Justify.
     * 
     * Time complexity is O(n(log(n))) because you're dividing the problem by 2
     * each time.
     *
     * @param s stack
     * @return a sorted stack
     */
    public static Stack<Integer> sort(Stack<Integer> s) {
        if (s.isEmpty()) //base case
        {//*********PROPERTY OF ALICIA RODRIGUEZ**********
            return s;
        } else {
            Stack<Integer> leftS = new Stack<>();
            Stack<Integer> rightS = new Stack<>();

            int middle = s.pop(); //store the middle term, the top of stack

            while (!s.isEmpty()) {
                int temp = s.pop();

                if (temp < middle) {
                    leftS.push(temp);
                } else {
                    rightS.push(temp);
                }//*********PROPERTY OF ALICIA RODRIGUEZ**********
            } //s is empty
//*********PROPERTY OF ALICIA RODRIGUEZ**********
            sort(leftS);
            sort(rightS);
//*********PROPERTY OF ALICIA RODRIGUEZ**********
            //merge the stacks
            Stack<Integer> temp = new Stack<>();

            while (!rightS.isEmpty()) {
                temp.push(rightS.pop());
            }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
            temp.push(middle);

            while (!leftS.isEmpty()) {
                temp.push(leftS.pop());
            }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
            while (!temp.isEmpty()) {
                s.push(temp.pop());
            }
        }
        return s;//*********PROPERTY OF ALICIA RODRIGUEZ**********
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(4);//*********PROPERTY OF ALICIA RODRIGUEZ**********
        s.push(6);
        s.push(1);
        s.push(12);
        s.push(9);
        s.push(2);

        System.out.println("Initial stack: " + s);
        sort(s);//*********PROPERTY OF ALICIA RODRIGUEZ**********

        System.out.println("Sorted: " + s);//*********PROPERTY OF ALICIA RODRIGUEZ**********
    }
//*********PROPERTY OF ALICIA RODRIGUEZ**********
}//end of StackSort class definition
//*********PROPERTY OF ALICIA RODRIGUEZ**********
