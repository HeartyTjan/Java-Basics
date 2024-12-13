package cipherAlgorithm;

public class CaesarCipher {

    public static String encryptText(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for(int index = 0; index < text.length(); index++) {
            char currentChar = Character.toUpperCase(text.charAt(index));
            int numericValue = getNumberValueOfCharacter(currentChar) + shift;
            encryptedText.append(getCharacterValueOfNumber(numericValue));
        }

        return encryptedText.toString();
    }

    public static String decryptText(String encryptedText, int shift) {
        StringBuilder decryptedText = new StringBuilder();

        for(int index = 0; index < encryptedText.length(); index++) {
            char currentChar = Character.toUpperCase(encryptedText.charAt(index));
            int numericValue = getNumberValueOfCharacter(currentChar) - shift;
            decryptedText.append(getCharacterValueOfNumber(numericValue));
        }

        return decryptedText.toString();
    }
    private static int getNumberValueOfCharacter(char letter){
        return letter - 'A' + 1;
    }

    private static char getCharacterValueOfNumber(int number) {
        return (char) ('A' + number - 1);
    }

}
