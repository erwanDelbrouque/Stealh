package object.lock;

import object.lock.opener.Key;

/*
 * KeyLock = serrure avec clé
 */
public class KeyLock extends Lock{

	protected final Key key;
	
	public KeyLock(Key key){
		this.key = key;
	}

	@Override
	public String getType() {
		return "lock key";
	}
}
