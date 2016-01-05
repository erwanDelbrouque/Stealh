package object.Door;

import object.lock.Lock;

public class Door {

	private static String name; 
	private Lock lock;
	
	public Door(String name,Lock lock){
		Door.name = name;
		this.lock = lock;
	}

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
}
