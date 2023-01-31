package be.ephec.java.exercice.e04;

public class Program {
    public static void main(String[] args) {
        Player p1 = new Player("Max");
        Player p2 = new Player("Paul");

        Game game = new Game(p1, p2, 10);

        Player winner = game.playAndReturnWinner();
        System.out.println("Et le gagnant est " + winner.getFirstName());

    }

}
