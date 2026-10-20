package controller;

import model.Cat;
import model.Dog;
import model.SpeakBehavior;
import view.MyFrame;
import view.MyPanel;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class Controller {
    Cat cat ;
    Dog dog ;
    MyPanel myPanel ;
    MyFrame mp;
    SpeakBehavior currentAnimal;
    RectangularShape currentShape;
    Point2D[]points;
    public Controller() {
        cat = new Cat("myska");
        dog = new Dog("sharik");
        myPanel = new MyPanel(this);
        mp = new MyFrame(myPanel);
        currentAnimal = cat;
        currentShape = new Ellipse2D.Double();
    }

//    public String speak() {
//        return currentAnimal.speak();
//
//    }

    public void setCat() {
        //currentAnimal = cat;
        currentShape = new Ellipse2D.Double();
    }

    public void setDog() {
        //currentAnimal = dog;
        currentShape = new Rectangle2D.Double();
    }
    public void setFrame() {
        currentShape.setFrameFromDiagonal(points[0], points[1]);
    }
    public void mouseDragged(Point point) { points[1] = point;}

    public void mousePressed(Point point) {
        points[0] = point;
    }

    public void draw(Graphics2D g2) {
        g2.draw(currentShape);
    }
}
