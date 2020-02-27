import java.util.ArrayList;
/**
 * Write a description of class Controller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controller
{
    //the binary search tree
    BinarySearchTree tree;
    public static void main(String[] args){
        //create an instance of the controller
        Controller con = new Controller();
        //run the experiment
        con.run(args);
    }

    public void run(String[] args){
        //the first value passed is the root of the tree
        String e = args[0];
        //converted to an integer
        Integer entry = Integer.valueOf(e);
        //the node
        BinaryNode root = new BinaryNode(entry);
        //use as the root
        tree = new BinarySearchTree(root);
        //after instantiating the root, the user should be able to add as many nodes as they like
        addNodes(args);
    }

    public void addNodes(String[] args){
        //for every passed value, add to the binary search tree
        for(int i=0;i<args.length;i++){
            //take the argument
            String e = args[i];
            //converted to an integer
            Integer entry = Integer.valueOf(e);
            //add to the tree
            tree.insert(entry);
        }
        //after instantiating the tree, test the provided conditions
        experiment();
    }
    
    public void experiment(){
        //try to insert an already present number and print that it failed
        System.out.println("Try to insert 23");
        try{
            Integer entry = 23;
            System.out.println("Insert Success:"+tree.insert(entry));
        }catch(Exception e){
            System.out.println("tried to insert a number that already exists");    
        }
        //search for a number in the list and one not in the list
        //in the list
        Integer entry = 23;
        System.out.println("Search for 23");
        if(tree.contains(entry)){
            System.out.println("Item found");    
        }else{
            System.out.println("Item not found");    
        }
        //not in the list
        entry = 345;
        System.out.println("Search for 345");
        if(tree.contains(entry)){
            System.out.println("Item found");    
        }else{
            System.out.println("Item not found");    
        }
        //print out the number of elements at depth 2
        System.out.println("Number of elements at depth 2:"+tree.numOfElementsDepth(2));
        //print out the largest element in the tree
        System.out.println("The Largest Element in the Tree:"+tree.findMax());
        //print out the smallest element in the tree
        System.out.println("The Smallest Element in the Tree:"+tree.findMin());
        //print out the three strings from the three transversal
        System.out.println("Preorder Transversal:"+tree.preOrderString());
        System.out.println("Postorder Transversal:"+tree.postOrderString());
        System.out.println("Inorder Transversal:"+tree.inOrderString());
        //empty the tree and print that it is empty
        tree.empty();
        System.out.println("The tree is empty:"+tree.isEmpty());
    }
}
