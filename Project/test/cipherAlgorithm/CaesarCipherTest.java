package cipherAlgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCipherTest {

    @Test
    public void testEncryption_cipherText_toTheShiftOfThree() {
        String text = "CodeDamn";
        int shift = 3;
        String encryptedText = CaesarCipher.encryptText(text, shift);
        String expected = "FRGHGDPQ";
        assertEquals(encryptedText, expected);
    }

    @Test
    public void testDecryption_decryptText() {
        String text = "FRGHGDPQ";
        int shift = 3;
        String encryptedText = CaesarCipher.decryptText(text, shift);
        String expected = "CODEDAMN";
        assertEquals(encryptedText, expected);
    }
}
