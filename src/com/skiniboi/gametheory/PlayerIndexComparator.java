package com.skiniboi.gametheory;

import java.util.Comparator;

public class PlayerIndexComparator implements Comparator<Choice> 
	{

	    // Assuming both are non-null choices, this comparator is used by a choice list to sort players according to their index 
		// in the game. 
	    public int compare(Choice c1, Choice c2)
	    {
	        return Integer.compare(c1.player.outerIndex, c2.player.outerIndex );
	    }
	}
