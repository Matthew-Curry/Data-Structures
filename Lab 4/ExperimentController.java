
/**
 * Write a description of class ExperimentController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;
public class ExperimentController
{
    //The length of the string used in the containers
    private int length; 
    //the number of strings
    private int numStrings;
    //the seed to use for the random string generator
    private int seed = 50;
    //the random string generator
    private RandomStringGenerator rand = new RandomStringGenerator(seed);
    //The string containers
    StringContainer con1;
    SortedStringContainer con2;
    QuickSortedStringContainer con3;
    //the array of string containers
    StringContainer[] conArray = new StringContainer[3];
    //The time for each of the StringContainers to be initialized
    long standTime; //the regular string container time
    long quickTime; //time to initialize the quickSorted container
    long sortTime; //the time to initialize the sorted string container
    //The array of strings added to each container type
    ArrayList list = new ArrayList<String>();
    //The number of elements to add to each container
    int add;
    //The time to add a fixed number of items to each array
    long standAddTime; 
    long quickAddTime; 
    long sortAddTime;
    //The number of strings to search for
    int search;
    //the time to search for each type of container
    long standSearchTime; 
    long quickSearchTime; 
    long sortSearchTime;
    public static void main(String[]args){
        //Instance of the controller
        ExperimentController control = new ExperimentController();    
        //call the run method
        control.run(args);
    }

    public void run(String[] C){
        //Convert the inputted size of the array and length of the strings to ints
        numStrings = Integer.parseInt(C[0]);
        length = Integer.parseInt(C[1]);
        add = Integer.parseInt(C[2]);
        search = Integer.parseInt(C[3]);
        //Initialize an array of size 3 holding each container type holding a created list of random strings and record time to initialize each
        createListContainer();
        //add a given number of elements to each string container  
        addTo();
        //Search for the given number of strings in the array and record the time it takes
        search();
        //Lastly, need to output the three containers
        System.out.println("The String Container");
        System.out.print(outputC1());
        System.out.println("The Sorted String Container");
        System.out.print(outputC2());
        System.out.println("The Unsorted String Container");
        System.out.print(outputC3());
        //And the times 
        System.out.println("The Time to Initialize the String Container:" + standTime +"Time to Initialize Sorted Container:"+ sortTime+" ");
        System.out.println("Time to Initialize Quick Sorted Container:" + quickTime + "Time to Add to Standard Container:" + standAddTime+" ");
        System.out.println("Time to Add to Sorted Container:" +sortAddTime + "Time to Add to Quick Sort Container:" + quickAddTime+" ");
        System.out.println("Time to Search String Container:" + standSearchTime +"Time to Search Sorted Container:"+ sortSearchTime+" ");
        System.out.println("Time to Seach Quick Sorted Container:" + quickSearchTime);
    }

    public String outputC1(){
        return con1.toString();
    }

    public String outputC2(){
        return con2.toString();    
    }

    public String outputC3(){
        return con3.toString();    
    }

    public void search(){
        //randomly pick a string to search for 
        Random randy = new Random(seed);
        //and array to place the searches
        String[] searches = new String[search];
        for(int i = 0; i<search;i++){
            //the index of the item to search for
            int index = randy.nextInt(length);
            //get the value
            String val = con1.getValue(index);
            //put in the array of searches
            searches[i] = val;
        }
        //Search for the items and record the time it takes
        long startTime = System.currentTimeMillis();
        for(int i = 0; i<search;i++){
            //Search for the item
            con1.linearSearch(searches[i]);
        }
        long stopTime = System.currentTimeMillis();
        standSearchTime = stopTime - startTime;

        //the sorted container
        for(int i = 0; i<search;i++){
            //the index of the item to search for
            int index = randy.nextInt(length);
            //get the value
            String val = con1.getValue(index);
            //put in the array of searches
            searches[i] = val;
        }
        //Search for the items and record the time it takes
        startTime = System.currentTimeMillis();
        for(int i = 0; i<search;i++){
            //Search for the item
            con2.startSearch(searches[i]);
        }
        stopTime = System.currentTimeMillis();
        sortSearchTime = stopTime - startTime;

        //the quick sorted container
        for(int i = 0; i<search;i++){
            //the index of the item to search for
            int index = randy.nextInt(length);
            //get the value
            String val = con1.getValue(index);
            //put in the array of searches
            searches[i] = val;
        }
        //Search for the items and record the time it takes
        startTime = System.currentTimeMillis();
        for(int i = 0; i<search;i++){
            //Search for the item
            con3.startSearch(searches[i]);
        }
        stopTime = System.currentTimeMillis();
        sortSearchTime = stopTime - startTime;

    }

    public void addTo(){
        //use 3 for loops to add the number of items of random strings to each container and record the time
        //The loop for the standard additions and recorded time
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< add; i++){
            //generate a random string of the given length
            String entry = rand.nextString(length);
            //add to the standard container
            con1.add(entry);
        }
        long stopTime = System.currentTimeMillis();
        standAddTime = stopTime - startTime;

        //The loop for the sorted additions and recorded time
        startTime = System.currentTimeMillis();
        for(int i = 0; i<add; i++){
            //generate a random string of the given length
            String entry = rand.nextString(length);
            //add to the standard container
            con2.add(entry);
        }
        stopTime = System.currentTimeMillis();
        sortAddTime = stopTime - startTime;

        //The loop for the quick sorted additions and recorded time
        startTime = System.currentTimeMillis();
        for(int i = 0; i<add; i++){
            //generate a random string of the given length
            String entry = rand.nextString(length);
            //add to the standard container
            con3.add(entry);
        }
        stopTime = System.currentTimeMillis();
        quickAddTime = stopTime - startTime;
    }

    public void createListContainer(){
        //fill the array list
        for(int i = 0; i<numStrings; i++){
            //generate a random string of the appropriate length 
            String entry = rand.nextString(length);
            //add to the array
            list.add(entry);
        }
        createContainerArray(list);
    }

    public void createContainerArray(ArrayList<String> list){
        //Initialize the regular string container and record the time to initialize
        long startTime = System.currentTimeMillis();
        con1 = new StringContainer(list);
        long stopTime = System.currentTimeMillis();
        //The time for the initialization
        standTime = stopTime - startTime;

        //Initalize the Sorted String Container and record time to initialize
        startTime = System.currentTimeMillis();
        con2 = new SortedStringContainer(list);
        stopTime = System.currentTimeMillis();
        //The time for the initialization
        sortTime = stopTime - startTime;

        //Initalize the Quick Sorted String Container and record time to initialize
        startTime = System.currentTimeMillis();
        con3 = new QuickSortedStringContainer(list); 
        stopTime = System.currentTimeMillis();
        //The time for the initialization
        quickTime = stopTime - startTime;

        //place the containers inside of the string container
        conArray[0] = con1;
        conArray[1] = con2;
        conArray[2] = con3;
    }
}