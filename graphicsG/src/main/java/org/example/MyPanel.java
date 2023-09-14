package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyPanel extends JPanel implements ActionListener {
    final int WIDTH = 500;
    final int HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    double xVelocity = 1;
    double yVelocity = 0.5;
    double x = 0;
    double y = 0;
    MyPanel(){
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        enemy = new ImageIcon("src/main/charizard.png").getImage();
        timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(enemy, (int) x, (int) y,null);
//        Rectangle2D.Double r = new Rectangle2D.Double(10,10,10,10);
//        g2D.fill(r);
    }
    private void randomWalkPattern(){
        Random r = new Random();
        int low = 0;
        int high = 3;
        int random = r.nextInt(high-low)+low;
        switch (random){
            case 0:
                x += 1;
                break;
            case 1:
                y += 1;
                break;
            case 2:
                x -= 1;
                break;
            case 3:
                y -= 1;
                break;
        }
        //guardar em uma variavel para verificar se vai sair da tela antes

//        random *= 1000;
//        random = Math.floor(random);
//        random /= 10;
//        System.out.println(random);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        randomWalkPattern();
//        if (x>HEIGHT - enemy.getHeight(null)|| x<0){
//            xVelocity *= -1;
//        }
//        if (y>WIDTH - enemy.getWidth(null)|| y<0){
//            yVelocity *= -1;
//        }
//
//        x += xVelocity;
//
//        y += yVelocity;
        repaint();
    }
}
