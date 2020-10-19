package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        ImageProcessing imageProcessing = new ImageProcessing();
        String imageFolder = "";
        long m = System.currentTimeMillis();
        if (args.length != 0) {
            imageFolder = args[0];
            System.out.println(Arrays.toString(args));
        } else {
            System.out.println("Images path needed");
            System.exit(0);
        }
        File[] scanArray = new File(imageFolder).listFiles((dir, name) -> name.toLowerCase().endsWith(".png"));

        for (File tableImage : scanArray) {
            recognizeCards(tableImage);
        }
        System.out.println("Task completed in " + ((double) (System.currentTimeMillis() - m)) / 1000 + " seconds");
    }

    public static void recognizeCards(File file) throws IOException {
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

        for (int i = 0; i < suitLeftOffset.length; i++) {
            String suit = imageProcessing.getData(file, suitWidth, suitHeight, suitTopOffset, suitLeftOffset[i]);
            if (!suit.equals("card not found")) {
                String rank = imageProcessing.getData(file, rankWidth, rankHeight, rankTopOffset, rankLeftOffset[i]);
                result.append(rank);
                result.append(suit);
            }
        }
        System.out.println(file.getName() + " " + result);
    }
}


