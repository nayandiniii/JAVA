package swingex;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;

public class option extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					option frame = new option();
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
	public option() {

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize (1650,1080); //full screen
getContentPane().setLayout(null);
JLabel lblNewLabel_1 = new JLabel("New label");
lblNewLabel_1.setLocation(0, 10);
lblNewLabel_1.setBackground(new Color(0, 0, 0));
lblNewLabel_1.setSize(1540,930);
getContentPane().add(lblNewLabel_1);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setSize(1650,1080);
ImageIcon img = new ImageIcon(this.getClass().getResource("last1 (1).png")); //image
lblNewLabel_1.setIcon(img);
JPanel panel = new JPanel();
panel.setBackground(new Color(0, 0, 0));
panel.setBounds(0, 0, 1540, 70);
getContentPane().add(panel);
panel.setLayout(null);
JLabel lblNewLabel_11 = new JLabel("HNM Flower Shop");
lblNewLabel_11.setBounds(636, 11, 383, 55);
lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
panel.add(lblNewLabel_11);
lblNewLabel_11.setFont(new Font("Bodoni MT", Font.BOLD, 30));
lblNewLabel_11.setForeground(new Color(255, 255, 255));
JButton btnLogin = new JButton("LOGIN");
btnLogin.setForeground(new Color(255,255,255));
btnLogin.setFont(new Font("Bodoni MT", Font.BOLD, 30));
btnLogin.setBackground(new Color(	255, 182, 193));
btnLogin.setActionCommand("LOGIN");
btnLogin.setBounds(300, 300, 299, 78);
btnLogin.addActionListener(e -> {
	Login f= new Login();
    f.setVisible(true);
    dispose(); // close the current window
});
getContentPane().add(btnLogin);
JButton btnNewButton = new JButton("SIGNUP");
btnNewButton.setForeground(new Color(255,255,255));
btnNewButton.setFont(new Font("Badoni MT", Font.BOLD,30));
btnNewButton.setBackground(new Color(255,182,193));
btnNewButton.setActionCommand("SINGUP");
btnNewButton.setBounds(1000, 300, 299,78);
btnNewButton.addActionListener(e -> {
	Signup f= new Signup();
    f.setVisible(true);
    dispose(); // close the current window
});
getContentPane().add(btnNewButton);

		contentPane = new JPanel();
		

		
	}
}
