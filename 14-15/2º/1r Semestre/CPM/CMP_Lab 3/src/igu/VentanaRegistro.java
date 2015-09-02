package igu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.TitledBorder;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;

import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.time.Month;
import java.time.DayOfWeek;
import javax.swing.UIManager;

public class VentanaRegistro extends JDialog {

	private JPanel contentPane;
	private JLabel lBlApellidos;
	private JTextField txNombre;
	private JTextField txApellidos;
	private JButton btnCancelar;
	private JPanel paneSexo;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JTextField txUsuario;
	private JPasswordField passField1;
	private JPasswordField passField2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JLabel lblWar = new JLabel("");

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro frame = new VentanaRegistro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public VentanaRegistro() {
		setResizable(false);
		setTitle("Registro de Usuario");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 520, 336);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(21, 38, 65, 14);
		contentPane.add(lblNombre);
		contentPane.add(getLBlApellidos());
		contentPane.add(getTxNombre());
		contentPane.add(getTxApellidos());
		contentPane.add(getBtnCancelar());
		contentPane.add(getPaneSexo());
		
		JPanel paneFechaNacimiento = new JPanel();
		paneFechaNacimiento.setBorder(new TitledBorder(null, "Fecha de nacimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		paneFechaNacimiento.setBackground(SystemColor.control);
		paneFechaNacimiento.setBounds(234, 63, 246, 61);
		contentPane.add(paneFechaNacimiento);
		paneFechaNacimiento.setLayout(null);
		
		JComboBox comBoxDay = new JComboBox();
		comBoxDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comBoxDay.setMaximumRowCount(5);
		comBoxDay.setBounds(10, 30, 49, 20);
		paneFechaNacimiento.add(comBoxDay);
		
		JComboBox comBoxMes = new JComboBox();
		comBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		comBoxMes.setMaximumRowCount(5);
		comBoxMes.setBounds(69, 30, 94, 20);
		paneFechaNacimiento.add(comBoxMes);
		
		JComboBox comBoxAño = new JComboBox();
		comBoxAño.setMaximumRowCount(5);
		comBoxAño.setBounds(173, 30, 63, 20);
		paneFechaNacimiento.add(comBoxAño);
		
		JPanel paneDatosRegistro = new JPanel();
		paneDatosRegistro.setBackground(SystemColor.control);
		paneDatosRegistro.setForeground(new Color(0, 0, 0));
		paneDatosRegistro.setBorder(new TitledBorder(null, "Datos de registro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		paneDatosRegistro.setBounds(21, 135, 374, 126);
		contentPane.add(paneDatosRegistro);
		paneDatosRegistro.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario (email):");
		lblUsuario.setBounds(10, 13, 125, 24);
		paneDatosRegistro.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 50, 125, 24);
		paneDatosRegistro.add(lblPassword);
		
		JLabel lblReintroducirPassword = new JLabel("Reintroduzca password:");
		lblReintroducirPassword.setBounds(10, 87, 155, 24);
		paneDatosRegistro.add(lblReintroducirPassword);
		
		txUsuario = new JTextField();
		txUsuario.setBounds(175, 15, 189, 20);
		paneDatosRegistro.add(txUsuario);
		txUsuario.setColumns(10);
		paneDatosRegistro.add(getPassField1());
		paneDatosRegistro.add(getPassField2());
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txNombre.getText().length() == 0)
				{
					lblWar.setText("El nombre es obligatorio");
				} else {
					lblWar.setText("");	
					if( (new String(passField1.getPassword()).equals(new String(passField2.getPassword()))))
					{
						lblWar.setText("");	
					} else {lblWar.setText("Las contraseñas no coinciden");}
				}
			}
		});
		btnSiguiente.setBounds(306, 263, 89, 23);
		contentPane.add(btnSiguiente);
		
		
		lblWar.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		lblWar.setBounds(21, 267, 278, 30);
		contentPane.add(lblWar);
	}
	private JLabel getLBlApellidos() {
		if (lBlApellidos == null) {
			lBlApellidos = new JLabel("Apellidos:");
			lBlApellidos.setBounds(234, 38, 65, 14);
		}
		return lBlApellidos;
	}
	private JTextField getTxNombre() {
		if (txNombre == null) {
			txNombre = new JTextField();
			txNombre.setBounds(73, 37, 140, 17);
			txNombre.setColumns(10);
		}
		return txNombre;
	}
	private JTextField getTxApellidos() {
		if (txApellidos == null) {
			txApellidos = new JTextField();
			txApellidos.setBounds(290, 37, 190, 17);
			txApellidos.setColumns(10);
		}
		return txApellidos;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//txApellidos.setText(txApellidos.getText() + " :D ");
					System.exit(0);
					
				}
			});
			btnCancelar.setBounds(405, 263, 89, 23);
		}
		return btnCancelar;
	}
	
	//private JButton getBtnSiguiente(){
		//if (txNombre.getText()==null || txApellidos.getText()==null || txUsuario.getText() == null || txPassword.getText() ==null ||
			//	txReintroducirPassword.getText()==null){
			//JOptionPane.showMessageDialog(null, "You must fill all the gaps");
		//}
		
		
		
		
		
	
	private JPanel getPaneSexo() {
		if (paneSexo == null) {
			paneSexo = new JPanel();
			paneSexo.setBorder(new TitledBorder(null, "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			paneSexo.setBackground(SystemColor.control);
			paneSexo.setBounds(21, 63, 192, 61);
			paneSexo.setLayout(null);
			paneSexo.add(getRdbtnHombre());
			paneSexo.add(getRdbtnMujer());
		}
		return paneSexo;
	}
	private JRadioButton getRdbtnHombre() {
		if (rdbtnHombre == null) {
			rdbtnHombre = new JRadioButton("Hombre");
			buttonGroup.add(rdbtnHombre);
			rdbtnHombre.setBounds(6, 30, 79, 23);
		}
		return rdbtnHombre;
	}
	private JRadioButton getRdbtnMujer() {
		if (rdbtnMujer == null) {
			rdbtnMujer = new JRadioButton("Mujer");
			rdbtnMujer.setSelected(true);
			buttonGroup.add(rdbtnMujer);
			rdbtnMujer.setBounds(92, 31, 86, 20);
		}
		return rdbtnMujer;
	}
	private JPasswordField getPassField1() {
		if (passField1 == null) {
			passField1 = new JPasswordField();
			passField1.setBounds(175, 51, 189, 22);
		}
		return passField1;
	}
	private JPasswordField getPassField2() {
		if (passField2 == null) {
			passField2 = new JPasswordField();
			passField2.setBounds(175, 88, 189, 22);
		}
		return passField2;
	}
}
