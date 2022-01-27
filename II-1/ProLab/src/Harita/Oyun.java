package Harita;


import Karakter.*;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

import javax.swing.Timer;

public class Oyun extends JPanel implements KeyListener {
    private int sirinX = 300, sirinY = 250, dusman1X, dusman1Y, dusman2X, dusman2Y;
    private int dirX = 50, dirY = 50;
    private int kapiAx = 150, kapiAy = 0;
    private int kapiBx = 500, kapiBy = 0;
    private int kapiCx = 0, kapiCy = 250;
    private int kapiDx = 150, kapiDy = 500;
    private BufferedImage imageSirine, imageTembel, imageGozluklu, imageGargamel, imageAzman;
    ArrayList<Integer> duvarX = new ArrayList<>();
    ArrayList<Integer> duvarY = new ArrayList<>();
    private int skor;
    String message = "1- Gozluklu sirin\n" +
            "2- Tembel Sirin\n";
    Gargamel gargamel = new Gargamel("G1D", "Gargamel", "Dusman");
    Azman azman = new Azman("A2D", "Azman", "Dusman");
    TembelSirin tembelSirin = new TembelSirin("T2O", "Tembel", "Oyuncu", 25);
    GozlukluSirin gozlukluSirin = new GozlukluSirin("G1O", "Tembel", "Oyuncu", 25);
    Scanner sc = new Scanner(System.in);
    int secim;
    char[] dusman1 = new char[2];
    char[] dusman2 = new char[2];

