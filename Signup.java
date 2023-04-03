package swingex;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (1650,1080); //full screen
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 232, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-12, 46, 757, 799);
		ImageIcon img=new ImageIcon(this.getClass().getResource("wall2.jpg"));
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("DETAILS");
		lblNewLabel_2.setBackground(new Color(255, 232, 243));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Bodoni MT Black", Font.BOLD, 39));
		lblNewLabel_2.setBounds(1091, 76, 276, 52);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setForeground(new Color(255, 179, 215));
		lblNewLabel_1.setFont(new Font("Bodoni MT Black", Font.BOLD, 25));
		lblNewLabel_1.setBounds(1063, 182, 185, 30);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(1063, 215, 232, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("E-mail :");
		lblNewLabel_1_1.setForeground(new Color(255, 179, 215));
		lblNewLabel_1_1.setFont(new Font("Bodoni MT Black", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(1063, 265, 185, 30);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(1063, 298, 232, 30);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Contact no.");
		lblNewLabel_1_1_1.setForeground(new Color(255, 179, 215));
		lblNewLabel_1_1_1.setFont(new Font("Bodoni MT Black", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(1063, 349, 185, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(1063, 389, 232, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Password :");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 179, 215));
		lblNewLabel_1_1_1_1.setFont(new Font("Bodoni MT Black", Font.BOLD, 25));
		lblNewLabel_1_1_1_1.setBounds(1063, 442, 185, 30);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(1063, 474, 232, 30);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Sign Up !");
		btnNewButton.setFont(new Font("Bodoni MT Black", Font.BOLD, 25));
		btnNewButton.setForeground(new Color(255, 179, 215));
		btnNewButton.setBounds(1101, 550, 169, 61);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(-12, 0, 1620, 46);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_4 = new JLabel("HNM Flower Shop");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Bodoni MT", Font.BOLD, 30));
		panel_1.add(lblNewLabel_4);
	}

}
