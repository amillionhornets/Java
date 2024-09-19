package Homework_1.files;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;


public class FourClark {
    public static void main(String[] args) {
        byte [] bytes = getFileBytes("files\\half_gaps.bin") ;
        long [] gaps = new long[bytes.length];
        for (int i = 0; i < bytes.length; i++){
            gaps[i] = Byte.toUnsignedLong(bytes[i]);
        } 
        double startTime = System.nanoTime () ; // Start time in nano seconds
        gaps = getCumSum(gaps);
        System.out.println(Arrays.toString(Arrays.copyOfRange(gaps, 0, 15)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(gaps, gaps.length-5, gaps.length)));
        double duration = System.nanoTime() - startTime ; 
        System.out.println(duration);
    }
    public static byte [] getFileBytes ( String path ) {
        byte[] bytes = null ;
        try{
            bytes = Files.readAllBytes(Paths.get(path)) ;
        }catch( IOException e ) {
            e.printStackTrace();
        }
        return bytes;
    }
    // sums up the gaps array and stores the prev sum in longCompound.
    public static long[] getCumSum(long[] gaps){
        long longCompound = 0;
        long[] newGaps = new long[gaps.length];
        for (int i = 0; i < gaps.length; i++) {
            longCompound+=gaps[i];
            newGaps[i] = (2*longCompound) + 3; // Gets the prime gaps from the 2*longCompound + 3
        }
        return newGaps;
    }
}