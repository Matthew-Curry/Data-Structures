import java.util.Random;
/**
 * Write a description of class ExperimentController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExperimentController
{
    //the number of items in the integer container
    int numberOfItems;
    //the seed
    long seed;
    //the integer containers
    IntegerContainer con = new IntegerContainer();
    /**
     * Constructor for objects of class ExperimentController
     */
    public ExperimentController()
    {

    }

    public static void main(String[] args){
        //create an experiment controller
        ExperimentController exp = new ExperimentController();
        //call the run method
        exp.run(args);
    }

    public void run(String[] args){
        //define number of items and seed
        numberOfItems = Integer.parseInt(args[0]);
        seed = Integer.parseInt(args[1]);
        //fill integer container with parameters 
        //fill(numberOfItems, seed);
        //time to heap sort
        //System.out.println("Time to HeapSort:"+timeToHeapSort());
        //clear the array and generate a new one
        //con.clear();
        fill(numberOfItems, seed);
        //the time to merge
        System.out.println("Time to MergeSort:"+timeToMergeSort());
        
        
        con.clear();
        fill(numberOfItems, seed);
        //time to heap sort
        System.out.println("Time to HeapSort:"+timeToHeapSort());
        //clear the array and generate a new one
        //clear the array and generate a new one
    }

    public void fill(int numberOfItems, long seed){
        //fill with random parameters
        con.addList(numberOfItems, seed);
    }
    
    public long timeToMergeSort(){
    long startTime = System.currentTimeMillis();
    con.mergeSort();
    long stopTime = System.currentTimeMillis();
    long time = stopTime - startTime;
    return time;
    }
    
    public long timeToHeapSort(){
    long startTime = System.currentTimeMillis();
    con.heapSort();
    long stopTime = System.currentTimeMillis();
    long time = stopTime - startTime;
    return time;    
    }
}
