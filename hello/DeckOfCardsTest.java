
public class DeckOfCardsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		
		Card[] field = new Card[5];
		
		for(int i = 1; i < 5; i++) {
			field[i] = myDeckOfCards.dealCard();
			System.out.printf("%-19s", field[i]);
		}
		System.out.println();
		System.out.println("원페어: " + myDeckOfCards.isPair(field));
		System.out.println("투페어: " + myDeckOfCards.isTwoPairs(field));
		System.out.println("트리플: " + myDeckOfCards.isThreeOfAKind(field));
		System.out.println("포카드: " + myDeckOfCards.isFourOfAKinf(field));
		System.out.println("플러시: " + myDeckOfCards.isFlush(field));
		System.out.println("스트레이트: " + myDeckOfCards.isStraight(field));
		System.out.println("풀하우스: " + myDeckOfCards.isFullHouse(field));
		
	}

}
