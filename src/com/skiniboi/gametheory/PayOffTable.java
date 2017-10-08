package com.skiniboi.gametheory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.skiniboi.gametheory.Choice;

public class PayOffTable 
{
	
	// A key to index the Pay Off table
	public class key
	{
		// List of choices made by players sorted in ascending player index
		List<Choice> playerChoices;
		
		// Player whose payoff is required
		Player player;
		
		public key( List<Choice> c , Player p)
		{
			// Make a deep copy of the list	
			for(Choice e : c)
				{
					playerChoices.add(e.clone());
				}
			
			// Always sort the choice list to avoid inconsistencies
			playerChoices.sort(new PlayerIndexComparator());
		}
	}
	
	// Maintain a list of all the players playing the game
	public List<Player> players  = new ArrayList<Player>();
	
	// Main data structure to store pay off matrix
	public Map<key , Float> tablePayOff = new HashMap<key , Float>();
	
	// Constructor to get in list of players
	public PayOffTable(List<Player> p) 
	{
		System.out.println("hello");
	}
	
	public PayOffTable()
	{
	}	
	
	// add the payoff for a player p , given the sorted list of choices made by all players c  
	public void addPayOffForPlayerChoices(List<Choice> c , Player p , float payOff)
	{
		// Store the pay off value for player p in and sorted choice list p in payOff table map
		tablePayOff.put(new key(c , p ), payOff);
	}
}
