/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Create a program that reads in a file named `exercise46_input.txt`
and counts the frequency of words in the file.
Then construct a histogram displaying the words and the frequency,
and display the histogram to the screen.
 */
package baseline;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Solution46 {
    public static void main(String[] args) {
        Solution46 app = new Solution46();
        //Get file
        File inputFile = new File("src\\main\\resources\\exercise46_input.txt");
        //Declare map for word frequency storage
        Map<String, Integer> freqMap = new HashMap<>();

        //Read in file and convert to string
        String fileToString = app.readInputFile(inputFile);

        //Map contents of string based on word presence and record frequency
        app.buildFrequencyMap(freqMap, fileToString);
    }

    private String readInputFile(File inputFile) {
        //Using a buffered reader, read file
        //Convert to string
        //Return string
        return null;
    }

    private void buildFrequencyMap(Map<String, Integer> freqMap, String fileToString) {
        //Go through string and record each word presence
        //Use counter to record frequency
        //Print which words were present and their frequencies
    }
}
