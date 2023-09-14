package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class DrawingCanvas extends JComponent {
    private int width;
    private int height;

    public DrawingCanvas(int width, int height) {
        this.width = width;
        this.height = height;
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setRenderingHints(rh);

        Path2D.Double p = new Path2D.Double();
        p.moveTo(100,300);
        p.lineTo(150,200);
        p.lineTo(200,300);
        p.closePath();
        g2d.fill(p);

        Path2D.Double curve = new Path2D.Double();
        curve.moveTo(250,400);
        curve.curveTo(350,300, 500,300,600,400);
        curve.lineTo(600,300);
        curve.lineTo(250,300);
        curve.closePath();
        g2d.fill(curve);

//        Rectangle2D.Double r = new Rectangle2D.Double(0,0, width, height);
//        g2d.setColor(new Color(100,149,237));
//        g2d.fill(r);

//        Ellipse2D.Double e = new Ellipse2D.Double(200,75,100,100);
//        g2d.setColor(Color.BLUE);
//        g2d.fill(e);
//
//        Line2D.Double l = new Line2D.Double(100,250,300,75);
//        g2d.setColor(Color.BLACK);
//        g2d.draw(l);

    }
}
