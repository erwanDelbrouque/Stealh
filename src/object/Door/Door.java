package object.Door;


import object.Entity;
import object.lock.Lock;

public abstract class Door extends Entity {

	private Lock lock;
	private boolean isOpen = false;
	
	public Door(String name,Lock lock){
		super(name);
		this.lock = lock;
	}
	public abstract void openDoor();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
}
