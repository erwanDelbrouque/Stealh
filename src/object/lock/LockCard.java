package object.lock;

import object.lootable.Card;
/*
 * LockCard = serrure à ouverture par carte
 */
public class LockCard extends WithoutDelay{

	protected final Card card;
	
	public LockCard(Card card){
		if(card.equals(null)){
			throw new NullPointerException("the Lock card requiere a card for open the door");
		}
		this.card = card;
	}
}
