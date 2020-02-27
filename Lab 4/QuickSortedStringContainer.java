
/**
 * Write a description of class QuickSortedStringContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Collections;
public class QuickSortedStringContainer extends SortedStringContainer
{
    /**
     * Constructor for objects of class SortedStringContainer
     */
    public QuickSortedStringContainer()
    {
        //take the same empty array that defines the parent class
        super();
    }
    
    public QuickSortedStringContainer(ArrayList<String> stringArray){
        //add items in the arraylist to the container
        this.arr = stringArray;
        //sort the array
        Collections.sort(arr);
    }
    //below is my implementation of quicksort for keepsake
    
    // public void quickSort(ArrayList<String> arr, int start , int end){
        // //pick the pivot value FOR NOW I WILL CHOOSE LAST VALUE
        // int pivot = end;
        // //the size of the passed array
        // int Size = arr.size();
        // //perform the parition
        // for(int i = 0; i < end ; i++){
            // //the item counting from the end
            // int countEnd = end - i;
            // //continue only if the partitions haven't been reduced to 1
            // if(i>=countEnd){
                // break;
            // }
            // //if the count from the end is less than the pivot and count from the right is less than the pivot, swap
            // if(countEnd > pivot && i < pivot){
                // //switch the values
                // swap(i , countEnd);
            // }
        // }
        // //recursively call the quick sort method on the parts of the array halved by the pivot
        // //the first half 
        // quickSort(arr , 0 , pivot - 1);
        // //the second half
        // quickSort(arr , pivot + 1 , end);
    // }
}