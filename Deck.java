//Deck.java

import java.util.*;
class Deck{
	ArrayList<Card> deck;

	public Deck(){
		this.deck = new ArrayList<>();
	}
	

	public void createDeck(){
		String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] suits = {"Clubs","Diamonds","Hearts","Spades"};

		for(String rank : ranks){
			for(String suit : suits){
				deck.add(new Card(rank,suit));
			}
		}
	
	}

	
	public void displayDeck(){
		for (Card card : deck){
			System.out.println(card);
		}
	}
	
	public void printCard(int index){
		 if (index >= 0 && index < deck.size()){
			System.out.println(deck.get(index));
		
		} else{
			System.out.println("Invalid card index.");
		}
	}

	public boolean sameCard(Card c1, Card c2) {
		 return c1.getRank().equals(c2.getRank());
	}

	public boolean compareCard(Card c1, Card c2) {
		return c1.getRank().equals(c2.getRank());
	}

	
	public void shuffleDeck(){
		Collections.shuffle(deck);
	}


	public void pickTwoRandomCards() {
		if (deck.size() < 2) {
        	System.out.println("Not enough cards in the deck.");
        	return;
    	}
    	Random rand = new Random();
    	Card card1 = deck.get(rand.nextInt(deck.size()));
    	Card card2 = deck.get(rand.nextInt(deck.size()));
    	while (card1 == card2) {
		card2 = deck.get(rand.nextInt(deck.size()));
   	}
	System.out.println("Randomly selected cards:");
    	System.out.println(card1);
    	System.out.println(card2);
}
	


























}