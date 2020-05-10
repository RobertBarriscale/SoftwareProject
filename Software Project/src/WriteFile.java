/*This class is used to write the users username and password to an external txt file which can later be read for logging in*/

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            //Writes the details taken from the users inputs to the file created
            FileWriter myWriter = new FileWriter(args[0]+".txt");
            myWriter.write("Username : " +args[1]);
            myWriter.write(System.getProperty("line.separator"));
            myWriter.write("Password : " +args[2]);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
