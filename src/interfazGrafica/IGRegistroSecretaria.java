package interfazGrafica;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.xml.ws.handler.MessageContext;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IGRegistroSecretaria extends JPanel {
	private JTextField txtAdministrador;
	private JTextField txtTitulo;
	private JTextField txtNombreSecretaria;
	private JTextField txtCc;
	

	/**
	 * Create the panel.
	 */
	public IGRegistroSecretaria() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		add(panel);
		panel.setLayout(null);
		
		JComboBox cbServicios = new JComboBox();
		cbServicios.setModel(new DefaultComboBoxModel(new String[] {"Agregar Secretaria", "Eliminar Secretaria", "Edita Secretaria"}));
		cbServicios.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		cbServicios.setBounds(15, 64, 181, 26);
		panel.add(cbServicios);
		
		txtAdministrador = new JTextField();
		txtAdministrador.setEditable(false);
		txtAdministrador.setText("Administrador");
		txtAdministrador.setBounds(211, 64, 224, 26);
		panel.add(txtAdministrador);
		txtAdministrador.setColumns(10);
		
		txtTitulo = new JTextField();
		txtTitulo.setEditable(false);
		txtTitulo.setBackground(Color.RED);
		txtTitulo.setText("\tCONSEJO DE FACULTAD");
		txtTitulo.setBounds(15, 16, 420, 44);
		panel.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		txtNombreSecretaria = new JTextField();
		txtNombreSecretaria.setText("NOMBRE SECRETARIA");
		txtNombreSecretaria.setBounds(15, 114, 181, 26);
		panel.add(txtNombreSecretaria);
		txtNombreSecretaria.setColumns(10);
		
		txtCc = new JTextField();
		txtCc.setText("C.C");
		txtCc.setBounds(233, 114, 146, 26);
		panel.add(txtCc);
		txtCc.setColumns(10);
		
		JButton btnNewButton = new JButton("AGREGAR ");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String cedula = txtCc.getText().toString();
				String nombre = txtNombreSecretaria.getText().toString();
				txtCc.setText("");
				txtNombreSecretaria.setText("");
				System.out.println("Secretaria agregada con exito");
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(146, 232, 146, 29);
		panel.add(btnNewButton);
		
		JComboBox cbProgramas = new JComboBox();
		cbProgramas.setModel(new DefaultComboBoxModel(new String[] {"INGENIERIA DE SISTEMAS", "INGENIERIA CIVIL", "INGENIERIA FINANCIERA", "INGENIERIA INDUSTRIAL", "INGENIERIA AMBIENTAL"}));
		cbProgramas.setBackground(Color.WHITE);
		cbProgramas.setBounds(15, 167, 364, 26);
		panel.add(cbProgramas);

	}
}
