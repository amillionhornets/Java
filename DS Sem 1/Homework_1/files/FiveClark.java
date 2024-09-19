import java.io.IOException ;
import java.nio.file.Files ;
import java.nio.file.Paths ;

public class FiveClark {
public static void main (String [] args) {
    int m = (int) Math.pow(2 , 7); // 128 char in type able ascii
    char[] cipher = new char[m];
    for (int i = 0; i < m ; i ++){
        
        cipher[i] = (char)mod(55 * (i - 3), m); // 55 is the reverse of 7 and then you add 3
                                                //    then you get the opposite rotation in the cipher
        // cipher[i] = (char)mod(7*i+3, m);
    }
    String plain = read ("files\\cipher.txt") ;
    for ( int i = 0; i < plain.length(); i ++){ 
        System.out.print(cipher[plain.charAt(i)]);
    }
    }
    public static String read ( String path ) {
        String ret = null ;
        try {
            ret = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e ) {
            e.printStackTrace();
        }
        return ret;
    }
    public static int mod ( int x , int n ) { return (( x % n ) + n ) % n ; }
}