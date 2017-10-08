package com.skiniboi.gametheory;

import java.util.ArrayList;
import java.util.List;

public class Player 
{
	
	// Holds all the possible choices a player can make 
	public List<Choice> choices;
	
	// Holds a description of the player (example: the type of game the player is meant to play)
	public String description;
	
	// Holds the current player index in the outer game being played
	public int outerIndex;
	
	// Holds the payoff table that the player is part of
	public PayOffTable table;
	
	// Constructors
	
	// Fully defined constructor
	public Player( List<Choice> c , String s , int i , PayOffTable t)
		{
			// perform copy of all choices in the list
			for(Choice a : c)
				{
					choices.add(a.clone());
				}
			
			description = s;
			
			table = t;
		}
		
	// Default constructor
	public Player()
		{
			description = "Default Player";
			outerIndex = -1;
			choices = null;
			table = null;
		}
	
	// Clone functions to assist in deep copying 
	public Player clone()
	{
		List<Choice> temp = new ArrayList<Choice>() ; 
		
		for(Choice c : choices)
			{
				temp.add(c.clone());
			}
		
		return new Player(temp, description , outerIndex , table);
	}
}
