
/**
 * Write a description of class ExperimentController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class ExperimentController
{
    int numberOfItems;
    public static void main(String[] args){
        //create an instance of a random integer container
        ExperimentController r = new ExperimentController();
        //Find the time to run add to front method
        r.timeAddToFront(15,1000);
        //Find the time to run add sorted method
        r.timeAddSorted(15,1000);
        //Find the time to sort integer container with bubble sort
        r.timeSortOfList(15,1000);
        //Find time to sort the integer container with unique bubble sort
        r.timeSortUniqueOfList(15,1000);
        //Find time to bubble sort a second time
        r.timeSortOfSortedList(15,1000);
    }

    public long timeAddToFront(int numberOfItems, int seed){
        //create an instance of a random integer container
        RandomIntegerContainer R = new RandomIntegerContainer();
        //Define set of random numbers
        Random rand = new Random(seed);
        //Mark time before running loop that adds items
        long startTime = System.currentTimeMillis();
        //for the specified number of items, add to the container with addToFront method
        for(int i = 0; i<numberOfItems; i++){
            //the random number
            Integer N = (Integer)rand.nextInt();
            //add the number to the front of the integer container
            R.addToFront(N);
        }
        //record time at end of loop
        long stopTime = System.currentTimeMillis();
        //return the run time
        System.out.println("timeAddToFront: " + (stopTime-startTime));
        return stopTime - startTime;
    }

    public long timeAddSorted(int numberOfItems, int seed){
        //create and instance of a RandomIntegerContainer
        RandomIntegerContainer c = new RandomIntegerContainer();
        //Define the set of random numbers
        Random rand = new Random(seed);
        //record the start time
        long startTime = System.currentTimeMillis();
        //for specified number of items, add to the container sorted 
        for(int i = 0; i < numberOfItems; i++){
            //the random number
            Integer N = (Integer)rand.nextInt();
            //add number in sorted pattern
            c.addSorted(N);
        }
        //record the end time
        long stopTime = System.currentTimeMillis();
        //return the run time
        System.out.println("timeAddSorted: " + (stopTime-startTime));
        return stopTime - startTime;
    }

    public long timeSortOfList(int numberOfItems, int seed){
        //create and instance of the random integer container
        RandomIntegerContainer F = new RandomIntegerContainer();
        //define the set of random numbers
        Random rand = new Random(seed);
        //for specified number of items, add numbers using add to front
        for(int i = 0; i < numberOfItems; i++){
            //the random number 
            Integer N =(Integer)rand.nextInt();
            F.addToFront(N);
        }
        //The start time of the sorting
        long startTime = System.currentTimeMillis();
        //sort with a bubble sort
        F.bubbleSort();
        //the stoptime of the bubble sort
        long stopTime = System.currentTimeMillis();
        //return the time to sort
        System.out.println("timeSortOfList: " + (stopTime-startTime));
        return stopTime - startTime;
    }

    public long timeSortUniqueOfList(int numberOfItems, int seed){
        //create and instance of RandomIntegerContainer
        RandomIntegerContainer F = new RandomIntegerContainer();
        //Create the random generator
        Random rand = new Random(seed);
        //for specified number of items, add with add to front
        for(int i=0; i< numberOfItems; i++){
            //the random number
            Integer N =(Integer)rand.nextInt();
            //add to the front of the container
            F.addToFront(N);
        }
        //the start time of the sort
        long startTime = System.currentTimeMillis();
        //sort and remove duplicates
        F.bubbleSortUnique();
        //the end time of the sort
        long stopTime = System.currentTimeMillis();
        //return the time to sort
        System.out.println("timeSortUniqueOfList: " + (stopTime-startTime));
        return stopTime - startTime;
    }

    public long timeSortOfSortedList(int numberOfItems, int seed){
        //create and instance of RandomIntegerContainer
        RandomIntegerContainer P = new RandomIntegerContainer();
        //create the set of random numbers
        Random rand = new Random(seed);
        //for the specified number of items, add to front of array
        for(int i = 0;i < numberOfItems; i++){
            //the random number
            Integer N = (Integer)rand.nextInt();
            //add to the front
            P.addToFront(N);
        }
        //bubble sort the array
        P.bubbleSort();
        //bubble sort again, and return time to sort the sorted array
        long startTime = System.currentTimeMillis();
        P.bubbleSort();
        long stopTime = System.currentTimeMillis();
        System.out.println("timeSortOfSortedList: " + (stopTime-startTime));
        return stopTime - startTime;
    }
}

