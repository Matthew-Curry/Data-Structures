
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MWLtest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MWLtest
{
    /**
     * Default constructor for test class MWLtest
     */
    public MWLtest()
    {
    }

    @Before
    public void setUp()
    {
    }

    @Test public void addBgnNC(){
        //test a method that should add to the begining of an integer list
        //create an integer list
        MyWeirdList list = new MyWeirdList();
        //add an item to the begining and check if it is the first node in the list
        list.addBgn(1);
        list.addBgn(2);
        list.addBgn(3);
        //if method works should produce string "321"
        String S = list.toString();
        //check if correct string
        if(S == "321"){
            System.out.println(true);    
        }
        else{
            System.out.println(false);    
        }
    }

    @Test public void addEndNC(){
        //test a method that should add to the end of an integer list
        //create an integer list
        MyWeirdList list = new MyWeirdList();
        //add an item to the begining and check if it is the first node in the list
        list.addEnd(1);
        list.addEnd(2);
        list.addEnd(3);
        //if method works should produce string "123"
        String S = list.toString();
        //check if correct string
        if(S == "123"){
            System.out.println(true);    
        }
        else{
            System.out.println(false);    
        }
    }

    @Test public void toStringNC(){
        //test a method that should add to the end of an integer list
        //create an integer list
        MyWeirdList list = new MyWeirdList();
        //fill the list
        list.addEnd(1);
        list.addEnd(2);
        list.addEnd(3);
        list.addEnd(4);
        list.addEnd(5);
        list.addEnd(6);
        list.addEnd(7);
        list.addEnd(8);
        list.addEnd(9);
        //now print to string
        String p = list.toString();
        //check if the string equals what it should, "123456789"
        if(p == "123456789"){
            System.out.println(true);    
        }
        else{
            System.out.println(false);    
        }
    }

    @Test public void sizeNC(){
        //test a method that should add to the end of an integer list
        //create an integer list
        MyWeirdList list = new MyWeirdList();
        //fill the list
        list.addEnd(1);
        list.addEnd(2);
        list.addEnd(3);
        list.addEnd(4);
        list.addEnd(5);
        list.addEnd(6);
        list.addEnd(7);
        list.addEnd(8);
        list.addEnd(9);
        //now get the size
        int size = list.size();
        //check if the string equals what it should, 9
        if(size == 9){
            System.out.println(true);    
        }
        else{
            System.out.println(false);    
        }
    }

    @Test public void compareToNC(){
        //test a method that should compare two consecutive nodes in the LinkList and return
        //-1 if the first has more didgits than the second, 0 if the same number of didgits
        //and 1 if the second has more didgets than the first
        //create an instance of the weirdlist
        MyWeirdList list = new MyWeirdList();
        //add items to the list
        //fill the list
        list.addBgn(1);
        list.addBgn(200);
        list.addBgn(20);
        //Now compare the first element with the second
        int r = list.compareTo(list.first);
        //check if the desired result was obtained
        if(r == 1){
            System.out.println(true);    
        }
        else{
            System.out.println(false);    
        }
        //now create a scenario where the first has more digits than the second
        //create an instance of the weirdlist
        MyWeirdList list2 = new MyWeirdList();
        //add items to the list
        //fill the list
        list2.addBgn(20);
        list2.addBgn(1);
        list2.addBgn(300);
        //Now compare the first element with the second
        int t = list2.compareTo(list2.first);
        if(r == -1){
            System.out.println(true);    
        }
        else{
            System.out.println(false);    
        }
        //now a scenario where the compared nodes have the same
        MyWeirdList list3 = new MyWeirdList();
        //add items to the list
        //fill the list
        list3.addBgn(20);
        list3.addBgn(10);
        list3.addBgn(30);
        //Now compare the first element with the second
        int y = list3.compareTo(list3.first);
        if(r == 0){
            System.out.println(true);    
        }
        else{
            System.out.println(false);    
        }
    }

    @Test public void selectionSortNC(){
        //a method that test the selection sort of the Weird List
        //create an instance of the weirdlist
        MyWeirdList list = new MyWeirdList();
        //add items to the list out of order
        list.addBgn(4);
        list.addBgn(2);
        list.addBgn(3);
        list.addBgn(1);
        list.addBgn(5);
        list.addBgn(9);
        list.addBgn(7);
        list.addBgn(8);
        list.addBgn(6);
        //now sort the list
        list.selectionSort();
        //a list sorted correctly
        MyWeirdList list2 = new MyWeirdList();
        list2.addBgn(1);
        list2.addBgn(2);
        list2.addBgn(3);
        list2.addBgn(4);
        list2.addBgn(5);
        list2.addBgn(6);
        list2.addBgn(7);
        list2.addBgn(8);
        list2.addBgn(9);
        //check equality
        if(list==list2){
        System.out.println(true);     
        }
        else{
        System.out.println(false);    
        }
    }

    @After
    public void tearDown()
    {
    }
}
