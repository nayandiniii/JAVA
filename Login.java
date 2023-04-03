package swingex;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
	public void open()
	{
		
	}
	public Login() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (1650,1080); //full screen
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 232, 243));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 0, 0);
		setSize (1650,1080);
		contentPane.setLayout(null);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 45, 800, 1004);
		lblNewLabel.setBackground(new Color(0, 0, 160));
		ImageIcon img=new ImageIcon(this.getClass().getResource("wall2.jpg"));
		lblNewLabel.setIcon(img);;
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("       USER");
		lblNewLabel_2.setFont(new Font("Bodoni MT Black", Font.BOLD, 39));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(1073, 79, 276, 52);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("E-Mail: ");
		lblNewLabel_1.setFont(new Font("Bodoni MT Black", Font.BOLD, 22));
		lblNewLabel_1.setForeground(new Color(255, 179, 215));
		lblNewLabel_1.setBounds(1096, 159, 154, 39);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(1096, 204, 254, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(255, 179, 215));
		lblNewLabel_1_1.setFont(new Font("Bodoni MT Black", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(1096, 260, 154, 39);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(1096, 298, 254, 27);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(new Color(255, 179, 215));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 31));
		btnNewButton.setBounds(1151, 384, 154, 52);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(new Color(255, 213, 233));
		lblNewLabel_3.setBounds(1135, 28, 166, 52);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(-12, 0, 1598, 46);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_4 = new JLabel("HNM Flower Shop");
		lblNewLabel_4.setFont(new Font("Bodoni MT", Font.BOLD, 30));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_4);
		
	}
}
