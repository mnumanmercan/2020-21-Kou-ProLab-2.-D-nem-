package Karakter;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TembelSirin extends Oyuncu{

    public TembelSirin(String ID, String ad, String tur, int skor) throws IOException {

        super(ID, ad, tur, skor);

    }
    private BufferedImage icon = ImageIO.read(new FileImageInputStream(new File("tembelsirin.png")));

    public BufferedImage getIcon() {
        return icon;
    }
}
