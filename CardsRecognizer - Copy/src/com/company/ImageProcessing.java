package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Map;

import static java.util.Map.entry;

public class ImageProcessing {

    public static final String CARD_2 = "         #########                      ############                   ##############                 ###############                 ######    #####                 ### #     ######                  ##       #####                           #####                          #####                          ######                          ######                        #######                        #######                        #######                        #######                        #######                        ######                        #######                        #################               #################               #################               ################                 ################          ";
    public static final String CARD_3 = "      ################                ################                ################                ################                        #######                        #######                         ######                         ######                         ######                         ########                        ##########                      ###########                      ##########                           ######                           #####                  #        #####                 ###       #####                #####     ######               ################                 ###############                  #############                    ###########                       #######               ";
    public static final String CARD_4 = "                #####                          ######                          ######                         #######                        ########                       #########                      ##########                     ###########                     ##### #####                    #####  #####                   ######  #####                  ######   #####                 ######    #####                ###################             ###################             ###################              ##################                        #####                           #####                           #####                           #####                           #####                            ####           ";
    public static final String CARD_5 = "       ##############                  ##############                  ##############                  ##############                  #####                           #####                           #####                           ####                            ############                    #############                   ##############                  ###############                   ##     ######                           #####                           #####                           #####                 ###       #####                #####     ######                ###############                 ###############                  #############                    ###########                       #######               ";
    public static final String CARD_6 = "           #########                     #############                  ##############                  ##############                 ######     ###                  #####       ##                 ######                          #####    #                      ##############                  ###############                 ################                #################               ######     ######               #####       #####               #####       #####               #####       #####               #####       #####                #####     ######                ###############                  ##############                   ############                    ###########                       #######              ";
    public static final String CARD_7 = "      ################                ################                ################                ################                          ####                            #####                          #####                          ######                          #####                          ######                          #####                          ######                          #####                          ######                          #####                          ######                          #####                          ######                          #####                          ######                          #####                          ######                          #####                    ";
    public static final String CARD_8 = "         ##########                     ############                   ##############                  ###############                ######    ######                #####      #####                #####      #####                #####      #####                 ######  ######                  ##############                    ###########                   ##############                 ################                ######    ######                #####       #####              #####        #####              #####        #####               #####      ######               ################                 ###############                 ##############                   ############                      ########              ";
    public static final String CARD_9 = "          #########                     ############                   ##############                  ###############                ######     #####                #####       #####               #####       #####               #####       #####               #####       #####               ######     ######               #################                ################                 ###############                  ## ###########                    #####  #####                          ######                 #        #####                 # ##     ######                 ##############                 ##############                   #############                    ###########                       #######               ";
    public static final String CARD_10 = "     ######      #########        #########    #############      #########   ###############     #########  ################     #########  ######     ######        ##### ######       #####        ##### #####        ######       ##### #####         #####       ###########         #####       ##########          #####       ##########          #####       ##########          #####       ##########          #####       ###########         #####       ##### #####         #####       ##### #####        ######       ##### ######       #####        #####  ######     ######        #####  # ##############         #####   ###############         #####    #############          #####     ## #######             ####       ######        ";
    public static final String CARD_10A = "  ########     ############      #########    ##############     #########   ################    #########  #######    #####      #   ####  ######      ######        #### ######        #####        #### #####         ######       #### #####          #####       #### #####          #####       #### #####          #####       #### #####          #####       #### #####          #####       #### #####          #####       #### #####         ######       #### ######        #####        ####  #####       ######        ####  ######     #######        ####   ################         ####   ###############          ####    #############           ####      ##########            ####       #######                                        ";
    public static final String CARD_10B = "     ######      #########        #########    ############      ##########   ###############     #########  ################     #########  ######    #######    #   ##### ######       #####        ##### #####        ######       ##### #####         #####      ###########         #####       ##########          #####       ##########          #####       ##########          #####       ##########          #####       ###########         #####       ##### #####         #####       ##### #####        ######       ##### ######       #####        #####  ######     ######        #####  ################         #####   ##############          #####    ############           #####     ##########            #####       ######        ";
    public static final String CARD_J = "               #####                           #####                           #####                           #####                           #####                           #####                           #####                           #####                           #####                           #####                           #####                           #####                           #####                           #####                           #####                          ######                  ###     #####                  #####   ######                  ##############                  #############                    ############                     ##########                        ######                 ";
    public static final String CARD_Q = "            ###########                   ##############                 #################              ###################             #######     ########           ######         ######          ######           ######         ######           ######         #####             #####         #####             #####         #####             #### #        #####        ##   #### #        #####       ####  #####         #####      ###### #####         ######     ############         ######      ###########          ######      #########             ######     ########            ####################             #####################            ###################               ###########  ###                  #######     ##    ";
    public static final String CARD_K = "       ####         ######             ####        ######              ####       ######               ####      ######                ####     ######                 ####    #######                 ####   #######                  ####  #######                   ####  ######                    #### ######                     ###########                     ############                    #############                   ####### ######                  ######  ######                  #####    ######                 ####      ######                ####       ######               ####       # ####               ####        ######              ####         ######             ####          ######            ####           ####      ";
    public static final String CARD_A = "            #####                          ######                          #####                          ########                        ########                       ##########                      ##########                     #####  #####                    #####  #####                    #####  ######                  #####    #####                  #####    #####                 #####      #####                ################               ##################              ##################              ###################            #####          #####            #####          #####           #####            #####          #####            ####           ###              ######         ####              #####      ";

