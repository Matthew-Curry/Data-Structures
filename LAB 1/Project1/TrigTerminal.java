
/**
 * A program that evaluates 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TrigTerminal
{
    public static void main(String[] args){
        TrigTerminal term = new TrigTerminal();
        term.run();
    }
    public void run(){
        Scanner reader = new Scanner(System.in);
        //The number of operations
        int numOps;
        //The first inputed number
        float firstNum;
        //The second inputed number
        float secondNum;
        //The result from the operation
        float result; 
        //A string for the name of the chosen trig expression
        String operator = null;
        try{
            //Ask for the number of operations and print that number
            System.out.print("Number of arithmetic operations: ");
            numOps = reader.nextInt();
            for (int i = 0; i<numOps; i++){
                //Ask for the first number used in the operation
                System.out.print("First number: ");
                firstNum = reader.nextFloat();
                //Ask for the operation
                System.out.print("Operator: ");
                operator = reader.next();
                //Ask for second number
                System.out.print("Second number: ");
                secondNum = reader.nextFloat();
                //produce the output
                result = trigOp(firstNum, operator, secondNum);
                System.out.println(result);
            }
        }catch(Exception e){

        }
    }
    private float trigOp(float firstNum, String operator, float secondNum){
        if(operator.equals("sin")){
            //perform "sin" operation
            float first = secondNum;
            float second = ((float)Math.pow(secondNum,3))/6;
            float third =  ((float)Math.pow(secondNum,5))/120;
            float fourth = ((float)Math.pow(secondNum,7))/5040;
            return firstNum*(first - second + third - fourth); 
        }
            else{
            //perform cosine operation
            float first = 1;
            float second = ((float)Math.pow(secondNum,2))/2; 
            float third =  ((float)Math.pow(secondNum,4))/24;
            float fourth = ((float)Math.pow(secondNum,6))/720;
            return firstNum*(first - second + third - fourth);
            }
        }
    } 
