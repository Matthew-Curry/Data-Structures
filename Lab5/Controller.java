
/**
 * Write a description of class Controller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controller
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Controller
     */
    public Controller()
    {
    }
    
    public static void main(String[]args){    
    //create the controller and call the run method
        Controller C = new Controller();
        //call the run method
        C.run();
    }

    public void run(){
    //make an instance of my weird list
    MyWeirdList list = new MyWeirdList();
    //use add to begining
    list.addBgn(10);
    list.addBgn(20);
    list.addBgn(30);
    list.addBgn(40);
    list.addBgn(50);
    //add to the end of the list
    list.addEnd(5);
    list.addEnd(4);
    list.addEnd(3);
    list.addEnd(2);
    list.addEnd(1);
    //print the weird list
    System.out.print(list.toString());
    //now sort the list
    list.selectionSort();
    //now print again
    System.out.print(list.toString());
    }
}
