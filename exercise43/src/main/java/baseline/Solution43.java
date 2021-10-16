package baseline;

import java.io.File;

public class Solution43 {
    public static void main(String[] args) {
        Solution43 app = new Solution43();
        //Declare Strings for user input
        String websiteName;
        String authorName;
        String scriptFolderConditional;
        String cssFolderConditional;
        //Get user input
        websiteName = app.getStringFromUser();
        authorName = app.getStringFromUser();
        //Construct directory (title it the variable websiteName)
        new File("./(path)/"+ websiteName).mkdirs();
        //If response is "y" to either folder question, construct corresponding directory
        app.getConditionalFromUser(1);
        app.getConditionalFromUser(2);
        //Construct file, add in both variables (websiteName and authorName) with appropriate tags

        //Print prompt listing what was constructed
    }

    private String getStringFromUser() {
        //Prompt user for data
        //Get user data
        //Return User data
        return null;
    }

    private void getConditionalFromUser(int path) {
        //Prompt user for data
        //Test that data is either "y" or "n"
    }
}
