package igu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Panel;
import javax.swing.JPasswordField;

public class VentanaRegistro_new extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtSurname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro_new frame = new VentanaRegistro_new();
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
	public VentanaRegistro_new() {
		setSize(new Dimension(600, 300));
		setTitle("Ventana de Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(11, 36, 76, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(251, 36, 86, 14);
		contentPane.add(lblApellidos);
		contentPane.add(getBtnCancelar());
		contentPane.add(getPanel());
		
		txtName = new JTextField();
		txtName.setBounds(79, 29, 160, 28);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtSurname = new JTextField();
		txtSurname.setBounds(323, 29, 271, 28);
		contentPane.add(txtSurname);
		txtSurname.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setName("");
		panel.setBounds(11, 80, 228, 33);
		contentPane.add(panel);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		panel.add(rdbtnMujer);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		panel.add(rdbtnHombre);
	}
	
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnCancelar.setForeground(new Color(51, 153, 255));
			btnCancelar.setBackground(Color.WHITE);
			btnCancelar.setBounds(414, 218, 102, 33);
		}
		return btnCancelar;
	}
	
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBorder(new TitledBorder(null, "G\u00E9nero", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(20, 53, 187, 73);
			panel.setLayout(null);
			
			JRadioButton rdbtnHombre = new JRadioButton("Hombre");
			rdbtnHombre.setBounds(6, 31, 81, 23);
			panel.add(rdbtnHombre);
			rdbtnHombre.setAlignmentX(Component.CENTER_ALIGNMENT);
			rdbtnHombre.setBackground(Color.WHITE);
			
			JRadioButton rdbtnMujer = new JRadioButton("Mujer");
			rdbtnMujer.setBounds(89, 31, 75, 23);
			panel.add(rdbtnMujer);
			rdbtnMujer.setAlignmentX(Component.CENTER_ALIGNMENT);
			rdbtnMujer.setBackground(Color.WHITE);
		}
		return panel;
	}
}
