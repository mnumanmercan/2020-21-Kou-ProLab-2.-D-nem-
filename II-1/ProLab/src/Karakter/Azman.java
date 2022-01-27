package Karakter;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Azman extends Dusman{
    public Azman(String ID, String ad, String tur) throws IOException {
        super(ID, ad, tur);

    }
    private BufferedImage icon = ImageIO.read(new FileImageInputStream(new File("Azman.png")));

    public BufferedImage getIcon() {
        return icon;
    }

}
