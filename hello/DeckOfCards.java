import java.security.SecureRandom;

public class DeckOfCards {

	private static final SecureRandom randomNumbers = new SecureRandom();
	private static final int NUMBER_OF_CARDS = 52;
	
	private Card[] deck = new Card[NUMBER_OF_CARDS];
	private int currentCard = 0;
	
	public DeckOfCards() {
		String[] faces = {
				"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Queen", "King"
		};
		String[] suits = {
				"Hearts", "Diamonds", "Clubs", "Spades"
		};
		
		for (int count = 0; count < deck.length; count++) {
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
		}
	}
	
	public void shuffle() {
		
		currentCard = 0;
		
		for (int first = 0; first < deck.length; first++) {
			
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	public Card dealCard() {
		if (currentCard < deck.length) {
			return deck[currentCard++];
		}
		else {
			return null;
		}
	}
	
	public boolean isPair(Card...cards ) {
		for(int i = 0; i < cards.length -1; i++) {
			for(int j = i + 1; j < cards.length; j++) {
				if(cards[i].getFace().equals(cards[j].getFace()))
					return true;
			}
		}
		return false;
	}
	
	public boolean isTwoPairs(Card...cards ) {
		for(int i = 0; i < cards.length -1; i++) {
			for(int j = i + 1; j < cards.length; j++) {
				if(cards[i].getFace().equals(cards[j].getFace()))
					return true;
			}
		}
		return false;
	}

	public boolean isThreeOfAKind(Card...cards ) {
		for(int i = 0; i < cards.length -1; i++) {
			int faceCount = 1;
			
			for(int j = i + 1; j < cards.length; j++) {
				if(cards[i].getFace().equals(cards[j].getFace()))
					faceCount++;
			}
			if(faceCount == 3)
				return true;
		}
		return false;
	}
	public boolean isFourOfAKinf(Card...cards ) {
		for(int i = 0; i < cards.length -1; i++) {
			int faceCount = 1;
			
			for(int j = i + 1; j < cards.length; j++) {
				if(cards[i].getFace().equals(cards[j].getFace()))
					faceCount++;
			}
			if(faceCount == 4)
				return true;
		}
		return false;
	}
	
	public boolean isFlush(Card...cards ) {
		Card firstCard = cards[0];
		int suitCount = 1;
		
		for(int i = 1; i < cards.length; i++) {
				if(cards[i].getSuit().equals(firstCard.getSuit()))
					suitCount++;
			}
		
		return suitCount == 5;
		}
                                                                         
	
	public boolean isStraight(Card...cards ) {
		for(int i = 0; i < cards.length -1; i++) {
			for(int j = i + 1; j < cards.length; j++) {
				if(cards[i].getFace().equals(cards[j].getFace()))
					return true;
			}
		}
		return false;
	}
	
	public boolean isFullHouse(Card...cards ) {
		for(int i = 0; i < cards.length -1; i++) {
			for(int j = i + 1; j < cards.length; j++) {
				if(cards[i].getFace().equals(cards[j].getFace()))
					return true;
			}
		}
		return false;
	}

}
