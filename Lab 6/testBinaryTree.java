
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testBinaryTree.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testBinaryTree
{
    /**
     * Default constructor for test class testBinaryTree
     */
    public testBinaryTree()
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

    @Test public void testPreOrderString(){
        //test a method that should return a string through a preorder traversal of a tree
        //create a binary search tree
        Integer entry = 23;
        BinaryNode node = new BinaryNode(entry);
        BinarySearchTree tree = new BinarySearchTree(node);
        //add a set of numbers
        entry = 4;
        tree.insert(entry);
        entry = 57;
        tree.insert(entry);
        entry = 1;
        tree.insert(entry);
        entry = 67;
        tree.insert(entry);
        entry = 81;
        tree.insert(entry);
        entry = 3;
        tree.insert(entry);
        entry = 7;
        tree.insert(entry);
        //call pre order
        String result = tree.preOrderString();
        //check the result
        if(result=="23,4,1,3,7,57,67,81,"){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        } 
    }

    @Test public void testPostOrderString(){
        //test a method that should return a string through a post order traversal of a tree
        //create a binary search tree
        Integer entry = 23;
        BinaryNode node = new BinaryNode(entry);
        BinarySearchTree tree = new BinarySearchTree(node);
        //add a set of numbers
        entry = 4;
        tree.insert(entry);
        entry = 57;
        tree.insert(entry);
        entry = 1;
        tree.insert(entry);
        entry = 67;
        tree.insert(entry);
        entry = 81;
        tree.insert(entry);
        entry = 3;
        tree.insert(entry);
        entry = 7;
        tree.insert(entry);
        //call pre order
        String result = tree.postOrderString();
        //check the result
        if(result=="3,1,7,4,81,67,57,23,"){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        } 
    }

    @Test public void testInOrderString(){
        //test a method that should return a string through a in order traversal of a tree
        //create a binary search tree
        Integer entry = 23;
        BinaryNode node = new BinaryNode(entry);
        BinarySearchTree tree = new BinarySearchTree(node);
        //add a set of numbers
        entry = 4;
        tree.insert(entry);
        entry = 57;
        tree.insert(entry);
        entry = 1;
        tree.insert(entry);
        entry = 67;
        tree.insert(entry);
        entry = 81;
        tree.insert(entry);
        entry = 3;
        tree.insert(entry);
        entry = 7;
        tree.insert(entry);
        //call pre order
        String result = tree.inOrderString();
        //check the result
        if(result=="31,3,4,7,23,57,67,81,"){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        }     
    }

    @Test public void testEmpty(){
        //test a method that should empty a Binary Tree
        //create a full binary tree
        Integer entry = 23;
        BinaryNode node = new BinaryNode(entry);
        BinarySearchTree tree = new BinarySearchTree(node);
        //add a set of numbers
        entry = 4;
        tree.insert(entry);
        entry = 57;
        tree.insert(entry);
        entry = 1;
        tree.insert(entry);
        entry = 67;
        tree.insert(entry);
        entry = 81;
        tree.insert(entry);
        entry = 3;
        tree.insert(entry);
        entry = 7;
        tree.insert(entry);
        //empty the tree
        tree.empty();
        //check if the tree is empty
        if(tree==null){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        }    
    }

    @Test public void testIsEmpty(){
        //test a method that should return if a tree is empty
        //create a full tree
        Integer entry = 23;
        BinaryNode node = new BinaryNode(entry);
        BinarySearchTree tree = new BinarySearchTree(node);
        //add a set of numbers
        entry = 4;
        tree.insert(entry);
        entry = 57;
        tree.insert(entry);
        entry = 1;
        tree.insert(entry);
        entry = 67;
        tree.insert(entry);
        entry = 81;
        tree.insert(entry);
        entry = 3;
        tree.insert(entry);
        entry = 7;
        tree.insert(entry);
        //now an empty tree
        BinaryNode node2 = new BinaryNode(entry);
        BinarySearchTree emptyTree = new BinarySearchTree(node2);
        emptyTree.empty();
        //if the full tree returns false and the empty tree returns true test passes
        if(tree.isEmpty()&&!emptyTree.isEmpty()){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        }    
    }

    @Test public void testNumOfElementsDepth(){
        //test a method that should return the number of elements at a certain depth in a tree
        //create a binary tree
        Integer entry = 23;
        BinaryNode node = new BinaryNode(entry);
        BinarySearchTree tree = new BinarySearchTree(node);
        //add a set of numbers
        entry = 4;
        tree.insert(entry);
        entry = 57;
        tree.insert(entry);
        entry = 1;
        tree.insert(entry);
        entry = 67;
        tree.insert(entry);
        entry = 81;
        tree.insert(entry);
        entry = 3;
        tree.insert(entry);
        entry = 7;
        tree.insert(entry);
        //see if the number of nodes at each level is correct
        if(tree.numOfElementsDepth(0)==1&&tree.numOfElementsDepth(1)==2&&tree.numOfElementsDepth(2)==3&&tree.numOfElementsDepth(3)==2){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        } 
    }

    @Test public void testFindMax(){
        //test a method that should return the max of a binary tree
        //create a binary tree
        Integer entry = 23;
        BinaryNode node = new BinaryNode(entry);
        BinarySearchTree tree = new BinarySearchTree(node);
        //add a set of numbers
        entry = 4;
        tree.insert(entry);
        entry = 57;
        tree.insert(entry);
        entry = 1;
        tree.insert(entry);
        entry = 67;
        tree.insert(entry);
        entry = 81;
        tree.insert(entry);
        entry = 3;
        tree.insert(entry);
        entry = 7;
        tree.insert(entry);
        //if the max is correct test passes
        if(tree.findMax().compareTo(81)==0){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        } 
    }

    @Test public void testFindMin(){
        //test a method that should return the max of a binary tree
        //create a binary tree
        Integer entry = 23;
        BinaryNode node = new BinaryNode(entry);
        BinarySearchTree tree = new BinarySearchTree(node);
        //add a set of numbers
        entry = 4;
        tree.insert(entry);
        entry = 57;
        tree.insert(entry);
        entry = 1;
        tree.insert(entry);
        entry = 67;
        tree.insert(entry);
        entry = 81;
        tree.insert(entry);
        entry = 3;
        tree.insert(entry);
        entry = 7;
        tree.insert(entry);
        //if the max is correct test passes
        if(tree.findMin().compareTo(1)==0){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        } 
    }

    /**
     * A method that returns true if insertion was successful, false otherwise.
     */
    public void testInsert(){
        //test a method that should insert an element and return whether it was inserted
        //create a tree
        Integer entry = 23;
        Integer entry2 = 35;
        BinaryNode node = new BinaryNode(entry);
        BinarySearchTree tree = new BinarySearchTree(node);
        if(!tree.insert(entry)&&tree.insert(entry2)){
            System.out.println(true);    
        }else{
            System.out.println(false);     
        } 
    }

    /**
     * A method that returns true if tree contains specified key, false otherwise.
     */
    public void testContains(){
        //test a method that should return if a tree contains an element
        //create a tree
        Integer entry = 23;
        Integer entry2 = 35;
        BinaryNode node = new BinaryNode(entry);
        BinarySearchTree tree = new BinarySearchTree(node);
        if(tree.contains(entry)&&!tree.contains(entry2)){
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
