
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MINtest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MINtest
{
    /**
     * Default constructor for test class MINtest
     */
    public MINtest()
    {
    }

    @Before
    public void setUp()
    {
    }
  
    @Test public void getElementTestNC(){
    //test the get element method    
    //create a node and set the element
    MyIntegerNode node = new MyIntegerNode();
    //set an element
    node.setElement(5);
    //now get the element
    Integer got = node.getElement();
    //check equality
    if(got == 5){
    System.out.println(true);    
    }
    else{
    System.out.println(false);     
    }
    }
    
    @Test public void setElementTestNC(){
    //test the get element method    
    //create a node and set the element
    MyIntegerNode node = new MyIntegerNode();
    //set an element
    node.setElement(5);
    //now get the element
    Integer got = node.getElement();
    //check equality
    if(got == 5){
    System.out.println(true);    
    }
    else{
    System.out.println(false);     
    }
    }
    
    @Test public void setLinkTestNC(){
    //test the set link method   
    //create a node and set the link
    MyIntegerNode node = new MyIntegerNode();
    //create the node to lin
    MyIntegerNode link = new MyIntegerNode();
    //set an element
    node.setLink(link);
    //now get the link, check if the same as link
    MyIntegerNode got = node.getLink();
    if(got == link){
    System.out.println(true);    
    }
    else
    {
    System.out.println(false);
    }
    }
    
    @Test public void getLinkTestNC(){
    //test the set link method   
    //create a node and set the link
    MyIntegerNode node = new MyIntegerNode();
    //create the node to lin
    MyIntegerNode link = new MyIntegerNode();
    //set an element
    node.setLink(link);
    //now get the link, check if the same as link
    MyIntegerNode got = node.getLink();
    if(got == link){
    System.out.println(true);    
    }
    else
    {
    System.out.println(false);
    }
    }
    
    @After
    public void tearDown()
    {
    }
}
