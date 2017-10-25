package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mundo.HintTextFieldUI;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtMail;
	private JPasswordField pFPass;

	
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
		setBounds(100, 100, 330, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
	
		txtMail = new JTextField();
		txtMail.setHorizontalAlignment(SwingConstants.LEFT);
		txtMail.setBounds(45, 268, 220, 30);
		contentPane.add(txtMail);
		txtMail.setColumns(10);
		txtMail.setUI(new HintTextFieldUI("Correo", true));
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    new Administrador().setVisible(true);

			    Login.this.setVisible(false);//to close the current jframe
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);	
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(105, 421, 100, 30);
		contentPane.add(btnNewButton);
		
		pFPass = new JPasswordField();
		pFPass.setBounds(45, 332, 220, 30);
		contentPane.add(pFPass);
		pFPass.setUI(new HintTextFieldUI("Contraseña", true));
		
		JLabel lblIcon = new JLabel("");		
		lblIcon.setBounds(80, 21, 150, 150);
		ImageIcon icon = new ImageIcon("img/usuario.png"); 
		icon = getScaledImage(icon.getImage(), lblIcon);		
		lblIcon.setIcon(icon);
		contentPane.add(lblIcon);
	}
	
	private ImageIcon getScaledImage(Image srcImg, JLabel label){		
		int w = label.getWidth();
		int h = label.getHeight();
		
	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2 = resizedImg.createGraphics();

	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    g2.drawImage(srcImg, 0, 0, w, h, null);
	    g2.dispose();
	    
	    ImageIcon icon = new ImageIcon(resizedImg);
	    
	    return icon;
	}
}

