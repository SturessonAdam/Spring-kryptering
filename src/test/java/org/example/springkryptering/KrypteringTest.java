package org.example.springkryptering;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KrypteringTest {

    @Test
    public void EncryptDecryptTest() {
        int shift = 3;
        String original = "Hello World!";

        String encrypted = Kryptering.encrypt(original, shift);
        String decrypted = Kryptering.decrypt(encrypted, shift);

        assertEquals(original, decrypted);
    }
}