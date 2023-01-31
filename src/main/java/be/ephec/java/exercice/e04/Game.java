package be.ephec.java.exercice.e04;

import java.util.Random;

public class Game {
    Player p1, p2;
    int maxPoints;
    Random dice = new Random();

    public Game(Player p1, Player p2, int maxPoints) {
        this.p1 = p1;
        this.p2 = p2;
        this.maxPoints = maxPoints;
    }

    public Player playAndReturnWinner() {
        while (p1.getPoints() < maxPoints && p2.getPoints() < maxPoints) {
            playNextRound();
        }

        // remplacer l'instruction suivante par une instruction contenant un opérateur ternaire.
        // La méthode doit retourner le joueur qui a gagné (= celui qui a le plus de points).
        return null;
    }

    private void playNextRound() {
        int result1, result2;
        do {
            result1 = rollDice();
            result2 = rollDice();
        } while (result1 == result2);
        // insérer ici l'instruction contenant l'opérateur ternaire

        //
    }

    private int rollDice() {
        return dice.nextInt(6);
    }

}
