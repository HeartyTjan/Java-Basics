package guessGame;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessGame {
    ArrayList<Player> players = new ArrayList<>();

    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();
        guessGame.startGame(100);
    }

    public void startGame(int range, int...max){
      try {
          int numberOfPlayers = Integer.parseInt(input("How many players"));

          for (int index = 0; index < numberOfPlayers; index++) {
              Player player = new Player();
              players.add(player);
          }
      }catch (NumberFormatException error) {
              display("Must be a digit number");
              startGame(range);
      }

       int targetNumber = generateNumber(range);
       display(String.format("target number: %d", targetNumber));

        display("Game Commencing. Players get ready............");
        display(String.format("Generating target number between 0 and %d", range));

        int guessedNumber = 0;
        int totalNumberOfGuesses = 0;
        do {

            for (int index = 0; index < players.size(); index++) {
                try {
                    int number = Integer.parseInt(input(String.format("Player %d guess a number", index + 1)));
                    players.get(index).guess(number);
                    totalNumberOfGuesses++;
                    guessedNumber = players.get(index).getNumber();

                    if (guessedNumber > targetNumber) {
                        display("Guess is too high");
                    } else if (guessedNumber < targetNumber) {
                        display("Guess is too low");
                    }

                    if (guessedNumber == targetNumber) {
                        display(String.format("Congratulation to player %d", index + 1));
                        display(String.format("Player %d guessed the target number", index + 1));
                        break;
                    }
                }catch (NumberFormatException error) {
                    display("Must be a digit number");

                }

            }

            if(totalNumberOfGuesses % 5 == 0) {
                targetNumber = generateNumber(range);
                display("You should do better ! Why should it take you more than 5 guesses");
                display(String.format("New target number: %d", targetNumber));

            }

        }while(guessedNumber != targetNumber);

    }
    private static int generateNumber(int min, int max) {
        SecureRandom random = new SecureRandom();
         return random.nextInt(min, max + 1);
    }
    private static int generateNumber(int range) {
        SecureRandom random = new SecureRandom();
        return random.nextInt(range + 1);
    }
    private static void display(String value){
//        System.out.println(value);
        JOptionPane.showMessageDialog(null, value);
    }
    private static String input(String value){
        display(value);
        return JOptionPane.showInputDialog(value);
    }
}
