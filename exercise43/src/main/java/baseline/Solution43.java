package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) {
        Solution43 app = new Solution43();
        //Declare Strings for user input
        String websiteName;
        String authorName;

        //Get user input
        websiteName = app.getStringFromUser("Site name:");
        authorName = app.getStringFromUser("Author:");
        //Construct directory (title it the variable websiteName)
        new File("./website/"+ websiteName).mkdirs();

        //If response is "y" to either folder question, construct corresponding directory
        app.getConditionalFromUser(1, websiteName);
        app.getConditionalFromUser(2, websiteName);

        //Construct file, add in both variables (websiteName and authorName) with appropriate tags
        File indexFile = new File("./website/" + websiteName +"/index.html");
        app.constructHTML(indexFile, websiteName, authorName);

        //Print what was constructed
        System.out.println("Created ./website/"+websiteName+"\n Check program's working directory");
    }

    private String getStringFromUser(String prompt) {
        //Prompt user for data
        System.out.println(prompt);
        //Return User data
        return in.nextLine();
    }

    private void getConditionalFromUser(int path, String websiteName) {
        if (path == 1) {
            //Prompt user for data
            System.out.println("Do you want a folder for JavaScript?");
            String conditional = in.nextLine();
            //Test that data is either "y" or "n"
            if (conditional.equalsIgnoreCase( "y") || conditional.equalsIgnoreCase("n")) {
                if (conditional.equalsIgnoreCase( "y")) {
                    new File("./website/"+ websiteName +"/js/").mkdirs();
                }
            }
            else {
                System.out.println("Must enter either \"y\" or \"n\"");
                getConditionalFromUser(1, websiteName);
            }
        }
        else if (path == 2) {
            //Prompt user for data
            System.out.println("Do you want a folder for CSS?");
            String conditional = in.nextLine();
            //Test that data is either "y" or "n"
            if (conditional.equalsIgnoreCase( "y") || conditional.equalsIgnoreCase("n")) {
                if (conditional.equalsIgnoreCase( "y")) {
                    new File("./website/"+ websiteName +"/css/").mkdirs();
                }
            }
            else {
                //loop back if response fails
                System.out.println("Must enter either \"y\" or \"n\"");
                getConditionalFromUser(1, websiteName);
            }
        }
    }

    //added for additional test and organization purposes
    private void constructHTML(File indexFile, String websiteName, String authorName) {
        try {
            FileWriter myWriter = new FileWriter(indexFile);
            myWriter.write("<!DOCTYPE html>\n<HTML>\n<title>"+ websiteName +"</title>\n<meta>"+ authorName +"</meta>");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static final Scanner in = new Scanner(System.in);
}
