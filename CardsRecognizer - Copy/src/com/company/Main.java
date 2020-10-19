package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ImageProcessing imageProcessing = new ImageProcessing();


//        imageProcessing.getRank();
//        System.out.println();
//        imageProcessing.getSuit();
//        System.out.println();
//        File file = new File("C:\\Users\\ABuroff\\Documents\\GIT\\study\\CardsRecognizer\\cards\\alt102.png");
//        showMeSomeMagic(file);


        long m = System.currentTimeMillis();
        String imageFolder = "C:\\Users\\ABuroff\\Documents\\GIT\\study\\CardsRecognizer\\imgs\\";
        File[] scanArray = new File(imageFolder).listFiles((dir, name) -> name.toLowerCase().endsWith(".png"));

        for (File tableImage : scanArray){
            showMeSomeMagic(tableImage);
        }

        System.out.println("Task complited in " + ((double) (System.currentTimeMillis() - m))/1000 + " seconds");

    }

    public static void showMeSomeMagic(File file) throws IOException {
        ImageProcessing imageProcessing = new ImageProcessing();


        int rankWidth = 33;
        int rankHeight = 24;
        int rankTopOffset = -591;
        int[] rankLeftOffset = {-145, -217, -289, -361, -433};

        int suitWidth = 34;
        int suitHeight = 32;
        int suitTopOffset = -634;
        int[] suitLeftOffset = {-168, -240, -312, -383, -455};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < suitLeftOffset.length; i++){
            String suit = imageProcessing.getData(file, suitWidth, suitHeight, suitTopOffset, suitLeftOffset[i]);
            if (!suit.equals("card not found")){
                String rank = imageProcessing.getData(file, rankWidth,rankHeight,rankTopOffset,rankLeftOffset[i]);
                result.append(rank);
                result.append(suit);
            }
        }
        System.out.println(file.getName() + " " + result);
    }

    public static void showMeSomeMagicNew(File file) throws IOException {
        ImageProcessing imageProcessing = new ImageProcessing();


        int rankWidth = 33;
        int rankHeight = 24;
        int rankTopOffset = 591;
        int[] rankLeftOffset = {145, 217, 289, 361, 433};

        int suitWidth = 34;
        int suitHeight = 32;
        int suitTopOffset = 634;
        int[] suitLeftOffset = {168, 240, 312, 383, 455};

        StringBuilder result = new StringBuilder();

        BufferedImage image = ImageIO.read(file);
        BufferedImage bwImage = new BufferedImage(image.getWidth(), image.getHeight(),BufferedImage.TYPE_BYTE_GRAY); //converting image from color to b&w
        Graphics2D outImage = bwImage.createGraphics();
        outImage.drawImage(image, 1, 1, null);
        File outputfile = new File("bwimage.jpg");
        ImageIO.write(bwImage, "jpg", outputfile);

        for (int i = 0; i < suitLeftOffset.length; i++){
            BufferedImage suitImg = bwImage.getSubimage(suitLeftOffset[i], suitTopOffset, suitWidth, suitHeight);
            String suit = imageProcessing.getGumno(suitImg);
            if (!suit.equals("card not found")){
                BufferedImage rankImg = bwImage.getSubimage(rankLeftOffset[i], rankTopOffset, rankWidth, rankHeight);
                String rank = imageProcessing.getGumno(rankImg);
                result.append(rank);
                result.append(suit);
            }
        }
        System.out.println(file.getName() + " " + result);
    }

}


