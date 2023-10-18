package cybersecurity.project1;
import java.util.Scanner;
import java.lang.Character;

public class ceaserCipher {
    // Pulls a string and key from the user that will be encrypted and decrypted using a Caesar Cipher Algorithem 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ceaser Cipher Encryptor9000!!!");
        System.out.print("Please enter a key: ");
        int userKey = Integer.parseInt(reader.nextLine());
        if(userKey > 26){ // If the user enters a key over 26 (the length of the alphabet) the array will error.
            userKey = userKey % 26;
        }
        System.out.print("Please enter a string to encrypt: ");
        String userString = reader.nextLine().toLowerCase();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] shiftedAlphabet = shift(userKey, alphabet);
        System.out.print("\n");
        reader.close();
        String encryptedMessage = encryption(userString, shiftedAlphabet, alphabet);
        System.out.println("Encrypted Message: " + encryptedMessage);
        System.out.println("Decrypted Message: " + decryption(encryptedMessage, shiftedAlphabet, alphabet, userKey));
    }
    // Encrypts the user's string using the shifted alphabet and alphabet 
    public static String encryption(String uString, char[] shiftedAlphabet, char[] alphabet){
        String encryptedMessage = "";
        for(int index = 0; index < uString.length(); index++){
            char currentChar = uString.charAt(index);
            if(Character.isLetter(currentChar)){
                encryptedMessage+=shiftedAlphabet[getIndex(alphabet, currentChar)];
            }else if(Character.isWhitespace(currentChar)){
                encryptedMessage+=" ";
            }else if(!(Character.isLetter(currentChar))){
                encryptedMessage+=currentChar;
            }
        }
        return encryptedMessage;
    }
    // Decrypts the encrypted message with the key, shiftedAlphabet, and alphabet
    public static String decryption(String encryptedMessage, char[] shiftedAlphabet, char[] alphabet, int key){
        String decrpytedMessage = "";
        for(int index = 0; index < encryptedMessage.length(); index++){
            char currentChar = encryptedMessage.charAt(index);
            if(Character.isLetter(currentChar)){
                decrpytedMessage+=alphabet[getIndex(shiftedAlphabet, currentChar)];
            }else if(Character.isWhitespace(currentChar)){
                decrpytedMessage+=" ";
            }else if(!(Character.isLetter(currentChar))){
                decrpytedMessage+=currentChar;
            }
        }
        return decrpytedMessage;
    }
    // Shifts the alphabet based on the user's key
    public static char[] shift(int key, char[] alphabet){
        char[] shift = new char[26];
        int counter = 0;
        for(int index = key; index < 26; index++){
            shift[counter]+=alphabet[index];
            counter++;
        }
        counter = 0;
        for(int index = key; index > 0; index--){
            shift[shift.length - (index)]+=alphabet[counter];
            counter++;
        }
        return shift;
    }
    // Finds the index of an element in an array
    public static int getIndex(char[] alphabet, char currentChar){
        int arrIndex = 0;
        for(int i = 0; i < alphabet.length; i++){
            if(alphabet[i] == currentChar){
                arrIndex = i;
                break;
            }
        }
        return arrIndex;
    }
}
