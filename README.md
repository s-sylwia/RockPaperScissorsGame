# Rock Paper Scissors Game


**Note: This program is still under development. More features will be added soon.**




This is a Java program that implements the game of Rock Paper Scissors. It allows you to play against the computer and keeps track of the scores. The game continues until one of the players reaches the winning score.

## How to Play

1. Run the program by executing the `randomize()` method in the `Score` class.
2. The program will prompt you to choose one of three options: rock, paper, or scissors.
3. After making your selection, the computer will randomly choose its option.
4. The program will determine the winner based on the game rules: rock beats scissors, paper beats rock, scissors beat paper.
5. The scores will be updated accordingly, and the game will continue until one player reaches the winning score.
6. The winner (player or computer) will be declared, or a tie will be announced if the scores are equal.

## How to Customize

You can modify the following parameters in the `Score` class to customize the game:

- `WINNING_SCORE`: The score required to win the game. By default, it is set to 3.
- `PROMPT_MESSAGE`: The message displayed to prompt the player for their choice.
- `WIN_MESSAGE`: The message displayed when the player wins the game.
- `LOSE_MESSAGE`: The message displayed when the computer wins the game.
- `OPTIONS`: An array of options to choose from. By default, it includes "rock," "paper," and "scissors."


## Dependencies

This program uses the Lombok library for automatic generation of getters, setters, and other boilerplate code. 
