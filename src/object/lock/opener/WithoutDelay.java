package object.lock.opener;
s

public abstract class WithoutDelay implements Opener{
	protected Opener openerType;

	public Opener getOpenerType() {
		return openerType;
	}

	public void setOpenerType(Opener openerType) {
		this.openerType = openerType;
	}
	
}
