package test;


import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;
import java.io.File;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class test {
    public static void main(String[] args){
        try{
            BufferedImage img = ImageIO.read(new File("C:\\Users\\Furni\\Desktop\\Java\\test\\cat.jpg"));
            int color = img.getRGB(0, 0);
    
            // Components will be in the range of 0..255:
            int blue = (color & 0xff) >> 0;
            int green = (color & 0xff00) >> 8;
            int red = (color & 0xff0000) >> 16;
            System.out.println(blue);
            System.out.println(green);
            System.out.println(red);
        }catch(Exception e){

        }
        // int total = 0; 
        // for(int i = 0; i < 49; i++){
        //     total+=256;
        //     System.out.println(i);
        // }
        // System.out.println(total/49);
    }
}
