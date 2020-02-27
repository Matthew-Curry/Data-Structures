
/**
 * Write a description of class BinaryNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinaryNode<E>
{
    //the object held by the node
    E object;
    //the left and right linked nodes, respectively
    BinaryNode left;
    BinaryNode right;
    /**
     * Constructor for objects of class BinaryNode
     */
    public BinaryNode(E object)
    {
    this.object = object;
    right = null;
    left = null;
    }
    
    public E getElement(){
    //return the element in the node
    return object;
    }
    
    public void setElement(E element){
        //set the element
        object = element;    
    }
    
    public void removeElement(){
    object = null;    
    }
    
    public void removeLeft(){
    left = null;    
    }
    
    public void removeRight(){
    right = null;    
    }
    
    public boolean hasElement(){
    if(object ==null){
    return false;    
    }else{
    return true;    
    }
    }
    
    public boolean hasRight(){
    //return whether the node has right
    if(right!=null){
    return true;  
    }else{
    return false;   
    }
    }
    
    public boolean hasLeft(){
    //return whether the node has left
    if(left!=null){
    return true;  
    }else{
    return false;   
    }    
    }
}
