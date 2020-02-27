
/**
 * Write a description of class RandomIntegerContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class RandomIntegerContainer
{
    private ArrayList<Integer> array;

    public RandomIntegerContainer(){
        array = new ArrayList<Integer>();
    }

    public void addToFront(Integer x){
        array.add(0, x);
    } 

    public void addSorted(Integer X){
        //add the integer with add to front
        addToFront(X);
        //Check if value should be moved and swap if necessary
        for(int i = 0; i <array.size()-1;i++){
            int y = array.get(i); 
            int z = array.get(i+1);
            //if added item is bigger than next item, then swap
            if(y>=z){
                swap(i, i+1);
                break;
            }
        }
    }

    public void bubbleSort(){
        //specifies not sorted
        boolean isSorted = false;
        while(!isSorted){
            //to end break the loop if sorting is completed
            isSorted = true;
            //run bubble sort over the array
            for(int i = 0; i<array.size()-1; i++){
                //swap entries if an entry with a lower index is bigger than the next entry
                if(array.get(i).compareTo(array.get(i+1))>0){
                    swap(i, i+1);
                    //keep loop going if not sorted
                    isSorted = false;
                }
            }
        }
    }

    public void bubbleSortUnique(){
        //bubble sort the RandomIntegerContainer
        bubbleSort();
        //Remove the duplicates 
        for(int i = 0; i<array.size()-1; i++){
            Integer x = array.get(i);
            Integer y = array.get(i+1);
            //if the integer preceding the next is the same, remove it
            if(x.compareTo(y)==0){
                array.remove(i);
                //move indicies back if there is a removal
                i--;
            }
        }
    }

    private void swap(int i, int p){
        //Get the ith integer
        Integer x = array.get(i);
        //Get the i+1 integer
        Integer y = array.get(p);
        //swap the integers
        array.set(i, y);
        array.set(p, x);
    }

    public Integer[] returnArray(){
        //Return an array of the Integers stored in the RandomIntegerContainer
        //get the size of the arraylist and make an empty array of this size
        int Size = array.size();
        Integer[] arrayNew = new Integer[Size];
        for(int i=0; i<array.size(); i++){
            //get the entry of the array list
            Integer x = array.get(i);
            //assign to the array
            arrayNew[i] = x;
        }
        return arrayNew; 
    }
}