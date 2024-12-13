package guessGame;

public class Player {
    private int number;
    boolean isPlayerCorrect = false;

    public void guess(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
}
