package baseline;

import java.io.File;

public class Solution44 {
    public static void main(String[] args) {
        Solution44 app = new Solution44();
        //Declare file
        File inputFile = new File("src\\main\\resources\\exercise44_input.json");
        //Declare String for user input
        String item;

        //Get user data
        item = app.getStringFromUser();

        //Parse file for item
        app.parseJson(item);
    }

    private String getStringFromUser() {
        //Prompt user for data
        //Return user data
        return null;
    }

    private void parseJson(String item) {
        //If item isn't present, loop back to get user data
        //If item is present, print item name, price, and quantity
    }
}
