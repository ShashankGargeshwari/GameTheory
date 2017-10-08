package com.skiniboi.gametheory;
import java.util.Comparator;

public class Choice {
	
	// Holds a reference to the player that owns this choice
	Player player;
	
	// Holds a human readable description of the choice being made
	String description;
	
	// Holds the index of the current choice in the outer player
	int outerIndex;
	
	// Constructor to set the Choice
	public Choice(Player p, int i , String d)
	{
		player = p;
		outerIndex = i;
		description = d;
	}
	
	// Display all the elements of the given choice in human readable form
	void Display()
	{
		System.out.println(player.description);
	}
	
	// Override clone to enable creating copies
	public Choice clone()
	{
		return new Choice(player.clone() , outerIndex , description);
	}
}
