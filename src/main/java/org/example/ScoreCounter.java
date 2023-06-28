package org.example;

import lombok.Data;

import java.util.Random;
import java.util.Scanner;

@Data
public class ScoreCounter {

    private int playerScore = 0;
    private int computerScore = 0;
    private static final int WINNING_SCORE = 3;
    private static final String PROMPT_MESSAGE = "Choose an option, rock, paper, or scissors";
    private static final String WIN_MESSAGE = "You've won! :)";
    private static final String LOSE_MESSAGE = "The computer has won! :)";
    private static final String[] OPTIONS = {"rock", "paper", "scissors"};

    public void playGame() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (!isGameFinished()) {
                System.out.println(PROMPT_MESSAGE);
                String playerChoice = getPlayerChoice(scanner);
                String computerChoice = getComputerChoice();

                updateScores(playerChoice, computerChoice);
                displayScore();
            }
        }
        processTie();
    }

    private String getPlayerChoice(Scanner scanner) {
        return scanner.next();
    }

    private String getComputerChoice() {
        Random random = new Random();
        int randomIndex = random.nextInt(OPTIONS.length);
        return OPTIONS[randomIndex];
    }

    private void updateScores(String playerChoice, String computerChoice) {
        if (playerChoice.equals(OPTIONS[0]) && computerChoice.equals(OPTIONS[1])) {
            computerScore++;
        } else if (playerChoice.equals(OPTIONS[0]) && computerChoice.equals(OPTIONS[2])) {
            playerScore++;
        } else if (playerChoice.equals(OPTIONS[1]) && computerChoice.equals(OPTIONS[0])) {
            playerScore++;
        } else if (playerChoice.equals(OPTIONS[1]) && computerChoice.equals(OPTIONS[2])) {
            computerScore++;
        } else if (playerChoice.equals(OPTIONS[2]) && computerChoice.equals(OPTIONS[0])) {
            computerScore++;
        } else if (playerChoice.equals(OPTIONS[2]) && computerChoice.equals(OPTIONS[1])) {
            playerScore++;
        }
    }

    private void displayScore() {
        System.out.println("Computer says: "+getComputerChoice());
        System.out.println("Your score is: " + playerScore + ", and the computer's score is: " + computerScore + ".");
    }

    private boolean isGameFinished() {
        return playerScore >= WINNING_SCORE || computerScore >= WINNING_SCORE;
    }

    private void processTie() {
        if (playerScore == computerScore) {
            System.out.println("It's a tie!");
        } else {
            System.out.println(playerScore == WINNING_SCORE ? WIN_MESSAGE : LOSE_MESSAGE);
        }
    }
}