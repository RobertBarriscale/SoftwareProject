/*This class is used to read files in directory to validate the users inputs and allow them to log in*/

import java.io.*;
import java.util.*;

public class ReadFile {
    public static boolean main(String[] args) {
        boolean loggedin = false;
        try {
            File myObj = new File(args[0]+ ".txt");
            Scanner myReader = new Scanner(myObj);
            //check the if the input is in a file in the directory if it is present, the user is logged in
            if(myReader.findInLine(args[1])==args[1] && myReader.findInLine(args[2])==args[2]){
                loggedin = true;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return loggedin;
    }
}
