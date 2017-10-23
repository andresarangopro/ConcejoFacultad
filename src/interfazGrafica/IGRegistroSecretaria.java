package interfazGrafica;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class IGRegistroSecretaria extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public IGRegistroSecretaria() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(78, 107, 146, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(88, 149, 115, 29);
		panel.add(btnNewButton);

	}
}
