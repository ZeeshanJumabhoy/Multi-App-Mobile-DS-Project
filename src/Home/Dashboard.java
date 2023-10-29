package Home;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import Chess.Main;
import Chess.Menu;
import Phone.Home;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;
public class Dashboard {
    static int x=1;
    public Dashboard()
    {
        ImageIcon bg = new ImageIcon("bg.jpg");
        ImageIcon bg1 = new ImageIcon("bg1.jpg");
        ImageIcon bg2 = new ImageIcon("bg2.jpg");
        ImageIcon wl = new ImageIcon("wlogo.png");
        ImageIcon cl = new ImageIcon("chesslogo.png");
        ImageIcon ml = new ImageIcon("Phone.png");


        JLabel border = new JLabel();
        border.setVerticalAlignment(0);
        border.setSize(600, 750);
        border.setOpaque(true);
        border.setBackground(Color.green);
        border.setIcon(bg);
        JLabel wallpaper = new JLabel();
        wallpaper.setSize(600, 750);
        wallpaper.setIcon(bg);
        wallpaper.setBorder(BorderFactory.createMatteBorder(
                8, 8, 8, 8, Color.GRAY));


        JButton testb = new JButton();
        testb.setBounds(0, 100, 8, 50);
        testb.setToolTipText("Sleep Phone");

        JButton exit = new JButton();
        exit.setBackground(Color.red);
        exit.setBounds(592, 100, 8, 30);
        exit.setToolTipText("switch off");
        JButton cw = new JButton();
        cw.setIcon(wl);
        cw.setBackground(Color.LIGHT_GRAY);
        cw.setToolTipText("Change wallpaper");
        cw.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (x == 1) {
                    wallpaper.setIcon(bg1);
                    x = 2;
                } else if (x == 2) {
                    wallpaper.setIcon(bg);
                    x = 3;
                } else {
                    wallpaper.setIcon(bg2);
                    x = 1;
                }
            }
        });
        cw.setBounds(10, 10, 50, 50);
        cw.setVisible(false);
        cw.setOpaque(false);
        cw.setContentAreaFilled(false);
        cw.setBorderPainted(false);

        JButton  game= new JButton();
        game.setBounds(10, 100, 50, 50);
        game.setIcon(cl);
        game.setVisible(false);
        game.setOpaque(false);
        game.setContentAreaFilled(false);
        game.setBorderPainted(false);
        game.setToolTipText("Play Chess");

        JButton mazeb = new JButton();
        mazeb.setBounds(10, 200, 50, 50);
        mazeb.setToolTipText("Add Contact Info");
        mazeb.setIcon(ml);
        mazeb.setVisible(false);
        mazeb.setOpaque(false);
        mazeb.setContentAreaFilled(false);
        mazeb.setBorderPainted(false);

        JPanel p = new JPanel();
        JPanel p2 = new JPanel();

        p.setBounds(0, 0, 600, 750);
        p.setBackground(Color.black);
        p.setBorder(BorderFactory.createMatteBorder(
                8, 8, 8, 8, Color.GRAY));


        game.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                new Menu();
            }
        });
	    mazeb.addMouseListener(new MouseAdapter() {
            @Override
		public void mouseClicked(MouseEvent e) {
			new Home();
		}
	});

        testb.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                if (p.isVisible()) {
                    p.setVisible(false);
                    testb.revalidate();
                    exit.revalidate();
                    cw.setVisible(true);
                    game.setVisible(true);
                    mazeb.setVisible(true);
                } else {
                    p.setVisible(true);
                    testb.revalidate();
                    exit.revalidate();
                    cw.setVisible(false);
                    game.setVisible(false);
                    mazeb.setVisible(false);
                }
            }


        });
        exit.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });


        p.add(border);

        p.revalidate();
        p2.setBounds(0, 0, 600, 750);
        //p2.setBackground(Color.red);

        p2.setBorder(BorderFactory.createMatteBorder(
                8, 12, 8, 8, Color.GRAY));
        //p2.add(border);
        p2.revalidate();

        JFrame frame = new JFrame();
        frame.setSize(600, 750);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(p);
        frame.setLocationRelativeTo(null);
        frame.setUndecorated(true);
        frame.getContentPane().add(mazeb);
        frame.getContentPane().add(game);
        frame.getContentPane().add(exit);
        frame.getContentPane().add(cw);
        frame.getContentPane().add(testb);
        frame.getContentPane().add(wallpaper);

        frame.revalidate();
        frame.setVisible(true);
    }
    public static void main(String args[]) {
        new Dashboard();
    }
}
