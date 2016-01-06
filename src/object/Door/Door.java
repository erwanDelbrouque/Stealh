package object.Door;

import object.lock.Lock;
import object.lock.opener.Opener;

public abstract class Door {

	private static String name; 
	private Lock lock;
	private static boolean isOpen = false;
	
	public Door(String name,Lock lock){
		Door.name = name;
		this.lock = lock;
	}
	
	public abstract boolean openDoor(Opener opener);

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Door.name = name;
	}

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}

	public static boolean isOpen() {
		return isOpen;
	}

	public static void setOpen(boolean isOpen) {
		Door.isOpen = isOpen;
	}
}
