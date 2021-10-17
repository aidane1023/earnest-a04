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
import java.util.Arrays;
import java.util.Scanner;

public class Solution44 {
    public static void main(String[] args) {
        Solution44 app = new Solution44();
        //Declare file
        File inputFile = new File("src\\main\\resources\\exercise44_input.json");
        //Parsing the Declared file
        try {
            JsonReader productReader = new JsonReader(new FileReader(inputFile));
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

    public void parseJson(String itemToFind, JsonReader jsonReader) {
        //Declare array and counter
        String[] productData = new String[20];
        int counter = 0;

        try {
            //Use Reader to parse file
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String name = jsonReader.nextName();
                if (name.equals("products")) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String n = jsonReader.nextName();
                            String data = jsonReader.nextString();
                            //Record data from parse into arrays
                            productData[counter] = data;
                            counter++;
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                }
            }
            jsonReader.endObject();
            }
        catch (IOException e) {
            System.out.println("Error occurred");
        }
        compareDataToUser(productData, itemToFind, jsonReader);
    }

    private void compareDataToUser(String[] productData, String itemToFind, JsonReader jsonReader) {
        //Test against user data
        if (Arrays.asList(productData).contains(itemToFind)) {
            //If item is present, print item name, price, and quantity
            if (itemToFind.equalsIgnoreCase("Widget")) {
                System.out.println("Name: "+productData[0]+"\nPrice: "+productData[1]+"\nQuantity: "+productData[2]);
            }
            if (itemToFind.equalsIgnoreCase( "Thing")) {
                System.out.println("Name: "+productData[3]+"\nPrice: "+productData[4]+"\nQuantity: "+productData[5]);
            }
            if (itemToFind.equalsIgnoreCase( "Doodad")) {
                System.out.println("Name: "+productData[6]+"\nPrice: "+productData[7]+"\nQuantity: "+productData[8]);
            }
        }
        else {
            //If item isn't present, loop back to get user data
            System.out.println("Sorry, that product was not found in our inventory.");
            itemToFind = getStringFromUser();
            parseJson(itemToFind,jsonReader);
        }
    }

    private static final Scanner in = new Scanner(System.in);
}
