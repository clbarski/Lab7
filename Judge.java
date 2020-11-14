import java.util.*;

public class Judge 
{
	public static int findJudge(int n, int [][] trust)
	{
		int[] votesGot = new int[n+1];//An array to keep track of how many votes someone gets
		int[] votesGiven = new int[n+1];//An array to keep track of how many votes someone gives
		
		//Loop through and add when someone gives and when someone gets to their respected arrays
		for(int i = 0; i<trust.length; i++)
		{
			int x = trust[i][0];//setting variable x to the giver
			int y = trust[i][1];//setting variable y to the receiver
			
			//Adding the votes someone gives
			votesGot[x-1]++;
			//Adding the votes someone gets
			votesGiven[y-1]++;
			
		}
		
		//For loop to compare the arrays and find the judge
		for(int i = 0; i <= n; i++)
		{
			//If votes got is 0 and votes given is n-1
			if(votesGot[i] == 0 && votesGiven[i] == n-1)
			{
				//Return that index +1
				return i+1;
			}
		}
		
		//if not found, return -1
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
		int n = 4;
		
		System.out.println("Judge: "+findJudge(n, trust));
	}
}
