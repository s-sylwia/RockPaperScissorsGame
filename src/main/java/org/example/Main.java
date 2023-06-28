package org.example;

//napisz grę w papier, kamień, nożyce. Podajesz jedną z trzech opcji,
// losujesz jedną z trzech opcji dla komputera i sprawdzasz, kto wygrał.
// Gra toczy się do momentu, gdy jedna ze stron zdobędzie trzy punkty.

public class Main {
    public static void main(String[] args) {

        ScoreCounter scoreCounter = new ScoreCounter();
        scoreCounter.playGame();
    }

}
