
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testNode.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testNode
{
    /**
     * Default constructor for test class testNode
     */
    public testNode()
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

    @Test public void testGetElement(){
        //test a method that should get the element from the node
        //create an instance of binary node
        //set the element
        String entry = "Added string";
        //create an instance of binary node
        BinaryNode node = new BinaryNode(entry);
        //get the element
        String got = (String)node.getElement();
        //if the got element is the same as the one passed to the constructor, the test passes
        if(entry==got){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        }
    }

    @Test public void testSetElement(){
        //test a method that should set the element of a node
        //the initial string passed to the constructor
        String first = "first";
        //create an instance of the node
        BinaryNode node = new BinaryNode(first);
        //now set the element to something different
        String change = "change";
        node.setElement(change);
        //retrieve the element
        String got = (String)node.getElement();
        if(got==change){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        }
    }

    @Test public void testRemoveElement(){
        //test a method that should make an objects contents null
        //create an instance of the node and pass a string
        String first = "first";
        //create an instance of the node
        BinaryNode node = new BinaryNode(first);
        //now remove the element
        node.removeElement();
        //if the node is null, the test passes
        if(node.getElement()==null){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        }
    }

    @Test public void testRemoveLeft(){
        //test a method that should remove the left link of a node
        //create a node and set a left link
        BinaryNode node = new BinaryNode("first");
        node.left = new BinaryNode("left");
        //remove the left node
        node.removeLeft();
        //if the left node is null, test passes
        if(node.left==null){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        }   
    }

    @Test public void testRemoveRight(){
        //test a method that should remove the right link of a node
        //create a node and set a right link
        BinaryNode node = new BinaryNode("first");
        node.right = new BinaryNode("right");
        //remove the left node
        node.removeRight();
        //if the left node is null, test passes
        if(node.right==null){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        }       
    }

    @Test public void testHasElement(){
        //test a method that should return whether a binary node contains an element
        //make a binary node with an element
        BinaryNode node = new BinaryNode("has");
        //make a node that has no element
        BinaryNode empty = new BinaryNode("will remove");
        empty.removeElement();
        if(node.hasElement()&&!empty.hasElement()){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        } 
    }

    @Test public void testHasRight(){
        //test a method that should return whether or not a node has a right node
        //create a node with a right link
        BinaryNode node = new BinaryNode("first");
        node.right = new BinaryNode("right");
        //create a node with no right link
        BinaryNode noLink = new BinaryNode("no link");
        //test passes if node with right link true and with no link false
        if(node.hasRight()&&!noLink.hasRight()){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        } 
    }

    @Test public void testHasLeft(){
        //test a method that should return whether or not a node has a right node
        //create a node with a left link
        BinaryNode node = new BinaryNode("first");
        node.left = new BinaryNode("right");
        //create a node with no left link
        BinaryNode noLink = new BinaryNode("no link");
        //test passes if node with right link true and with no link false
        if(node.hasLeft()&&!noLink.hasLeft()){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        } 
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
