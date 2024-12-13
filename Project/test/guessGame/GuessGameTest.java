package guessGame;

import org.junit.jupiter.api.Test;

public class GuessGameTest {

    @Test
    public void test() {
        GuessGame game = new GuessGame();
    }

    @Test
    public void testStartGame_returnsRandomNumberBetweenTheSpecifiedRange() {
        GuessGame game = new GuessGame();
        game.startGame(100);


    }
}
