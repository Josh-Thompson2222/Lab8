package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Storage {

    public static void main(String[] args){

        String fileName = "File13.txt";




        try{
           FileWriter myFile = new FileWriter("File13.txt", true);
           myFile.write("\nGoodevening");
           myFile.append("\nJosh Thompson");
           myFile.close();
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file. ");
        }
    }
}
