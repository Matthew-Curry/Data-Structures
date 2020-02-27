
/**
 * Abstract class BinaryTree - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class BinaryTree<E> implements Tree<E>
{
    //the string containing the elements
    String order;
    //the root of the tree
    BinaryNode root;
    //the isEmpty boolean
    boolean empty;
    //the number of elements at a given depth
    int num;
    //the counter for the depth
    int count = -1;
    public String preOrderString(){
        //reset the string to null
        order = "";
        //call the helper method
        helperPreOrderString(root);
        //return the string
        return order;
    }

    public void helperPreOrderString(BinaryNode<E> node){
        //if the node is null, do nothing
        if(node==null){
            return;    
        }
        order += node.getElement()+",";
        //recursively call on the left subtree if there is a left node
        if(node.hasLeft()){
            helperPreOrderString(node.left);
        }
        //recursively call on the right subtree if there is a right node
        if(node.hasRight()){
            helperPreOrderString(node.right);
        }   
    }

    public String postOrderString(){
        order = "";
        //call the helper method
        helperPostOrderString(root);
        //return the string
        return order;
    }

    public void helperPostOrderString(BinaryNode<E> node){
        //if the node is null, do nothing
        if(node==null){
            //System.out.println("Checking if the node is null");
            return;    
        }
        //recursively call on the left subtree if there is a left node
        if(node.hasLeft()){
            //System.out.println("Going left");
            helperPostOrderString(node.left);
        }
        //recursively call on the right subtree if there is a right node
        if(node.hasRight()){
            //System.out.println("Going right");
            helperPostOrderString(node.right);
        }
        //add to the string
        order += node.getElement()+",";
    }

    public String inOrderString(){
        //reset the string to null
        order = "";
        //call the helper method
        helperInOrderString(root);
        //return the string
        return order;
    }

    public void helperInOrderString(BinaryNode<E> node){
        //if the node is null, do nothing
        if(node==null){
            return;    
        }
        //recursively call on the left subtree if there is a left node
        if(node.hasLeft()){
            helperInOrderString(node.left);
        }
        //first add entry of the node
        order += node.getElement()+","; 
        //recursively call on the right subtree if there is a right node
        if(node.hasRight()){
            helperInOrderString(node.right);
        }     
    }
    
    public void empty(){
        //call helperEmpty passing the root node
        helperEmpty(root);
    }

    public void helperEmpty(BinaryNode<E> node){
        //if the node is null, do nothing
        if(node==null){
            return;    
        }
        //remove the element at the node
        node.removeElement();
        //recursively call on the left subtree if there is a left node
        if(node.hasLeft()){
            helperEmpty(node.left);
        }
        //recursively call on the right subtree if there is a right node
        if(node.hasRight()){
            helperEmpty(node.right);
        }      
    }

    public boolean isEmpty(){
        //empty is false
        empty = false;
        //pass the root to the helper
        helperIsEmpty(root); 
        //return empty
        return empty;
    }

    public void helperIsEmpty(BinaryNode<E> node){
        //if the node is null, do nothing
        if(node==null){
            return;    
        }
        //check if the node is null
        if(node.hasElement()==true){
            //the tree is not empty
            empty = false;
            return;
        }else{
            //so far the tree is empty
            empty = true;     
        }
        //recursively call on the left subtree if there is a left node
        if(node.hasLeft()){
            helperIsEmpty(node.left);
        }
        //recursively call on the right subtree if there is a right node
        if(node.hasRight()){
            helperIsEmpty(node.right);
        }      
    }    

    public int numOfElementsDepth(int depth){
        //reset the number of elements
        num = 0;
        //traverse the tree and find the number of elements at that depth
        helperNumOfElementsDepth(depth, root);
        return num;
    }

    public void helperNumOfElementsDepth(int depth, BinaryNode<E> node){
        //initialize a count to check depth
        count++;
        if(count == depth){
            //count the node
            num++;
            //reset the count
            count = -1;
            //stop this track
            return;
        }
        if(node ==null){
            return;     
        }
        //go left
        helperNumOfElementsDepth(depth, node.left);
        //go right
        helperNumOfElementsDepth(depth, node.right);
    }
}

