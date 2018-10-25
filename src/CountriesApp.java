import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {

		/*
		 * 3 Classes + 1 text file 1. Countries Test File Methods 1. createFile 2.
		 * readFromFile 3. writeToFile
		 * 
		 * 2. CountriesApp The place where you call methods from CountriesTextFile and
		 * Validator Also potentially useful: if/else if or switch
		 * 
		 * 3. Validator
		 */

		String directoryFolder = "resources";
		String fileName = "countryTest.txt";

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Countries Maintenance Application!");

		Validator.getInt(scan,"1-See the list of countries \n2-Add a country \n3-Exit \n\nEnter menu number: \n", 1, 3);

		System.out.println();

		CountriesTextFile.writeToFile(directoryFolder, fileName);
	
		System.out.println();
//		System.out.println("Here's the revised country list:");

		CountriesTextFile.readFromFile(directoryFolder, fileName);

	}

	}



