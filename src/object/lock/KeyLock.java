package object.lock;

import object.lootable.Key;
/*
 * KeyLock = serrure avec cl�
 */
public class KeyLock extends WithDelay{

	protected final Key key;
	
	public KeyLock(Key key){
		this.key = key;
	}
}
