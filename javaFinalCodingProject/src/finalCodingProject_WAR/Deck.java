package finalCodingProject_WAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Deck {

	List<Card> cards = new ArrayList<Card>();
	
	public Deck () {
		String[] names = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", 
							"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
		for (String name : names) {
			int count = 2;
		
			for (String value : values) {
					Card c = new Card();
					c.setValue(count);
				c.setName(value + " of " + name);
				
				cards.add(c);
				count++;
			}
		}
	}
		
		
		
	public List<Card> getCard(){
		return cards;
	}
	
	public void setCard(List<Card> cards){
		this.cards = cards;
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		Card deckCard = this.cards.remove(0);
		return deckCard;
	}

	public void describe() {
		for (Card card : this.cards) {
			System.out.println(card.getName());
		}
	}
	
	
	
}