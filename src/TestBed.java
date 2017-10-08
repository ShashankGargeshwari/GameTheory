import java.util.ArrayList;
import java.util.List;

import org.omg.PortableServer.ThreadPolicyValue;

import com.skiniboi.gametheory.Choice;
import com.skiniboi.gametheory.PayOffTable;
import com.skiniboi.gametheory.Player;

public class TestBed
	{
		public PayOffTable table;
		
		public TestBed()
			{
				table = new PayOffTable();
				
				table.players.add(new Player());
				table.players.add(new Player());
				
				int i = 0; int j = 0;
				for(Player p : table.players)
					{
						p.choices.add(new Choice(p, j++ , "Hit"));
						p.choices.add(new Choice(p, j++ , "Run"));
						p.table = table;
						p.outerIndex = i++;
						j = 0;
						
					}
			}
	}
