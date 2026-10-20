package view;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel myPanel;
    public MyFrame(MyPanel myPanel)  {
        this.myPanel = myPanel;
        super.setSize(500, 500);


        super.add(myPanel);

        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
