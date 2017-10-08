package com.skiniboi.gametheory;

import java.util.ArrayList;
import java.util.List;

public class Player 
{
	
	// Holds all the possible choices a player can make 
	List<Choice> choices;
	
	// Holds a description of the player (example: the type of game the player is meant to play)
	String description;
	
	// Holds the current player index in the outer game being played
	int outerIndex;
	
	// Constructor
	public Player( List<Choice> c , String s , int i)
	{
		// perform copy of all choices in the list
		for(Choice a : c)
			{
				choices.add(a.clone());
			}
		
		description = s;
		
	}
	
	// Holds the payoff table that the player is part of
	PayOffTable table;
	
	public Player clone()
	{
		List<Choice> temp = new ArrayList() ; 
		
		for(Choice c : choices)
			{
				temp.add(c.clone());
			}
		
		return new Player(temp, description , outerIndex);
	}
}
