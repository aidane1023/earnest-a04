/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Given an input file named `exercise45_input.txt`,
read the file and look for all occurrences of the word utilize.
Replace each occurrence with use. Write the modified file to a new file.
 */
package baseline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Solution45 {
    public static void main(String[] args) {
        Solution45 app = new Solution45();
        //Get file
        File inputFile = new File("src\\main\\resources\\exercise45_input.txt");
        //Declare bufferReader and fileWriter
        BufferedReader reader;
        FileWriter writer;
        //Declare variables
        String outputFileName;
        String oldText;
        String replacedText;

        //Get Data from user
        outputFileName = app.getStringFromUser();

        //Operate on input file
        replacedText = app.readInputFile(reader, oldText);

        //Make and fill output file
        app.buildOutputFile(writer, replacedText, outputFileName);

    }

    private String readInputFile(BufferedReader reader, String oldText) {
        //Read in contents of input file via buffer reader
        //Use replaceAll to replace all "utilize" with "use"
        //Return replaced text
        return null;
    }

    private void buildOutputFile(FileWriter writer, String replacedText, String fileName) {
        //Make output file named based on user data
        //Use fileWriter to write replaced into output file
    }
}
