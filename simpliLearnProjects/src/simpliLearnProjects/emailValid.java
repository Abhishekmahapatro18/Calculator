package simpliLearnProjects;
//import java.util.Arrays;
import java.util.Scanner;

public class emailValid 
{
	public static void main(String[] args) 
	{
        String[] emailIDs = { "john@example.com", "alice@example.com", "bob@example.com", "jane@example.com" };
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an email ID to search: ");
        String searchEmail = scanner.nextLine();
        
        boolean found = false;
	        
        // Search for the email ID in the array
        for (String email : emailIDs) 
        {
            if (email.equalsIgnoreCase(searchEmail)) 
            {
                found = true;
                break;
            }
        }
	        
	        if (found) 
	        {
	            System.out.println("Email ID found in the array.");
	        } 
	        else 
	        {
	            System.out.println("Email ID not found in the array.");
	        }
	        
	        scanner.close();
	    }
	}

