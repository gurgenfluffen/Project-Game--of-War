package finalCodingProject_WAR;

public class Card {

	int value;
	String name;
	
	public Card(int count, String name) {
		this.value = value;
		this.name = name;
	}
	

	public Card() {
		
	}


	public int getValue() {
		return value;
	}
	
	public void setValue() {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setValue(int value) {
		this.value = value;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setName() {
		this.name = name;
	}
	
	public String describe(Card card) {
		return card.getName();
			}
}
