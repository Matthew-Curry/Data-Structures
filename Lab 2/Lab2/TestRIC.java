
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestRIC.
 *Identify the valid "normal" case and test at least two combinations.
● Identify the valid boundary conditions and test each of them.
● Identify the invalid boundary conditions and test each of the ones that are
handled by the method, either through an exception or the return of a flag or
an error code.
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestRIC
{
    /**
     * Default constructor for test class TestRIC
     */
    public TestRIC()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    @Test
    public void testAddToFrontNC(){
        //test a method that elements to the front of the array
        RandomIntegerContainer myRIC = new RandomIntegerContainer();
        myRIC.addToFront(4);
        myRIC.addToFront(-7);
        //Build the calculated answer
        Integer[] theAns = myRIC.returnArray();
        //Build the true answer
        Integer[] trueAns = new Integer[] {-7, 4};
        assertArrayEquals(theAns, trueAns);
        //reminder: returnArray method imput ArrayList output Array
    }

    @Test
    public void testAddSortedNC(){
        //test a method that adds an element to an ordered array in numerical order
        RandomIntegerContainer myRIC1 = new RandomIntegerContainer();
        //Use add to front to create an already ordered array including integer set (1,3,4)
        myRIC1.addToFront(4);
        myRIC1.addToFront(3);
        myRIC1.addToFront(1);
        //use AddSorted to add the number 2 and see if order is perserved
        myRIC1.addSorted(2);
        //Build the calculated answer
        Integer[] theAns1 = myRIC1.returnArray();
        //Build the true answer
        Integer[] trueAns1 = new Integer[] {1,2,3,4};
        //check if arrays equal
        assertArrayEquals(theAns1, trueAns1);

        //Check for adding a number that should go at the front of the set (1,3,4)
        RandomIntegerContainer myRIC2 = new RandomIntegerContainer();
        //Use add to front to create an already ordered array including integer set (1,3,4)
        myRIC2.addToFront(4);
        myRIC2.addToFront(3);
        myRIC2.addToFront(1);
        //use AddSorted to add the number 0 and see if order is perserved
        myRIC2.addSorted(0);
        //build calculated answer
        Integer[] theAns2 = myRIC2.returnArray();
        //Build the true answer
        Integer[] trueAns2 = new Integer[] {0,1,3,4};
        //check if arrays equal
        assertArrayEquals(theAns2, trueAns2);

        //Check for adding a number that should go at the end of the set (1,3,4)
        RandomIntegerContainer myRIC3 = new RandomIntegerContainer();
        //Use add to front to create an already ordered array including integer set (1,3,4)
        myRIC3.addToFront(4);
        myRIC3.addToFront(3);
        myRIC3.addToFront(1);
        //use AddSorted to add the number 0 and see if order is perserved
        myRIC3.addSorted(5);
        //build calculated answer
        Integer[] theAns3 = myRIC3.returnArray();
        //Build the true answer
        Integer[] trueAns3 = new Integer[] {1,3,4,5};
        //check if arrays equal
        assertArrayEquals(theAns3, trueAns3);
    }

    @Test
    public void testBubbleSortNC(){
        //test a method that should use a bubble sort to sort an unsorted Integer Container
        RandomIntegerContainer myRIC = new RandomIntegerContainer();
        //use add to front method to create unordered integer container including set (5,3,7,2,8,0)
        myRIC.addToFront(0);
        myRIC.addToFront(8);
        myRIC.addToFront(2);
        myRIC.addToFront(7);
        myRIC.addToFront(3);
        myRIC.addToFront(5);
        //use the bubble sort
        myRIC.bubbleSort();
        //build the calculated answer
        Integer[] theAns = myRIC.returnArray();
        //build the true anser
        Integer[] trueAns = new Integer[] {0,2,3,5,7,8};
        //check if arrays equal
        assertArrayEquals(theAns, trueAns);
    }

    @Test
    public void testBubbleSortUniqueNC(){
        //test a method that should sort an unsorted Integer Container and remove all repeating values
        RandomIntegerContainer myRIC = new RandomIntegerContainer();
        //Use add to front to create an unordered array with repeating values using the set (5,3,7,2,5,5,3,7)
        myRIC.addToFront(7);
        myRIC.addToFront(3);
        myRIC.addToFront(5);
        myRIC.addToFront(5);
        myRIC.addToFront(2);
        myRIC.addToFront(7);
        myRIC.addToFront(3);
        myRIC.addToFront(5);
        //use the bubble sort unique
        myRIC.bubbleSortUnique();
        //build the calculate answer
        Integer[] theAns = myRIC.returnArray();
        //build the correct answer
        Integer[] trueAns = new Integer[] {2,3,5,7};
        //check if the arrays are equal
        assertArrayEquals(theAns,trueAns);
    }
}