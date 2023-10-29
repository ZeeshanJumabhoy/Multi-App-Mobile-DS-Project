package Chess;

import Home.Dashboard;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Menu extends JFrame {
    ImageIcon bg= new ImageIcon("img.jpg");
    JPanel menuPanel ;
    JButton hot;
    JLabel name;
    public Menu() {
        super("Chess");
        this.setDefaultCloseOperation(Dashboard.class);

        Font f =new Font(Font.DIALOG, Font.PLAIN, 24);
        menuPanel = new JPanel();
        menuPanel.setLayout(new GridBagLayout());


        GridBagConstraints c = new GridBagConstraints();

        c.weightx = 1;
        c.weighty = .25;
        c.insets = new Insets(50, 50, 50, 50);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        this.add(menuPanel);

        name = new JLabel("CHESS");
        hot = new JButton("PLAY");


        name.setFont(f);
        hot.setFont(f);

        JLabel wallpaper=new JLabel();
        wallpaper.setSize(600, 750);
        wallpaper.setIcon(bg);
        menuPanel.setBackground(Color.decode("#bb4446"));
        hot.setBackground(Color.decode("#f1e4c1"));
        hot.setOpaque(true);


        hot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GameFrame(new GamePanelHot());
                setVisible(false);
                dispose();
            }
        });

        menuPanel.add(wallpaper);
        menuPanel.add(name ,c);
        menuPanel.add(hot ,c);



        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);




    }
    private void setDefaultCloseOperation(Class<Dashboard> class1) {
        // TODO Auto-generated method stub

    }
}
