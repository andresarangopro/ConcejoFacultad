package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;

public class Administrador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrador frame = new Administrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}  */

	/**
	 * Create the frame.
	 */
	public Administrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		IGReportes igR = new IGReportes();
		igR.setForeground(Color.WHITE);
		tabbedPane.addTab("Reportes", null, igR, null);
		
		IGRegistroSecretaria igRS = new IGRegistroSecretaria();
		tabbedPane.addTab("Manejo Secretaria", null, igRS, null);
		
	}

}
