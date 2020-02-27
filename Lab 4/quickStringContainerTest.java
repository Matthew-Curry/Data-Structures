

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
/**
 * The test class unsortedStringContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class quickStringContainerTest
{
    /**
     * Default constructor for test class unsortedStringContainerTest
     */
    public quickStringContainerTest()
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
    //test the constructor that takes an array
    @Test public void quickSortedStringContainerTestNC(){
    //test a constructor that takes an array, sorts it and produces a quickSortedStringContainer    
    ArrayList list = new ArrayList<String>();
        list.add("QERWGR");
        list.add("ZSDFGERH");
        list.add("PMTDYJM");
        list.add("FDFGNDTYN");
        list.add("VBCXB");
        list.add("GDGFHDFJ");
        //Take the created list and use it to create a sorted string container
        QuickSortedStringContainer mySC = new QuickSortedStringContainer(list);
        //check if the array in the new sorted string container is the sorted version of the passed array list
        String[] theAns = mySC.returnArray();
        String[] trueAns = new String[]{"FDFGNDTYN","GDGFHDFJ","PMTDYJM","QERWGR","VBCXB","ZSDFGERH"};
        //check if the array are the same
        assertArrayEquals(theAns, trueAns);
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
