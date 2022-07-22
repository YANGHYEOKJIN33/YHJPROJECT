
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
		System.out.println("�����: " + myDeckOfCards.isPair(field));
		System.out.println("�����: " + myDeckOfCards.isTwoPairs(field));
		System.out.println("Ʈ����: " + myDeckOfCards.isThreeOfAKind(field));
		System.out.println("��ī��: " + myDeckOfCards.isFourOfAKinf(field));
		System.out.println("�÷���: " + myDeckOfCards.isFlush(field));
		System.out.println("��Ʈ����Ʈ: " + myDeckOfCards.isStraight(field));
		System.out.println("Ǯ�Ͽ콺: " + myDeckOfCards.isFullHouse(field));
		
	}

}
