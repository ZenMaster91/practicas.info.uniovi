package igu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.SystemColor;

public class VentanaRegistro extends JDialog { //you only can have one JFrame , we have to use JDialog instead of JFrame

	
	
	private static final long serialVersionUID = 6505848760664246644L;
	private JPanel contentPane;
	private JTextField txNombre;
	private JTextField txSurname;
	private JButton btnCancelar;
	private JPanel panel;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JPanel panel_1;
	private JLabel lblUsuarioemail;
	private JTextField txEmail;
	private JButton btnSiguiente;
	private JLabel lblNewLabel;
	private JLabel lblReintroduzcaPassword;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblMensaje;
	private VentanaConfirmacion ventanaConfirmacion=null;
	private JPanel panel_2;
	private JComboBox cBdias;
	private JComboBox cByears;
	private JComboBox cbYears;
	private JComboBox cBmeses;
	private VentanaPrincipal ventanaPrincipal;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {  dejo de ser la ventana principal asi q como solo debe haber un JFrame y esta en la ventana principal
		EventQueue.invokeLater(new Runnable() {	, este ahora pasa ser un JDialog
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
	public VentanaRegistro(VentanaPrincipal ventanaPrincipal) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaRegistro.class.getResource("/img/logo.jpg")));
		
		this.ventanaPrincipal = ventanaPrincipal ;
		// ir a windowBuilder Swing y cambiar a lazy para q lo agrupe por metodos 
		setTitle("Ventana Registro");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 623, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(23, 17, 62, 14);
		contentPane.add(lblNombre);
		
		txNombre = new JTextField();
		txNombre.setBounds(97, 14, 122, 20);
		contentPane.add(txNombre);
		txNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(276, 17, 61, 14);
		contentPane.add(lblApellidos);
		
		txSurname = new JTextField();
		txSurname.setBounds(349, 14, 187, 20);
		contentPane.add(txSurname);
		txSurname.setColumns(10);
		contentPane.add(getBtnCancelar());
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getBtnSiguiente());
		contentPane.add(getLblMensaje());
		contentPane.add(getPanel_2());
	}
	public VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			btnCancelar.setBounds(504, 217, 89, 23);
		}
		return btnCancelar;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "G\u00E9nero:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(23, 55, 200, 68);
			panel.setLayout(null);
			panel.add(getRdbtnHombre());
			panel.add(getRadioButton_1());
		}
		return panel;
	}
	private JRadioButton getRdbtnHombre() {
		if (rdbtnHombre == null) {
			rdbtnHombre = new JRadioButton("Hombre");
			buttonGroup.add(rdbtnHombre);
			rdbtnHombre.setBounds(32, 27, 83, 23);
		}
		return rdbtnHombre;
	}
	private JRadioButton getRadioButton_1() {
		if (rdbtnMujer == null) {
			rdbtnMujer = new JRadioButton("Mujer");
			rdbtnMujer.setSelected(true);
			buttonGroup.add(rdbtnMujer);
			rdbtnMujer.setBounds(117, 27, 77, 23);
		}
		return rdbtnMujer;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(23, 136, 337, 104);
			panel_1.setBorder(new TitledBorder(null, "Datos de Registro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setLayout(null);
			panel_1.add(getLblUsuarioemail());
			panel_1.add(getTxEmail());
			panel_1.add(getLblNewLabel());
			panel_1.add(getLblReintroduzcaPassword());
			panel_1.add(getPasswordField());
			panel_1.add(getPasswordField_1());
		}
		return panel_1;
	}
	private JLabel getLblUsuarioemail() {
		if (lblUsuarioemail == null) {
			lblUsuarioemail = new JLabel("Usuario(email) :");
			lblUsuarioemail.setBounds(10, 20, 92, 16);
		}
		return lblUsuarioemail;
	}
	private JTextField getTxEmail() {
		if (txEmail == null) {
			txEmail = new JTextField();
			txEmail.setBounds(159, 19, 166, 18);
			txEmail.setColumns(10);
		}
		return txEmail;
	}
	private JButton getBtnSiguiente() {
		if (btnSiguiente == null) {
			btnSiguiente = new JButton("Siguiente");
			btnSiguiente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					//why this is so crappy ???, i mean there are other methods that java the name is... , and they return true or false to , so , or they "lie" sending a false when is true or what they do to solve this ?
					if ( ( isVoid(txNombre,"tiene que introducir su nombre")==false && isVoid(txSurname,"tiene que introducir sus apellidos") ==false 
							&& isVoid(txEmail,"tiene que introducir su email")==false && isVoid(passwordField,"tiene que introducir su contraseña")==false
							&& isVoid(passwordField_1,"tiene que reintroducir su contraseña")==false ) &&
							isTheSamePassword2(getPasswordField(),getPasswordField_1())==true ){
						mostrarConfirmacion();
						//}
						//else
						//btnSiguiente.disable(); this is okey?

					}
				}
			}

					);  

			btnSiguiente.setBounds(384, 216, 97, 25);
		}
		return btnSiguiente;
	}

	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password:");
			lblNewLabel.setBounds(12, 47, 76, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblReintroduzcaPassword() {
		if (lblReintroduzcaPassword == null) {
			lblReintroduzcaPassword = new JLabel("Reintroduzca Password:");
			lblReintroduzcaPassword.setBounds(12, 74, 141, 16);
		}
		return lblReintroduzcaPassword;
	}
	
	private boolean isTheSamePassword (JPasswordField pass1 , JPasswordField pass2){

		if(String.valueOf(pass1.getPassword()).equals(String.valueOf(pass2.getPassword()))  ){
			return true;
		}

		else{
			JOptionPane.showMessageDialog(null, "las contraseñas no coinciden o su contraseña esta vacia");
			return false;
		}

	}
	
	
	private boolean isTheSamePassword2 (JPasswordField pass1 , JPasswordField pass2){

		if(new String(pass1.getPassword()).equals(new String(pass2.getPassword()))  ){
			return true;
		}

		else{
			JOptionPane.showMessageDialog(null, "las contraseñas no coinciden o su contraseña esta vacia");
			return false;
		}

	}
	
	
	
		/**
		 * check if the TextField is empty , if is empty returns false
		 * @param text this will be the JTextField to be checked 
		 * @return boolean
		 */
		private boolean isVoid(JTextField text){
			
			if (text.getText().length()==0){
				
				return true;
				}
			return false;
		}
		
		/** OverCharge
		 * check if the TextField is empty , if is empty returns false and a message
		 * @param text this will be the JTextField to be checked 
		 * @param message this will be the message that will be show in case of empty 
		 * @return boolean
		 */
		private boolean isVoid(JTextField text,String message){
			
			if (text.getText().length()==0){
				lblMensaje.setText(message); 
				return true ;  //to make this more generic yet , what kind of parameter i should use to be able to edit other elements that need this use 
				}
			return false;
		}
	
		/** OverCharge
		 * check if the TextField is empty , if is empty returns false and a POP message
		 * @param text this will be the JTextField to be checked 
		 * @param message this will be the message that will be show in case of empty 
		 * @return boolean
		 */
		private boolean isVoidPop(JTextField text,String message){
			
			if (text.getText().length()==0){
				JOptionPane.showMessageDialog(null, message);
				return true;
				}
			return false;
		}
		
		
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(159, 46, 166, 18);
		}
		return passwordField;
	}
	private JPasswordField getPasswordField_1() {
		if (passwordField_1 == null) {
			passwordField_1 = new JPasswordField();
			passwordField_1.setBounds(159, 72, 166, 18);
		}
		return passwordField_1;
	}
	private JLabel getLblMensaje() {
		if (lblMensaje == null) {
			lblMensaje = new JLabel("");
			lblMensaje.setBounds(374, 149, 231, 50);
		}
		return lblMensaje;
	}
	

	private void mostrarConfirmacion(){
		
		ventanaConfirmacion = new VentanaConfirmacion(this);
		ventanaConfirmacion.setLocationRelativeTo(this);//this is to create in the middle of the screen 
		ventanaConfirmacion.setModal(true);
		ventanaConfirmacion.setVisible(true);
		
	}

	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "Fecha de Nacimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(299, 66, 294, 57);
			panel_2.setLayout(null);
			panel_2.add(getCBdias());
			panel_2.add(getCbyears());
			panel_2.add(getCBmeses());
		}
		return panel_2;
	}
	
	private JComboBox getCBdias() {
		if (cBdias == null) {
			cBdias = new JComboBox();
				for (int i= 1 ; i<=31;i++){
					cBdias.addItem(i);
										}		
			cBdias.setBounds(12, 24, 50, 22);
		}
		return cBdias;
	}	
	
	
	
	private JComboBox getCbyears() {
		if (cByears == null) {
			cByears = new JComboBox();
			for (int i= 2014 ; i>=1950;i--){
				cByears.addItem(i);

			}
			cByears.setBounds(183, 24, 99, 22);
		}
		return cByears;
		}
	
	private JComboBox getCBmeses() {
		if (cBmeses == null) {
			cBmeses = new JComboBox();
			cBmeses.setModel(new DefaultComboBoxModel(new String[] {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"}));
			cBmeses.setBounds(74, 24, 97, 22);
		}
		return cBmeses;
	}
}