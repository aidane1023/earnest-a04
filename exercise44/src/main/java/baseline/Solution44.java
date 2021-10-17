/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 aidan earnest
 */

/*
Create a program that takes a product name as input
and retrieves the current price and quantity for that product.
The product data is in a data file in the JSON format  and looks like this
(you will create this file as `exercise44_input.json`):
Print out the product name, price, and quantity if the product is found.
If no product matches the search, state that no product was found and start over.
 */
package baseline;

import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution44 {
    public static void main(String[] args) {
        Solution44 app = new Solution44();
        //Declare file
        File inputFile = new File("src\\main\\resources\\exercise44_input.json");
        //Parsing the Declared file
        try {
            JsonReader productReader = new JsonReader(new FileReader("exercise44_input.json"));
            //Declare String for user input
            String item;

            //Get user data
            item = app.getStringFromUser();

            //Parse file for item
            app.parseJson(item, productReader);
        }
        catch (IOException e) {
            System.out.println("error occurred.");
        }

    }

    private String getStringFromUser() {
        //Prompt user for data
        System.out.println("What is the product name?");
        //Return user data
        return in.nextLine();
    }

    private void parseJson(String itemToFind, JsonReader jsonReader) {
        //Use Reader to parse file
        //Record data from parse into arrays
        //Test against user data
        //If item isn't present, loop back to get user data
        //If item is present, print item name, price, and quantity
    }

    private static final Scanner in = new Scanner(System.in);
}
