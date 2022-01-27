package Karakter;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GozlukluSirin extends Oyuncu{

    public GozlukluSirin(String ID, String ad, String tur,int skor) throws IOException {
        super(ID, ad, tur,skor);
    }
    private BufferedImage icon = ImageIO.read(new FileImageInputStream(new File("gozluklu.png")));

    public BufferedImage getIcon() {
        return icon;
    }
}
