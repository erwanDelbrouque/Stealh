package object.Door;

import object.lock.Lock;
import object.lock.LockCard;
import object.lock.opener.Card;
import object.lock.opener.Drill;
import object.lock.opener.Opener;

public class Strongbox extends Door{
	
	private static String name = "Trunck";
	private static Lock lock = new LockCard(new Card());
	
	public Strongbox() {
		super(name, lock);
	}

	@Override
	public boolean openDoor(Opener opener){
	
		if(opener == null){
			System.out.println("You need car for open the door");
			return false;
		}
		if(Door.isOpen()==true){
			System.out.println("the door is already opened");
			return false;
		}
		if(opener.getType().equals("card")||opener.getType().equals("key")){
			Door.setOpen(true);
			return true;
		}
		if(opener.getType().equals("drill")){
			Drill drill = (Drill)opener;
			drill.startTime();
			return true;
		}
		return false;
		
	}

	
	
}
