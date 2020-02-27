

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MILtest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MILtest
{
    /**
     * Default constructor for test class MILtest
     */
    public MILtest()
    {
    }
    @Before
    public void setUp()
    {
    }
    
    @Test public void addBgnNC(){
    //test a method that should add to the begining of an integer list
    //create an integer list
    MyIntegerList list = new MyIntegerList();
    //add an item to the begining and check if it is the first node in the list
    list.addBgn(1);
    list.addBgn(2);
    list.addBgn(3);
    //if method works should produce string "321"
    String S = list.toString();
    //check if correct string
    if(S == "321"){
    System.out.println(true);    
    }
    else{
    System.out.println(false);    
    }
    }
    
    @Test public void addEndNC(){
    //test a method that should add to the end of an integer list
    //create an integer list
    MyIntegerList list = new MyIntegerList();
    //add an item to the begining and check if it is the first node in the list
    list.addEnd(1);
    list.addEnd(2);
    list.addEnd(3);
    //if method works should produce string "123"
    String S = list.toString();
    //check if correct string
    if(S == "123"){
    System.out.println(true);    
    }
    else{
    System.out.println(false);    
    }
    }
    
    @Test public void toStringNC(){
    //test a method that should add to the end of an integer list
    //create an integer list
    MyIntegerList list = new MyIntegerList();
    //fill the list
    list.addEnd(1);
    list.addEnd(2);
    list.addEnd(3);
    list.addEnd(4);
    list.addEnd(5);
    list.addEnd(6);
    list.addEnd(7);
    list.addEnd(8);
    list.addEnd(9);
    //now print to string
    String p = list.toString();
    //check if the string equals what it should, "123456789"
    if(p == "123456789"){
    System.out.println(true);    
    }
    else{
    System.out.println(false);    
    }
    }
    
    @Test public void sizeNC(){
    //test a method that should add to the end of an integer list
    //create an integer list
    MyIntegerList list = new MyIntegerList();
    //fill the list
    list.addEnd(1);
    list.addEnd(2);
    list.addEnd(3);
    list.addEnd(4);
    list.addEnd(5);
    list.addEnd(6);
    list.addEnd(7);
    list.addEnd(8);
    list.addEnd(9);
    //now get the size
    int size = list.size();
    //check if the string equals what it should, 9
    if(size == 9){
    System.out.println(true);    
    }
    else{
    System.out.println(false);    
    }
    }
    
    
    @After
    public void tearDown()
    {
    }
}
