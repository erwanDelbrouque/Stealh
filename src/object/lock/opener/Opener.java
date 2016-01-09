package object.lock.opener;
import object.Entity;

public abstract class Opener extends Entity{

	public Opener(String name) {
		super(name);
	}

	public abstract String getType();
}
