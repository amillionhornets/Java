import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        String contents = soClean(read("pg1497.txt"));
        String[] words = contents.split("\\s+");

        HashMap<String, Integer> frequency = new HashMap<String, Integer>();
        for (String word : words) {
            if(frequency.containsKey(word)){
                frequency.put(word, frequency.get(word) + 1);
            }else if( word.length() > 5){
                frequency.put(word, 1);
            }
        }
        String[] keys = frequency.keySet().toArray(new String[0]);
        int[] values = new int[keys.length];
        for (int i = 0; i < keys.length; i++) {
            values[i] = frequency.get(keys[i]);
        }
        sort(keys, values, 0, values.length - 1);
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%10s | %d |%n", keys[i], values[i]);
        }
    }
    
    public static void sort(String[] k, int[] v, int lo, int hi){
        if (lo >= hi){
            return;
        }
        int j = lo, i = lo - 1;
        do{
            if(v[j] >= v[hi]){
                int escrow1 = v[++i]; 
                String escrow2 = k[i];
                v[i] = v[j];
                v[j] = escrow1;
                k[i] = k[j];
                k[j] = escrow2;
            }
        }while(j++ < hi);
        sort(k, v, lo, i - 1);
        sort(k, v, i + 1, hi);
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