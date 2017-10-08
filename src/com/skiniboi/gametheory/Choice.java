package com.skiniboi.gametheory;

public class Choice {
	
	// Holds a reference to the player that owns this choice
	public Player player;
	
	// Holds a human readable description of the choice being made
	public String description;
	
	// Holds the index of the current choice in the outer player
	public int outerIndex;
	
	// Constructors 
	
	// Fully Defined Constructor
	public Choice(Player p, int i , String d)
	{
		player = p;
		outerIndex = i;
		description = d;
	}
	
	// Default Constructor
	public Choice()
	{
		player = null;
		outerIndex = -1;
		description = "Defalult Action";
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
