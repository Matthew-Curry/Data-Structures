
/**
 * Write a description of interface Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Tree<E>
{
    /**
     * A method that returns true if insertion was successful, false otherwise.
     */
    boolean insert(E e);

    /**
     * A method that returns true if tree contains specified key, false otherwise.
     */
    boolean contains(E e);

    /**
     * A method that returns the number of elements at a certain depth i.
     */
    int numOfElementsDepth(int i);

    /**
     * Finds and returns the largest item in the tree
     */
    E findMax();

    /**
     * Finds and returns the smallest item in the tree
     */
    E findMin();

    /**
     * Returns a string using preorder traversal
     */
    String preOrderString();

    /**
     * Returns a string using postorder traversal
     */
    String postOrderString();

    /**
     * Returns a string using inorder traversal  
     */
    String inOrderString();

    /**
     * Empties the tree  
     */
    void empty();

    /**
     * Returns true if there are no items in the true, else false
     */
    boolean isEmpty();
}
