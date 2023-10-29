package Home;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField email;
    private JPasswordField password;
    private JButton registerbutton;
    static String[] data;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Login() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 557, 320);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(9, 0, 2));
        contentPane.setForeground(new Color(0, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Serif", Font.BOLD, 16));
        lblEmail.setForeground(new Color(255, 255, 255));
        lblEmail.setBounds(72, 101, 46, 14);
        contentPane.add(lblEmail);

        JLabel lblNewLabel = new JLabel("Password:");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Serif", Font.BOLD, 16));
        lblNewLabel.setBounds(72, 161, 88, 14);
        contentPane.add(lblNewLabel);

        email = new JTextField();
        email.setFont(new Font("Serif", Font.BOLD, 16));
        email.setBounds(184, 91, 278, 34);
        contentPane.add(email);
        email.setColumns(10);

        password = new JPasswordField();
        password.setFont(new Font("Serif", Font.BOLD, 16));
        password.setBounds(184, 151, 278, 34);
        contentPane.add(password);

        JButton loginbutton = new JButton("LOGIN");
        loginbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                if(accountCheck(email.getText(), password.getText()))
                {
                    try {
                        new Dashboard();
                      //  frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(contentPane, "EMAIL OR PASSWORD WAS WRONG...", "MESSAGE", 2);
                }
            }
        });
        loginbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginbutton.setFont(new Font("Agency FB", Font.BOLD, 18));
        loginbutton.setBounds(184, 219, 124, 34);
        contentPane.add(loginbutton);

        registerbutton = new JButton("REGISTER");
        registerbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            RegisterationForm frame = new RegisterationForm();
                            setVisible(false);
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        registerbutton.setFont(new Font("Agency FB", Font.BOLD, 18));
        registerbutton.setBounds(338, 219, 124, 34);
        contentPane.add(registerbutton);

        JLabel lblLogin = new JLabel("L O G I N   ACCOUNT");
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setForeground(Color.WHITE);
        lblLogin.setFont(new Font("Agency FB", Font.BOLD, 26));
        lblLogin.setBounds(0, 21, 541, 34);
        contentPane.add(lblLogin);
    }

    public boolean accountCheck(String email, String pas)
    {
        File file = new File("C:\\Users\\gm comp03452381070\\IdeaProjects\\DS 3rd Semester Project\\src\\File.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine())
            {
                Login.data = reader.nextLine().split(", ");
                if (data.length == 5)
                {
                    if((email.equalsIgnoreCase(data[1])) && (pas.equalsIgnoreCase(data[3])))
                    {
                        return true;
                    }
                }

            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }
}