    public Oyun() throws IOException {

        System.out.println("Oyuncu secin : " + "\n" + message);
        secim = sc.nextInt();
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("harita.txt")));
        int i = 0;
        try {
            imageSirine = ImageIO.read(new FileImageInputStream(new File("sirine.png")));
            imageTembel = tembelSirin.getIcon();
            imageGozluklu = gozlukluSirin.getIcon();
            imageGargamel = gargamel.getIcon();
            imageAzman = azman.getIcon();
            //---------------------------
            while (i < 2) {
                String dusman = scanner.nextLine();
                if (i == 0) {
                    dusman1[0] = dusman.charAt(9);
                    if (dusman.charAt(9) == 'G') {
                        dusman1[1] = dusman.charAt(23);
                    } else if (dusman.charAt(9) == 'A') {
                        dusman1[1] = dusman.charAt(20);
                    }

                } else if (i == 1) {
                    dusman2[0] = dusman.charAt(9);
                    if (dusman.charAt(9) == 'G') {
                        dusman2[1] = dusman.charAt(23);
                    } else if (dusman.charAt(9) == 'A') {
                        dusman2[1] = dusman.charAt(20);
                    }

                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (dusman1[0] == 'G') {
            switch (dusman1[1]) {
                case 'A':
                    dusman1X = kapiAx;
                    dusman1Y = kapiAy;
                    break;
                case 'B':
                    dusman1X = kapiBx;
                    dusman1Y = kapiBy;
                    break;
                case 'C':
                    dusman1X = kapiCx;
                    dusman1Y = kapiCy;
                    break;
                case 'D':
                    dusman1X = kapiDx;
                    dusman1Y = kapiDy;
                    break;
            }
        } else if (dusman1[0] == 'A') {
            switch (dusman1[1]) {
                case 'A':
                    dusman1X = kapiAx;
                    dusman1Y = kapiAy;
                    break;
                case 'B':
                    dusman1X = kapiBx;
                    dusman1Y = kapiBy;
                    break;
                case 'C':
                    dusman1X = kapiCx;
                    dusman1Y = kapiCy;
                    break;
                case 'D':
                    dusman1X = kapiDx;
                    dusman1Y = kapiDy;
                    break;
            }
        }
        if (dusman2[0] == 'G') {
            switch (dusman2[1]) {
                case 'A':
                    dusman2X = kapiAx;
                    dusman2Y = kapiAy;
                    break;
                case 'B':
                    dusman2X = kapiBx;
                    dusman2Y = kapiBy;
                    break;
                case 'C':
                    dusman2X = kapiCx;
                    dusman2Y = kapiCy;
                    break;
                case 'D':
                    dusman2X = kapiDx;
                    dusman2Y = kapiDy;
                    break;
            }
        } else if (dusman2[0] == 'A') {
            switch (dusman2[1]) {
                case 'A':
                    dusman2X = kapiAx;
                    dusman2Y = kapiAy;
                    break;
                case 'B':
                    dusman2X = kapiBx;
                    dusman2Y = kapiBy;
                    break;
                case 'C':
                    dusman2X = kapiCx;
                    dusman2Y = kapiCy;
                    break;
                case 'D':
                    dusman2X = kapiDx;
                    dusman2Y = kapiDy;
                    break;
            }
        }
        this.addKeyListener(this);

        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int i = 0, y = 0;


        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("harita.txt")))) {
            while (sc.hasNextLine()) {
                i++;
                String harita = sc.nextLine();
                if (i > 2) {
                    String[] array = harita.split("\t");
                    for (int x = 0; x < 13; x++) {
                        if (array[x].equals("1")) {
                            if (y == 5 && x == 0 || x == 3 && y == 0 || x == 3 && y == 10 || x == 10 && y == 0) {
                                g.setColor(Color.pink);
                            } else {
                                g.setColor(Color.WHITE);
                            }
                            g.fillRect(x * 50, y * 50, 50, 50);
                        } else if (array[x].equals("0")) {
                            duvarX.add(x * 50);
                            duvarY.add(y * 50);
                            g.setColor(Color.darkGray);
                            g.fillRect(x * 50, y * 50, 50, 50);
                        }
                    }
                    y++;
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int x1 = 0; x1 < 13; x1++) {
            g.setColor(Color.gray);
            g.drawLine((x1 * 50) + 50, 0, (x1 * 50) + 50, 550);

        }
        for (int y1 = 0; y1 < 11; y1++) {
            g.setColor(Color.gray);
            g.drawLine(0, (y1 * 50) + 50, 650, (y1 * 50) + 50);
        }
        g.drawImage(imageSirine, 660, 335, imageSirine.getWidth() / 30, imageSirine.getHeight() / 30, this);


        switch (secim) {
            case 1:
                g.drawImage(imageGozluklu, sirinX, sirinY, imageGozluklu.getWidth() / 15, imageGozluklu.getHeight() / 15, this);
                skor = gozlukluSirin.getSkor();
                break;
            case 2:
                g.drawImage(imageTembel, sirinX - 3, sirinY - 7, imageTembel.getWidth() / 5, imageTembel.getHeight() / 5, this);
                skor = tembelSirin.getSkor();
                break;
            default:
                System.out.println("Yanlis secim");
                break;
        }
        if (dusman1[0] == 'G') {
            g.drawImage(imageGargamel, dusman1X, dusman1Y, imageGargamel.getWidth() / 10, imageGargamel.getHeight() / 11, this);
        } else if (dusman1[0] == 'A') {
            g.drawImage(imageAzman, dusman1X + 10, dusman1Y, imageAzman.getWidth() / 5, imageAzman.getHeight() / 5, this);
        }
        if (dusman2[0] == 'G') {
            g.drawImage(imageGargamel, dusman2X, dusman2Y, imageGargamel.getWidth() / 10, imageGargamel.getHeight() / 11, this);
        } else if (dusman2[0] == 'A') {
            g.drawImage(imageAzman, dusman2X + 10, dusman2Y, imageAzman.getWidth() / 5, imageAzman.getHeight() / 5, this);
        }


    }

    @Override
    public void repaint() {
        super.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                if (sirinX <= 50) {
                    sirinX -= 0;
                } else if (((sirinX > 50 && sirinX <= 150) && (sirinY == 100 || sirinY == 200 || sirinY == 250 || sirinY == 300 || sirinY == 350 || sirinY == 400))) {
                    sirinX -= 0;
                } else if (((sirinX > 150 && sirinX <= 200) && (sirinY == 300))) {
                    sirinX -= 0;
                } else if (((sirinX > 200 && sirinX <= 300) && (sirinY == 50 || sirinY == 150 || sirinY == 200))) {
                    sirinX -= 0;
                } else if (((sirinX > 300 && sirinX <= 400) && (sirinY == 150 || sirinY == 200 || sirinY == 250 || sirinY == 300))) {
                    sirinX -= 0;
                } else if (((sirinX > 400 && sirinX <= 450) && (sirinY == 400))) {
                    sirinX -= 0;
                } else if (((sirinX > 450 && sirinX <= 500) && (sirinY == 250))) {
                    sirinX -= 0;
                } else if (((sirinX > 500 && sirinX <= 550) && (sirinY == 100 || sirinY == 150 || sirinY == 200))) {
                    sirinX -= 0;
                } else {
                    sirinX -= dirX;
                    //dusman1Y += 50;
                }


                break;
            case 38:
                int kontrol2 = 0;
                if (sirinY <= 50) {
                    sirinY -= 0;
                } else if (((sirinY <= 100 && sirinY > 50) || (sirinY <= 250 && sirinY > 200)) && (sirinX == 250)) {
                    sirinY -= 0;
                } else if ((sirinY <= 350 && sirinY > 300) && (sirinX == 350)) {
                    sirinY += 0;
                } else if ((sirinY <= 150 || (sirinY <= 450 && sirinY > 400)) && (sirinX == 100)) {
                    sirinY -= 0;
                } else if ((sirinY <= 350 && sirinY > 300) && (sirinX == 150)) {
                    sirinY -= 0;
                } else if ((sirinY <= 450 && sirinY > 400) && (sirinX == 200 || sirinX == 250 || sirinX == 300 || sirinX == 350 || sirinX == 400)) {
                    sirinY -= 0;
                } else if ((sirinY <= 150 && sirinY > 100 || sirinY <= 300 && sirinY > 250) && (sirinX == 450)) {
                    sirinY -= 0;
                } else if ((sirinY <= 250 && sirinY > 200) && (sirinX == 500)) {
                    sirinY -= 0;
                } else if ((sirinY <= 350 && sirinY > 300) && (sirinX == 600)) {
                    sirinY -= 0;
                } else {
                    sirinY -= dirY;
                }

                break;
            case 39:
                int kontrol3 = 0;
                if (((sirinX + 50 >= 100 && sirinX + 50 < 200) && (sirinY == 100 || sirinY == 200 || sirinY == 250 || sirinY == 300 || sirinY == 350 || sirinY == 400))) {
                    sirinX += 0;
                } else if (((sirinX + 50 >= 200 && sirinX + 50 < 250) && (sirinY == 200 || sirinY == 400))) {
                    sirinX += 0;
                } else if (((sirinX + 50 >= 250 && sirinX < 250) && (sirinY == 50 || sirinY == 150))) {
                    sirinX += 0;
                } else if (((sirinX + 50 >= 350 && sirinX < 400) && (sirinY == 150 || sirinY == 200 || sirinY == 250 || sirinY == 300))) {
                    sirinX += 0;
                } else if (((sirinX + 50 >= 450 && sirinX < 500) && (sirinY == 100 || sirinY == 200 || sirinY == 250))) {
                    sirinX += 0;
                } else if (((sirinX + 50 >= 500 && sirinX < 550) && (sirinY == 100 || sirinY == 150 || sirinY == 200))) {
                    sirinX += 0;
                } else if (((sirinX + 50 >= 600) && (sirinY != 350))) {
                    sirinX += 0;
                } else if (((sirinX + 50 >= 650) && (sirinY == 350))) {
                    JOptionPane.showMessageDialog(this, "Tebrikler Kazandiniz. \n Puaninin : " + skor);
                    sirinX += 0;
                } else {
                    sirinX += dirX;
                }
                break;
            case 40:
                int kontrol4 = 0;

                if (sirinY + 50 >= 500) {
                    sirinY += 0;
                } else if ((sirinY + 50 >= 100 && sirinY < 150) && (sirinX == 100 || sirinX == 450 || sirinX == 500)) {
                    sirinY += 0;
                } else if ((sirinY + 50 >= 150 && sirinY < 200) && (sirinX == 250 || sirinX == 350)) {
                    sirinY += 0;
                } else if ((sirinY + 50 >= 200 && sirinY < 250) && (sirinX == 200 || sirinX == 450)) {
                    sirinY += 0;
                } else if ((sirinY + 50 >= 300 && sirinY < 350) && (sirinX == 150)) {
                    sirinY += 0;
                } else if ((sirinY + 50 >= 400 && sirinY < 450) && (sirinX == 200 || sirinX == 250 || sirinX == 300 || sirinX == 350 || sirinX == 400)) {
                    sirinY += 0;
                } else if ((sirinY + 50 >= 350 && sirinY < 400) && (sirinX == 600)) {
                    sirinY += 0;
                } else {
                    sirinY += dirY;
                }

                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Tuslanan karakter : " + e.getKeyChar() + " - Karakterin kodu : " + e.getKeyCode());
    }


}
