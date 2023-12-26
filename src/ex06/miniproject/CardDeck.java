package ex06.miniproject;

class Card {
    String[] name = {"에이스", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "잭", "퀸", "킹"};
    int N = name.length;
}

class Deck {
    String[] design = {"클럽", "다이아몬드", "하트", "스페이드"};
    int N = design.length;

    public Deck(Card c1) {
        System.out.print("[");
        for (int i = 0; i < this.N; i++) {
            for (int j = 0; j < c1.N; j++) {
                System.out.print("'" + this.design[i] + " " + c1.name[j] + "' ");
            }
        }
        System.out.print("]");
    }
}

public class CardDeck {
    public static void main(String[] args) {
        Card c1 = new Card();
        Deck d1 = new Deck(c1);
    }
}