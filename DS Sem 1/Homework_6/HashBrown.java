import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;

public class HashBrown {
  public static final long MAX = Integer.MAX_VALUE;

  public static void main(String[] args) {
    String[] words = read("./words_alpha.txt").split("\n");
    for(String word : words){
      System.out.println(word);
    }
    // HashMap<Long, LinkedList<String>> map = new HashMap<>();
    // map.put(1L, new LinkedList<String>());
  }

  public static long base27(Object toHash) {
    String s = String.format("%s", toHash);
    long base = 27; // 26 alphabet and a blank-space
    long offset = 'a' - 1;
    long x = 0, p = 1;
    for (int i = s.length() - 1; i > -1; i--) {
      long bit = s.charAt(i);
      bit = bit == ' ' ? 0 : (bit - offset);
      x += bit * p;
      p *= base;
    } // Long.MAX_VALUE = 2^(63) - 1, 64 bits but one sign bit
    return Math.floorMod(x, Long.MAX_VALUE);
  }

  public static long hash(Object toHash) {
    return Math.floorMod(base27(toHash), MAX);
  }

  public static String read(String path) {
    String ret = null;
    try {
      ret = new String(Files.readAllBytes(Paths.get(path)));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return ret;
  }
}