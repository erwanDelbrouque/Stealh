package object.lock;

import object.lootable.Key;
/*
 * KeyLock = serrure avec clé
 */
public class KeyLock extends WithDelay{

	protected final Key key;
	
	public KeyLock(Key key){
		this.key = key;
	}
}
