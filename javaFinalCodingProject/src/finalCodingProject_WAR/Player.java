package finalCodingProject_WAR;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player() {
		this.score = 0;
		this.name = name;
		
		}
		 
		
	
	public List<Card> getCard(){
		return hand;
	}
	
	public void setCard(List<Card> cards){
		this.hand = hand;
	}
	
	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public void describePlayer() {
		System.out.println("----------------------");
		System.out.println("Player Name:" + name);
		System.out.println("Player Score:" + score);
		System.out.println("Player Hand:");
		for (Card card : this.hand) {
			card.describe(card);
		}
		System.out.println("-----------------------");
	}
	
	public Card flip() {
		Card deckCard = this.hand.remove(0);
		return deckCard;
		
	}
	
	public Card draw() {
		Card deckCard = this.hand.remove(0);
		return deckCard;
	}
	
	public void incrementScore() {
		score++;
				
	}
}
