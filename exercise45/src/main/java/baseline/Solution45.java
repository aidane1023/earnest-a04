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

import java.io.*;
import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) {
        Solution45 app = new Solution45();
        //Get file
        File inputFile = new File("src\\main\\resources\\exercise45_input.txt");
        //Declare variables
        String outputFileName;
        String replacedText;

        //Get Data from user
        outputFileName = app.getStringFromUser();

        try {
            //Declare bufferReader and FileWriter
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFileName+".txt");

            //Operate on input file
            replacedText = app.readInputFile(reader);

            //Make and fill output file
            app.buildOutputFile(writer, replacedText);
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }

    }

    public String getStringFromUser() {
        //Prompt user for data
        System.out.println("Name of output file:");
        String tempName = in.nextLine();

        if (tempName.contains(".")) {
            System.out.println("Omit any file extensions");
            getStringFromUser();
        }
        return tempName;
    }

    public String readInputFile(BufferedReader reader) {
        //Read in contents of input file via buffer reader
        String line;
        StringBuilder oldText = new StringBuilder();
        try {
            while ((line = reader.readLine()) != null) {
                oldText.append(line).append("\r\n");
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
        //Use replaceAll to replace all "utilize" with "use"
        //Return replaced text
        return oldText.toString().replaceAll("utilize", "use");
    }

    private void buildOutputFile(FileWriter writer, String replacedText) {
        //Use fileWriter to write replaced into output file
        try {
            writer.write(replacedText);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }

    private static final Scanner in = new Scanner(System.in);
}
