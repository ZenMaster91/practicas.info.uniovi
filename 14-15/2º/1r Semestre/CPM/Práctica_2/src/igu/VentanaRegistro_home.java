package igu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Panel;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class VentanaRegistro_home extends JFrame {
	public VentanaRegistro_home() {
	}

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtName;
	private JTextField txtSurname;
	private JButton btnCancelar;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro_home frame = new VentanaRegistro_home();
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
	public VentanaRegistro_home() {
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
		lblNombre.setBounds(20, 25, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(257, 25, 46, 14);
		contentPane.add(lblApellidos);
		
		txtName = new JTextField();
		txtName.setBounds(63, 22, 144, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtSurname = new JTextField();
		txtSurname.setBounds(306, 22, 210, 20);
		contentPane.add(txtSurname);
		txtSurname.setColumns(10);
		contentPane.add(getBtnCancelar());
		contentPane.add(getPanel());
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
