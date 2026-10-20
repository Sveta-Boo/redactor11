package view;

import controller.Controller;
import model.Cat;
import model.Dog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.geom.Rectangle2D;

import static javax.swing.plaf.basic.DragRecognitionSupport.mousePressed;

public class MyPanel extends JPanel {
    private  final Dog dog=null;
    JTextField t1;
    JTextField t2;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton bSpeak;
    Controller controller;
    //Dog dog;
    Rectangle2D shape;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        controller.setFrame();
        Graphics2D g2 = (Graphics2D) g;
        controller.draw(g2);
    }


    public MyPanel(Controller controller) {
        this.controller = controller;
        //this.dog = dog;
        t1 = new JTextField("                     ");
        t2 = new JTextField("                     ");
        //bSpeak = new JButton("Speak");
        b1 = new JButton("button");
        b2 = new JButton("cat");
        b3 = new JButton("dog");

        add(t1);
        add(t2);
        //add(bSpeak);
        add(b1);
        add(b2);
        add(b3);
        //////////////////

        addMouseListener(MouseAdapter) mousePressed(e) ;


//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                t2.setText(controller.speak());
//            }
//        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                controller.setCat();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               controller.setDog();
            }
        });
    }
}
