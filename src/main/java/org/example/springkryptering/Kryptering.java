package org.example.springkryptering;

public class Kryptering {
    //ceaser-chiffer

    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        //stringbuilder för att manipulera ist för att skapa nya strängar, bättre minneshantering

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) { //kontrollerar så det är en bokstav
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encryptedText.append((char) ((c - base + shift) % 26 + base)); //skiftar till ny bokstav
            } else {
                encryptedText.append(c); //behåller resultatet om det inte är en bokstav
            }
        }
        return encryptedText.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }
}
