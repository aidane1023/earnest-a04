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
import java.util.List;

public class Solution41 {
    public static void main(String[] args) {
        Solution41 app = new Solution41();
        //Declare files
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        //Read and alphabetically sort contents of input file
        List sorted = app.sortAlphabet();
        //Format output file
        //Write contents of alphabetized input file into formatted output file
    }

    private List sortAlphabet() {
        //Begin loop
        //Read each line from file
        //End loop
        //Sort using collections

        //Return sorted list
        return null;
    }
}
