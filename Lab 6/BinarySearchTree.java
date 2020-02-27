
/**
 * Write a description of class BinarySearchTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E>
{
    //the max of the tree
    E max;
    //the min of the tree
    E min;
    //boolean is true if insertion succeeds
    boolean insert;
    //boolean if the tree contains a given element
    boolean contains;
    /**
     * Constructor for objects of class BinarySearchTree
     */
    public BinarySearchTree(BinaryNode node)
    {
        //the passed node is the root
        this.root = node;
    }

    /**
     * Finds and returns the largest item in the tree
     */
    public E findMax(){
        //traverse right until you can't anymore
        helperFindMax(root);
        return max;
    }

    public void helperFindMax(BinaryNode<E> node){
        if(node==null){
            //stop 
            return;
        }
        else if(node.hasRight()){
            node = node.right;
            max = node.getElement();
            helperFindMax(node);
        }else{
            //stop
            return;
        }
    }

    /**
     * Finds and returns the smallest item in the tree
     */
    public E findMin(){
        //traverse left until you can't anymore
        helperFindMin(root);
        return min;    
    }

    public void helperFindMin(BinaryNode<E> node){
        if(node==null){
            //stop 
            return;
        }
        else if(node.hasLeft()){
            node = node.left;
            min = node.getElement();
            helperFindMin(node);
        }else{
            //stop
            return;
        }    
    }

    /**
     * A method that returns true if insertion was successful, false otherwise.
     */
    public boolean insert(E e){
        helperInsert(root, e);
        return insert;
    }

    public void helperInsert(BinaryNode<E> node, E e){
        //insert a node into the right place (always inserted as a leaf)
        if(node==null){
            return;    
        }
        //no duplicates
        if(e.compareTo(node.getElement())==0){
            return;   
        }
        //call on left node if element is smaller
        else if(e.compareTo(node.getElement())<0&&node.left!=null){
            node = node.left;
            helperInsert(node, e);
        }
        //call on right node if element is bigger
        else if(e.compareTo(node.getElement())>0&&node.right!=null){
            node = node.right;
            helperInsert(node, e);
        }
        //if element is bigger and there is no node, insert
        else if(e.compareTo(node.getElement())>0&&node.right==null){
            node.right = new BinaryNode(e);
            //System.out.println("Inserted:"+node.right.getElement());
            insert = true;
        }
        //if element is smaller and there is no node, insert
        else if(e.compareTo(node.getElement())<0&&node.left==null){
            node.left = new BinaryNode(e); 
            insert = true;
        }
    }

    /**
     * A method that returns true if tree contains specified key, false otherwise.
     */
    public boolean contains(E e){
        helperContains(root, e);    
        return contains;
    }
    
    public void helperContains(BinaryNode<E> node, E e){
        //search to see if a tree contains a given node
        if(node==null){
            return;    
        }
        //return true if equal
        if(e.compareTo(node.getElement())==0){
            contains = true;  
        }
        //call on left node if element is smaller
        else if(e.compareTo(node.getElement())<0&&node.left!=null){
            node = node.left;
            helperContains(node, e);
        }
        //call on right node if element is bigger
        else if(e.compareTo(node.getElement())>0&&node.right!=null){
            node = node.right;
            helperContains(node, e);
        }
        //if element is bigger and there is no node, then it is not in the tree
        else if(e.compareTo(node.getElement())>0&&node.right==null){   
            contains = false;
        }
        //if element is smaller and there is no node, insert
        else if(e.compareTo(node.getElement())<0&&node.left==null){
            contains = false;
        }    
    }
}
