package finalCodingProject_WAR;

public class App {

	public static void main(String[] args) {
		
		int roundNum = 1;
		Deck deck = new Deck();
		System.out.println("The deck has been created!");
//		deck.describe();
		
		Player player1 = new Player();
	
		
		Player player2 = new Player();
		
		
		deck.shuffle();
		System.out.println("The deck has been shuffled!\n");
//		System.out.println("Shuffled deck:");
//		deck.describe();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.hand.add(deck.draw());
			} else {
				player2.hand.add(deck.draw());
			}
			
		}
		
		for (int i = 0; i < 26; i++) {
			
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
		System.out.println("~~~~~~~~~~~~~~~~");
		System.out.println("~~~ ROUND " + roundNum + " ~~~");
		System.out.println("~~~~~~~~~~~~~~~~\n");
		System.out.println("~~~ (╯°□°)╯︵ ┻━┻ ~~~\n");
		
			roundNum++;
			
		System.out.println("Player 1 has: " + player1Card.describe(player1Card).toString());
		System.out.println("Player 2 has: " + player2Card.describe(player2Card).toString() + "\n");
		
		if (player1Card.getValue() > player2Card.getValue()) {
		player1.incrementScore();
		System.out.println("Player 1's card has the higher value.\n" + "Player 1 received a point.");
		
		
		} else if (player1Card.getValue() < player2Card.getValue()){
		player2.incrementScore();
		System.out.println("Player 2's card has the higher value.\n" + "Player 2 received a point.");
		
		
		} else {
		System.out.println("It's a tie. No points awarded.");
		}
		
		System.out.println("Player 1's score: \t" + player1.getScore());
		System.out.println("Player 2's score: \t" + player2.getScore() + "\n");
		
		}
		
		if (player1.getScore() > player2.getScore()) {
		System.out.println("Player 1 has the higher score. Player 1 wins this round!");
		
		} else if (player1.getScore()< player2.getScore()) {
		System.out.println("Player 2 has the higher score. Player 2 wins this round!");
		
		} else {
		System.out.println("The scores are equal. It's a Draw!");
	}

	}
	
	
}
