package simpliLearnProjects;


import java.util.ArrayList;
import java.util.List;

public class longestIncreasingSubSeq 
{

    public static void main(String[] args) 
    {
        int[] numbers = { 3, 10, 2, 1, 20, 7, 8, 25, 6 };
        
        List<Integer> longestSubsequence = findLongestIncreasingSubsequence(numbers);
        
        System.out.println("Longest increasing subsequence:");
        for (int num : longestSubsequence) 
        {
	            System.out.print(num + " ");
        }
    }
	    
    public static List<Integer> findLongestIncreasingSubsequence(int[] numbers) 
    {
        List<Integer>[] subsequenceList = new ArrayList[numbers.length];
        
        // Initialize each element as a separate subsequence of length 1
        for (int i = 0; i < numbers.length; i++) 
        {
            subsequenceList[i] = new ArrayList<>();
            subsequenceList[i].add(numbers[i]);
        }
	        
        // Find the longest increasing subsequence
        for (int i = 1; i < numbers.length; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (numbers[i] > numbers[j] && subsequenceList[i].size() < subsequenceList[j].size() + 1) 
                {
                    subsequenceList[i] = new ArrayList<>(subsequenceList[j]);
                    subsequenceList[i].add(numbers[i]);
                }
            }
        }
	        
	        // Find the subsequence with the maximum length
        List<Integer> longestSubsequence = new ArrayList<>();
        for (List<Integer> subsequence : subsequenceList) 
        {
            if (subsequence.size() > longestSubsequence.size()) 
            {
                longestSubsequence = subsequence;
            }
        }
	        
        return longestSubsequence;
	    }
	}

