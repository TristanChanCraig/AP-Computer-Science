package Quarter4.SocketLab.Server;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CaesarCipher {
    public static String encrypt(String input, int offset) {
        String cipher = "";
        for (char c : input.toCharArray()) cipher += (char)(c + offset);
        return cipher;
    }

    public static String decrypt(String cipher, int offset) {
        return encrypt(cipher, -offset);
    }

    public static void manualDecrypt(String cipher){
        for (int lcv = 1; lcv <= 50; lcv++) {
            System.out.println(decrypt(cipher, lcv));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase to encrypt: ");
        String phrase = input.nextLine();
        System.out.print("Enter a number below or equal to 50 to encrypt it with: ");
        int eNum = input.nextInt();
        String encryptedPhrase = encrypt(phrase, eNum);
        System.out.println("Your encrypted phrase is " + encryptedPhrase);
        manualDecrypt(phrase);
    }
}
