package test;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class kernelTest {
    public static void main(String[] args) {

        int[][] kernel = new int[7][7];
  
        try{
            BufferedImage img = ImageIO.read(new File("C:\\Users\\Furni\\Desktop\\Java\\test\\cat.jpg"));
            // kernel = inputKernelData(0, 0, kernel, img);
            for(int y = 0; y < img.getHeight(); y++){
                    for(int x = 0; x < img.getWidth(); x++){
                            kernel = inputKernelData(x, y, kernel, img);
                            kernel = fillKernelValues(kernel);
                            double meanR = getKernelMean(kernel, 0xff0000, 16);
                            double meanG = getKernelMean(kernel, 0xff00, 8);
                            double meanB = getKernelMean(kernel, 0xff, 0);
                            double StDR = getStandardDeviantion(kernel, meanR, 0xff0000, 16);
                            double StDG = getStandardDeviantion(kernel, meanG, 0xff00, 8);
                            double StDB = getStandardDeviantion(kernel, meanB, 0xff, 0);
                            int red = getNormalDistrubution(kernel[x][y] & 0xff0000 >> 16, StDR);
                            int green = getNormalDistrubution(kernel[x][y] & 0xff0000 >> 0, StDG);
                            int blue = getNormalDistrubution(kernel[x][y] & 0xff0000 >> 8, StDB);
                            Color newPixelColor = new Color(red + green + blue);
                    
                }
            }
            // System.out.println(meanR);
            // System.out.println(meanG);
            // System.out.println(meanB);
            // System.out.println(StDR);
            // System.out.println(StDG);
            // System.out.println(StDB);
            // System.out.println(getNormalDistrubution(63, StDR));
            // System.out.println(Arrays.deepToString(kernel));
        }catch(Exception e){
            System.out.println(e);
        }
        
        


        // int[][] kernel = {  {256,256,256,256,256,256,256},
        //                     {256,256,256,256,256,256,256},
        //                     {256,256,256,256,256,256,256},
        //                     {256,256,256,100,100,13,120},
        //                     {256,256,256,84,70,150,240},
        //                     {256,256,256,96,80,132,186},
        //                     {256,256,256,60,32,14,12}
        //                 };
    }
    // Simulates the normal distribution and returns the new color value for the current pixel
    private static int getNormalDistrubution(int x, double standardDeviation) {
        double newBinaryColor = (1/(Math.sqrt(2*Math.PI*Math.pow(standardDeviation, 2)))) * Math.pow(Math.E, -((x * x)/(2*(standardDeviation * standardDeviation))));
        return (int)newBinaryColor;
    }
    private static double getKernelMean(int[][] kernel,int shift, int bitShift){
        double amountOfNumsInKernel = kernel.length * kernel.length;
        double total = 0;
        double mean = 0;
        for(int y = 0; y < kernel.length; y++){
            for(int x = 0; x < kernel.length; x++){
                total+=(kernel[x][y] & shift) >> bitShift;
            }
        }
        mean = total/amountOfNumsInKernel;
        // Return the mean rounded to two decimal places
        return ((double)Math.round(mean * 100) / 100);
    }
   
    private static double getStandardDeviantion(int[][] kernel, double mean, int shift, int bitShift){
        // Sigma is the sumation of my values after they are subtracted from the mean and divided 
        //  by the total amount of values
        ArrayList<Double> sigma = new ArrayList<>();
        double nextNum = 0;
        for(int y = 0; y < kernel.length; y++){
            for(int x = 0; x < kernel.length; x++){
                nextNum = (kernel[x][y] & shift >> bitShift) - mean;
                nextNum = Math.pow(nextNum, 2);
                sigma.add(nextNum);
            }
        }
        double sum = 0;
        for(double num : sigma){
            sum+=num;
        }
        double standartDeviation = Math.sqrt(sum/(kernel.length * kernel.length));
        // Round StD to 3 deciaml places
        return ((double)Math.round(standartDeviation * 1000)/1000);
    }
    /*
     * Input Kernel Data searches the relative pixels to the current x and y
     * If the new positions of x or y is negative or is greater than the bounds of the image
     *  set the kernel value to 256.
     * If the new position are on the image get the rgb value of that pixel
     */
    private static int[][] inputKernelData(int currentX, int currentY, int[][] kernel, BufferedImage nonBlurredImage) {
        int colorBinary[][] = new int[7][7];
        for(int y = -3; y <= Math.floor(kernel.length/2); y++){
            for(int x = -3; x <= Math.floor(kernel.length/2); x++){
                int newX = currentX + x;
                int newY = currentY + y;
                int kernelXpos = (x + (kernel.length/2));
                int kernelYpos = (y + (kernel.length/2));
                if(newX >= 0 && newY >= 0 && newY <= nonBlurredImage.getHeight() && newX <= nonBlurredImage.getWidth()){
                    colorBinary[kernelXpos][kernelYpos] = nonBlurredImage.getRGB(newX, newY);
                }else{
                    colorBinary[kernelXpos][kernelYpos] = 256;
                }
            }
        }
        return colorBinary;
    }
    /*
     * Fill in unknown values in 7 by 7 kernel where the unkown values are equal to 256. 
     * Regular value range less than or equal to 255 or are in the range of -12662255 representing all colors
     * 
     *       --- Extreme Case ---
     *     0   1   2   3   4   5   6
     * 0  256 256 256 256 256 256 256
     * 1  256 256 256 256 256 256 256
     * 2  256 256 256 256 256 256 256
     * 3  256 256 256 100 100 13  120
     * 4  256 256 256 84  70  150 240
     * 5  256 256 256 96  80  132 186
     * 6  256 256 256 60  32  14  12
     * 
     * >>> This Kernel is the most extreme instance at pixel value 0,0 and kernel position 3,3 
     *      meaning 75% of the kernel will have unknown values since you can't have a pixel thats negative. 
     * 
     * >>> fillKernelValues will find a 256 value in the kernel then check the opposing quadrants
     *      If 256 is in quadrant 2 check 4 
     *      If 256 is in quadrant 1 check 3
     *      and so on
     * >>> If there isn't a value in the opposing quadrant the algorithm check the quadrant either above or below the value
     *      If 256 is in quadrant 2 check 4 -- Fail
     *          Then check quadrant 3        -- Success
     *      If 256 is in quadrant 1 check 3 -- Fail
     *          Then check quadrant 4        -- Success
     *      and so on
     * 
     * >>> Then if that fails the known must be in the quadrant adjacant to 256. 
     *      If 256 is in quadrant 2 check 4 -- Fail
     *          Then check quadrant 3        -- Fail
     *              Then check quadrant 1     -- Success
     *      If 256 is in quadrant 1 check 3 -- Fail
     *          Then check quadrant 4        -- Fail
     *              Then check quadrant 2     -- Success 
     *      and so on
     */
    private static int[][] fillKernelValues(int[][] kernel){
        for(int y = 0; y < kernel.length; y++){
            for(int x = 0; x < kernel.length; x++){
                if(kernel[x][y] == 256){
                    /*  The opposing pixel value in the kernel is always found by 
                     *  subtracting the kernel length minus 1 to the current x or y value
                     *  then multiplying by negative 1
                     *  
                     *  >>> In the case of 0 
                     *         0 - (7- 1)  
                     *         0 - 6 = -6
                     *         -6 * -1 = 6
                     *  (0,0) and (6,6) are on the other sides of the kernel
                     */
                    int newOpposingPixelX = ((x-(kernel.length - 1)) * -1);
                    int newOpposingPixelY = ((y-(kernel.length - 1)) * -1);
                    if(kernel[newOpposingPixelX][newOpposingPixelY] != 256){
                        kernel[x][y] = kernel[newOpposingPixelX][newOpposingPixelY];
                    }else if(kernel[x][newOpposingPixelY] != 256){
                        kernel[x][y] = kernel[x][newOpposingPixelY];
                    }else if(kernel[newOpposingPixelX][y] != 256){
                        kernel[x][y] = kernel[newOpposingPixelX][y];
                    }else{
                        // Incase the algorithm fails set the kernel value to same as the center kernel since it has to have a value
                        kernel[x][y] = kernel[(int) Math.floor(kernel.length/2)][(int) Math.floor(kernel.length/2)];
                    }
                }
            }
        }
        return kernel;
    }
}
