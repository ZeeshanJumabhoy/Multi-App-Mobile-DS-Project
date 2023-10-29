package Chess;


import javax.swing.JFrame;
import javax.swing.JMenuBar;

import Chess.GamePanel;


public class GameFrame extends JFrame  {


    private GamePanel panel;
    public GameFrame(GamePanel gamePanel){
        super("Chess");


        panel = gamePanel;
        this.add(panel);


        this.setJMenuBar(new JMenuBar());
        this.setBounds(100,150, 600, 750);
        this.setResizable(false);
        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
