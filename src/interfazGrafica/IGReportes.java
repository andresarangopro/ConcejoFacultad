package interfazGrafica;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class IGReportes extends JPanel {

	/**
	 * Create the panel.
	 */
	public IGReportes() {
		setBackground(Color.WHITE);
		
		JLabel lblBienvenido = new JLabel("BIENVENIDO!!");
		add(lblBienvenido);

	}

}
