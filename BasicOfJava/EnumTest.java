package BasicOfJava;

public class EnumTest {
    public enum CardSuit{HEART, SPADES,CLUBS, DIAMONDS}
    public static void main(String[] args) {
        CardSuit suit;
        suit = CardSuit.HEART;
        System.out.println("this suit is "+ suit);

    }
}
