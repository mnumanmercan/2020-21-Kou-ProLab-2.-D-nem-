package Karakter;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Gargamel extends Dusman{
    public Gargamel(String ID, String ad, String tur) throws IOException {
        super(ID, ad, tur);
    }
    private BufferedImage icon = ImageIO.read(new FileImageInputStream(new File("gargamel.png")));

    public BufferedImage getIcon() {
        return icon;
    }
}
