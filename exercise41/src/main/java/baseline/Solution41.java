/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Create a program that reads in the following list of names
from a file called `exercise41_input.txt` and sorts the list alphabetically:
Ling, Mai; Johnson, Jim; Zarnecki, Sabrina; Jones, Chris; Jones, Aaron; Swift, Geoffrey; Xiong, Fong
Then print the sorted list to a file called `exercise41_output.txt`
 */
package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution41 {
    private static int counter = 0;
    public static void main(String[] args) throws IOException {
        Solution41 app = new Solution41();
        //Declare files
        File inputFile = new File("src\\main\\resources\\exercise41_input.txt");
        String outputFile = "exercise41_output.txt";
        //Declare variables
        FileWriter fileWriter = new FileWriter(outputFile);
        PrintWriter out = new PrintWriter(fileWriter);
        List<String> sorted;

        //Read and alphabetically sort contents of input file
        sorted = app.sortAlphabet(inputFile);
        //Format output file
        out.println("Total of "+ counter +" names \n-----------------");
        //Write contents of alphabetized input file into formatted output file
        for (Object outputLine : sorted) {
            out.println(outputLine);
        }
        out.flush();
        out.close();
        fileWriter.close();
    }

    public List<String> sortAlphabet(File inputFile) throws IOException {
        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String inputLine;
        List<String> lineList = new ArrayList<>();

        //Begin loop
        while ((inputLine = bufferedReader.readLine()) != null) {
            //Read each line from file
            lineList.add(inputLine);
            counter++;
        }
        //End loop
        fileReader.close();

        //Sort using collections
        Collections.sort(lineList);

        //Return sorted list
        return lineList;
    }
}
