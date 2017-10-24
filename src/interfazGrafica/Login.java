package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mundo.HintTextFieldUI;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField textField_1;

	
	/**
	 * Launch the application*/
	
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
		setBounds(100, 100, 395, 366);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtA = new JTextField();
		txtA.setBounds(125, 170, 110, 27);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 218, 110, 27);
		contentPane.add(textField_1);
		textField_1.setUI(new HintTextFieldUI("Search", true));
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(Color.BLACK);	
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(135, 264, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}

