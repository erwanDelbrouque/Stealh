package object.Door;

import object.lock.Lock;
import object.lock.LockCard;
import object.lootable.Card;

public class Strongbox extends Door{
	
	private static String name = "Trunck";
	private static Lock lock = new LockCard(new Card());
	
	public Strongbox() {
		super(name, lock);
	}

	
	
}
