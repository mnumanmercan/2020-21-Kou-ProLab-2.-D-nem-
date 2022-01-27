package Harita;

import javax.swing.*;
import java.io.IOException;

public class MyFrame extends JFrame {



    public MyFrame() throws IOException {
        Oyun oyun = new Oyun();
        oyun.setBounds(50, 50, 800, 600);
        this.setTitle("Sirinler");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(900, 750);
        this.setLayout(null);

        this.setVisible(true);
        this.addKeyListener(oyun);


        this.add(oyun);

    }


}
