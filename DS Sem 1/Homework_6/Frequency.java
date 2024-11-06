import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Frequency {
    public static void main(String[] args) {
        String contents = read("franzKafka.txt");
        System.out.println(soClean(contents));
    }

    public static String soClean(String bookContent){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bookContent.length(); i++) {
            char current = bookContent.charAt(i);
            char Lcurrent = Character.toLowerCase(current);
            char emptySpace = ' ';
            if(Lcurrent == '\n' || Lcurrent == emptySpace){
                sb.append(" ");
            }
            if('a' <= Lcurrent && Lcurrent <= 'z'){
                    sb.append(current);
                // if(sb.length() % 80 == 0){
                //     sb.append("\n");
                // }
            }
        }
        return sb.toString();
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
}