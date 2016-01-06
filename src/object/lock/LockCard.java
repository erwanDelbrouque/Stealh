package object.lock;

import object.lock.opener.Card;

/*
 * LockCard = serrure à ouverture par carte
 */
public class LockCard extends Lock{

	protected final Card card;
	
	public LockCard(Card card){
		if(card.equals(null)){
			throw new NullPointerException("the Lock card requiere a card for open the door");
		}
		this.card = card;
	}

	@Override
	public String getType() {
		return "lock card";
	}
}