    public static final String SUIT_D = "             #####                           #######                          ########                        ##########                      ############                    ##############                  ############## #                #################               ###################             ######################          ########################        #########################       ###########################     #############################    ##############################   #############################     ############################      ##########################        ########################          ######################            ####################             ###################               #################                 ###############                   #############                     ############                      ##########                        ###### #                         #######                           #####                             ###                ";
    public static final String SUIT_S = "               ##                              ####                            ######                          ########                        ##########                      ############                    ##############                  ################                ##################              ####################           #######################         #########################        ##########################      ############################    #############################    ##############################   ##############################  ###############################  ###############################  ###############################  ###############################   ##############################   #############################     ############################     ############### ###########        ########  ###  #########           ####    ####   #####                    #####                           #######                       #############                    #############           ";
    public static final String SUIT_C = "           #########                       ###########                     #############                   ##############                   ###############                  ###############                  ###############                  ###############                  ###############                  ##############                    #############                 ####################           ########################        ##########################      ############################    #############################    ##############################  ###############################  ###############################  ###############################  ###############################   ##############################   #############################     ############################      ##########################        ######### ### ##########           #####  #####   #####                   #######                         #########                       ###########                    ##############           ";
    public static final String SUIT_H = "                                                                                                                                          ######       ######            ##########    ##########        ############ #############      ############################    #############################    ############################ #  # #############################  ###############################  ###############################  ###############################  ###############################   ##############################   #############################     ############################     ###########################       ##########################        ########################          ######################            ####################              ##################                ################                  ##############                    ###########                       #########                         #######                           #####                             ###                ";

    public final Map<String, String> refData = Map.ofEntries(
            entry(CARD_2, "2"),
            entry(CARD_3, "3"),
            entry(CARD_4, "4"),
            entry(CARD_5, "5"),
            entry(CARD_6, "6"),
            entry(CARD_7, "7"),
            entry(CARD_8,"8"),
            entry(CARD_9, "9"),
            entry(CARD_10, "10"),
            entry(CARD_J, "J"),
            entry(CARD_Q, "Q"),
            entry(CARD_K, "K"),
            entry(CARD_A, "A"),
            entry(SUIT_C, "c"),
            entry(SUIT_D, "d"),
            entry(SUIT_H, "h"),
            entry(SUIT_S, "s")
    );

