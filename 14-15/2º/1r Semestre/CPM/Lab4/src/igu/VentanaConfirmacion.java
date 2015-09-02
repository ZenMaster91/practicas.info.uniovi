package igu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaConfirmacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lbCode;
	private String code="";
	private VentanaRegistro ventanaRegistro;
	private VentanaPrincipal ventanaPrincipal;
	
	
	private String generarCodigo(){
		String codigo="";
		String base="1234567890zxcvbnmasdfghjklñqwertyuiopZXCVBNMASDFGHJKLÑQWERTYUIOP";
		int longitud =10;
		
		for (int i =0 ; i < longitud ;i++){
			int numero=(int)(Math.random()*(base.length()));
			codigo += base.substring(numero,numero+1);
		}
			return codigo;
	}

	

	/**
	 * Create the dialog.
	 */
	public VentanaConfirmacion(VentanaRegistro ventanaRegistro2) {
		setResizable(false); //now ventanaConfirmacion has a reference of VentanaRegistro
		this.ventanaRegistro = ventanaRegistro2;
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaConfirmacion.class.getResource("/img/logo.jpg")));
		setTitle("Confirmacion");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(VentanaConfirmacion.class.getResource("/img/ok.png")));
			lblNewLabel.setBounds(38, 30, 54, 56);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblMensaje = new JLabel("Su pedido a sido realizado con exito ");
			lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblMensaje.setBounds(121, 30, 279, 50);
			contentPanel.add(lblMensaje);
		}
		{
			JLabel lblSuCodigoEs = new JLabel("Su codigo es :");
			lblSuCodigoEs.setBounds(56, 129, 67, 35);
			contentPanel.add(lblSuCodigoEs);
		}
		{
			JButton btnConfirmar = new JButton("Finalizar");
			btnConfirmar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ventanaRegistro.dispose();
					dispose();
					//VentanaPrincipal.hide();
					ventanaPrincipal.main(new String[0]);
					
				}
			});
			btnConfirmar.setBounds(295, 217, 105, 23);
			contentPanel.add(btnConfirmar);
		}
		contentPanel.add(getLbCode());
		
		
		code=this.generarCodigo();
		lbCode.setText(code);
		ventanaRegistro.getVentanaPrincipal().getPedido().grabarPedido(code);
	}
	private JLabel getLbCode() {
		if (lbCode == null) {
			lbCode = new JLabel("");
			lbCode.setBounds(152, 139, 228, 14);
		}
		return lbCode;
	}
}
