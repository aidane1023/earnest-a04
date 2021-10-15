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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution42 {
    public static void main(String[] args) throws IOException {
        Solution42 app = new Solution42();
        //Declare input file
        File inputFile = new File("src\\main\\resources\\exercise42_input.txt");
        //Declare array list of arrays (will be used to store people)
        List<String[]> people = new ArrayList<>();

        //Read in data to arraylist
        //Begin loop
        people[x] = app.getPersonData();
        //end loop
        //Format table
        //Print data from arraylist into formatted table
    }

    private List<String> getPersonData() {
        //Store each row as an individual array
        //Use row.split to divide at comma
        return null;
    }
}