    public String getData (File file, int width, int height, int topOffset, int leftOffset) throws IOException{
        BufferedImage image = ImageIO.read(file);
        BufferedImage bwImage = new BufferedImage(image.getWidth(), image.getHeight(),BufferedImage.TYPE_BYTE_GRAY); //converting image from color to b&w
        Graphics2D outImage = bwImage.createGraphics();
        outImage.drawImage(image, leftOffset, topOffset, null); //creating rank picture

        int whiteBg = -1;
        int greyBg = -4802890;
        StringBuilder binaryString = new StringBuilder();
        for (short y = 1; y < height; y++)
            for (short x = 1; x < width; x++) {
                int rgb = bwImage.getRGB(x, y);
                binaryString.append((rgb == whiteBg) || (rgb == greyBg)  ? " " : "#");
            }

        int min = 75;
        String value = "";
        for (Map.Entry<String, String> entry : refData.entrySet()) {
            int levenshtein = distance(binaryString.toString(), entry.getKey());
            if (levenshtein < min) {
                min = levenshtein;
                value = entry.getValue();
            }
        }
        return value;
    }


    public String getGumno (BufferedImage bwImage) throws IOException{

        int whiteBg = -1;
        int greyBg = -4802890;
        StringBuilder binaryString = new StringBuilder();
        for (short y = 1; y < bwImage.getHeight(); y++)
            for (short x = 1; x < bwImage.getWidth(); x++) {
                int rgb = bwImage.getRGB(x, y);
                binaryString.append((rgb == whiteBg) || (rgb == greyBg)  ? " " : "#");
            }

        int min = 55;
        String value = "";
        for (Map.Entry<String, String> entry : refData.entrySet()) {
            int levenshtein = distance(binaryString.toString(), entry.getKey());
            if (levenshtein < min) {
                min = levenshtein;
                value = entry.getValue();
                return value;
            }
        }
        return "card not found";
    }

    public StringBuilder getRank () throws IOException {
        int width = 33;
        int height = 24;
        int topOffset = -591;
        int firstCard = -145;

        BufferedImage image = ImageIO.read(new File("C:\\Users\\ABuroff\\Documents\\GIT\\study\\CardsRecognizer\\cards\\alt102.png"));
        BufferedImage bwImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY); //converting image from color to b&w
        Graphics2D newRank = bwImage.createGraphics();
        newRank.drawImage(image, firstCard, topOffset, null); //creating rank picture

        int whiteBg = -1;
        int greyBg = -4802890;
        StringBuilder binaryString = new StringBuilder();
        for (short y = 1; y < height; y++)
            for (short x = 1; x < width; x++) {
                int rgb = bwImage.getRGB(x, y);
                binaryString.append((rgb == whiteBg) || (rgb == greyBg)  ? " " : "#");
            }
        System.out.println(binaryString);
        return binaryString;
    }

    public StringBuilder getSuit () throws IOException {
        int width = 34;
        int height = 32;
        int topOffset = -634;
        int firstCard = -168;

        BufferedImage image = ImageIO.read(new File("C:\\Users\\ABuroff\\Documents\\GIT\\study\\CardsRecognizer\\cards\\alt102.png"));
        BufferedImage bwImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY); //converting image from color to b&w
        Graphics2D newRank = bwImage.createGraphics();
        newRank.drawImage(image, firstCard, topOffset, null); //creating rank picture

        int whiteBg = -1;
        int greyBg = -4802890;
        StringBuilder binaryString = new StringBuilder();
        for (short y = 1; y < height; y++)
            for (short x = 1; x < width; x++) {
                int rgb = bwImage.getRGB(x, y);
                binaryString.append((rgb == whiteBg) || (rgb == greyBg)  ? " " : "#");
            }
        System.out.println(binaryString);
        return binaryString;
    }

    public int distance(String a, String b) {
        // i == 0
        int [] costs = new int [b.length() + 1];
        for (int j = 0; j < costs.length; j++)
            costs[j] = j;
        for (int i = 1; i <= a.length(); i++) {
            // j == 0; nw = lev(i - 1, j)
            costs[0] = i;
            int nw = i - 1;
            for (int j = 1; j <= b.length(); j++) {
                int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]), a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1);
                nw = costs[j];
                costs[j] = cj;
            }
        }
        return costs[b.length()];
    }
}
