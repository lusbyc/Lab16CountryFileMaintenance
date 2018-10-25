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

public class CountriesTextFile {

	public static void readFromFile(String directoryFolder, String fileName) {


		Path filePath = Paths.get(directoryFolder, fileName);
		File file = filePath.toFile();

		try {
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);

			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close(); 

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Contact customer service.");
			e.printStackTrace();
		}

	}

	public static void writeToFile(String directoryFolder, String fileName) {
		Path filePath = Paths.get(directoryFolder, fileName);
		File file = filePath.toFile();

//		Country s = new Country("United States of America");

		try {
			PrintWriter outW = new PrintWriter(new FileOutputStream(file, true));
			Scanner scan = new Scanner(System.in);
			String newCountry = scan.nextLine();
			Country s = new Country(newCountry);
			outW.println(s);
//			outW.println(newCountry);
			outW.close();
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found");
		}
	}

	public static void createFile(String directoryFolder, String fileName) {
		Path filePath = Paths.get(directoryFolder, fileName);
		if (Files.notExists(filePath)) {
			try {
				Files.createFile(filePath);
				System.out.println("The file was created successfully!");
			} catch (IOException e) {
				System.out.println("Something went wrong with the file creation. CALL CUSTOMER SERVICE!");
//				e.printStackTrace();
			}
		} else {
			System.out.println("File already exists!");
		}
	}

}
