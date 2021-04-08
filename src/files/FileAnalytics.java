package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAnalytics {

    //Write a program that reads a file with n number of strings separated by line breaks
    //The program determines and prints how many words are in the file.

    public static void main(String[] args) throws FileNotFoundException {

        File latinWords = new File("resources/latin.csv"); //create a reference to the csv file

        Scanner fileScanner = new Scanner(latinWords); // create a scanner with latinWords file as input

        int wordCount = 0;

        while(fileScanner.hasNextLine()) {
            fileScanner.next(); //if seems we need this to proceed from word to word. Without it, the loop doesn't end
            wordCount++;
        }

        System.out.println("Number of words in this file: " + wordCount);

    }

}
