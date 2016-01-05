package object.Door;

import object.lock.Lock;
import object.lock.LockCard;
import object.lootable.Card;

public class SecureDoor extends Door {

	private final static String name = "Security door";
	private static Lock lock = new LockCard(new Card());
	
	public SecureDoor() {
		super(name, lock);
		
	}

}
