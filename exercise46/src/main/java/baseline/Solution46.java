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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution46 {
    public static void main(String[] args) {
        Solution46 app = new Solution46();
        //Get file
        File inputFile = new File("src\\main\\resources\\exercise46_input.txt");
        //Declare map for word frequency storage
        Map<String, Integer> freqMap = new HashMap<>();

        //Read in file and convert to array
        List<String> fileToList = app.readInputFile(inputFile);

        //Map contents of string based on word presence and record frequency
        app.buildFrequencyMap(freqMap, fileToList);
    }

    public List<String> readInputFile(File inputFile) {
        //Using a buffered reader, read file
        String line;
        String[] word;

        List<String> words = new ArrayList<>();
        try {
            //Declare bufferReader and FileWriter
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            //Put contents of file through string builder
            while ((line = reader.readLine()) != null) {
                word = line.split(" ");
                words.addAll(Arrays.asList(word));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error occurred");
        }

        //Convert to string
        //Return string
        return words;
    }

    private void buildFrequencyMap(Map<String, Integer> freqMap, List<String> fileToList) {
        List<String> word = new ArrayList<>();
        //Go through string and record each word presence
        fileToList.forEach(s -> {
            if (freqMap.containsKey(s)) {
                //Use counter to record frequency
                Integer count = freqMap.get(s);
                freqMap.put(s, count + 1);
            } else {
                word.add(s);
                freqMap.put(s, 1);
            }
        });
        word.forEach(s -> {
            int count = freqMap.get(s);
            String result = s + ": ";
            String total = "*".repeat(Math.max(0, count));
            System.out.format("%-12s%-12s\n",result, total);
        });

        //Print which words were present and their frequencies
    }
}
