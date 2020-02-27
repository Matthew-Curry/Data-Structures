

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MLNtest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MLNtest
{
    /**
     * Default constructor for test class MLNtest
     */
    public MLNtest()
    {
    }
    @Before
    public void setUp()
    {
    }
    
    @Test public void getElementTestNC(){
    //test the get element method    
    //create a node and set the element
    MyLinkedNode node = new MyLinkedNode();
    //set an element
    node.setElement(5);
    //now get the element
    Object got = node.getElement();
    //check equality
    if((Integer)got == 5){
    System.out.println(true);    
    }
    else{
    System.out.println(false);     
    }
    }
    
    @Test public void setElementTestNC(){
    //test the get element method    
    //create a node and set the element
    MyLinkedNode node = new MyLinkedNode();
    //set an element
    node.setElement(5);
    //now get the element
    Object got = node.getElement();
    //check equality
    if((Integer)got == 5){
    System.out.println(true);    
    }
    else{
    System.out.println(false);     
    }
    }
    
    @Test public void setLinkTestNC(){
    //test the set link method   
    //create a node and set the link
    MyLinkedNode node = new MyLinkedNode();
    //create the node to lin
    MyLinkedNode link = new MyLinkedNode();
    //set an element
    node.setLink(link);
    //now get the link, check if the same as link
    MyLinkedNode got = node.getLink();
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
    MyLinkedNode node = new MyLinkedNode();
    //create the node to lin
    MyLinkedNode link = new MyLinkedNode();
    //set an element
    node.setLink(link);
    //now get the link, check if the same as link
    MyLinkedNode got = node.getLink();
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
