
/**
 * Write a description of class Writer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.FileReader;
public class Writer{
    public static void main(String[] args) {
        Writer write = new Writer();
        write.run();
    }

    public void run(){
        //The scanner to scan the file
        Scanner sc = null;
        //The number of words
        int words = 0;
        //The number of letters
        int letters = 0;
        //The longest word length 
        int longWordLength = 0;
        //The longest word
        String longWord = "";
        try{
            sc = new Scanner(new FileReader("TidyTimes.txt"));
            while (sc.hasNextLine()) {
                //Take each line and assign the words to an array
                String line = sc.nextLine();
                String[] lineArray = line.split(" ");
                //Count the words in the line
                words = lineArray.length;
                //Reset the count of letters to 0 and the length of the longest word to 0
                letters = 0;
                longWordLength = 0;
                //Count the letters in the line and pick the longest word
                for(int x = 0; x < words; x ++){
                    //Pick a word from the array
                    String word = lineArray[x];
                    //Remove the punctuation 
                    word = word.replaceAll("\\p{Punct}","");
                    //Determine the length of the chosen word
                    int wordLength = word.length();
                    //Add the length of the word to the number of letters already counted
                    letters = letters + wordLength;
                    //if the length of the word exceeds the length of the current longest word, make it the longest word
                    if(wordLength > longWordLength){
                        longWordLength = wordLength;
                        longWord = word;
                    }
                }
                System.out.println("Words:" +" "+ words +" "+ "Letters:" +" "+" "+ letters +" "+ "Longest:" +" "+ longWord);
            }
        }
        catch(Exception e){
        }
    }
}
