/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Construct a program that reads in the following data file
(you will need to create this data file yourself; name it `exercise42_input.txt`):
Ling,Mai,55900; Johnson,Jim,56500; Jones,Aaron,46000; Jones,Chris,34500; Swift,Geoffrey,14200; Xiong,Fong,65000; Zarnecki,Sabrina,51500
Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.
 */
package baseline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution42 {
    public static void main(String[] args) throws IOException {
        Solution42 app = new Solution42();
        //Declare input file
        File inputFile = new File("src\\main\\resources\\exercise42_input.txt");
        //Declare array list of arrays (will be used to store people)
        List<String[]> people = new ArrayList<>();
        //Declare variables for reading file
        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String inputLine;

        //Read in data to arraylist
        //Begin loop
        int x = 0;
        while ((inputLine = bufferedReader.readLine()) != null) {
            people.add(x, app.getPersonData(inputLine));
            x++;
            //end loop
        }
        //Format table
        //String fName, lName, salary;
        //fName = people.get(1)[0];
        System.out.format("%s%12s%13s\n", "Last", "First", "Salary");
        System.out.println("------------------------------");
            //Print data from arraylist into formatted table
        for (String[] i : people) {
            System.out.format("%-11s%-12s%-12s\n",i[0],i[1],i[2]);
        }
    }

    //Split off in order for proper use in test case
    private String[] getPersonData(String inputLine) {
        //Store each row as an individual array
        //Use split to divide at comma
        return inputLine.split(",");
    }
}
