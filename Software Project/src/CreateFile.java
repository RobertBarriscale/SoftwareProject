/*This class is used to create the txt that will store the users username and password*/

import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        try {
            //Create an object that will name a txt file or check if it already exists
            File myObj = new File(args[0]+ ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
