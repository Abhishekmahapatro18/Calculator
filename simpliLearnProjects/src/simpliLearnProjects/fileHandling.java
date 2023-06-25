package simpliLearnProjects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

public class fileHandling {
	public static void main(String[] args) 
	{
        String fileName = "data.txt"; // Name of the file
        
        // Write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) 
        {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a sample file.");
            writer.newLine();
            writer.write("Have a nice day!");
            writer.newLine();
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) 
        {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
	        
        // Read the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) 
        {
            String line;
            System.out.println("Reading the file:");
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } catch (IOException e) 
        {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        
        // Append to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) 
        {
            writer.write("This line is appended.");
            writer.newLine();
            System.out.println("Data has been appended to the file successfully.");
        } catch (IOException e) 
        {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
        
        // Read the file after appending
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) 
        {
            String line;
            System.out.println("Reading the file after appending:");
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } catch (IOException e) 
        {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
	    }
	}

