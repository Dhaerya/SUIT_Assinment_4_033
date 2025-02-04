//Main.java
	
import java.util.*;
class Main{
	public static void main(String args[]){
		Deck deck = new Deck();
		System.out.println("*****Creating Deck\n*****");
		deck.createDeck();
		System.out.println("*****Print Deck\n*****");
		deck.displayDeck();

		System.out.println("*****Shuffling Deck\n*****");
		deck.shuffleDeck();
		deck.displayDeck();

		System.out.println("*****Selecting Two Random Cards\n*****");		
		deck.pickTwoRandomCards();
	}	
}