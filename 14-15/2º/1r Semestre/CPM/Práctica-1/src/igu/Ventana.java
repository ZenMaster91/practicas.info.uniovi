package igu;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	private JPanel panelPrincipal = null;
	private JButton btAceptar = null;
	
	private static final long serialVersionUID = 1L;

	public Ventana() throws HeadlessException {
		this.initialize();
	}

	private void initialize()
	{
		this.setSize(400, 300);
		this.setTitle("My First Window"); 
		this.setLocationRelativeTo(null);
		
		panelPrincipal = new JPanel();
		this.setContentPane(panelPrincipal);
		panelPrincipal.setBackground(Color.WHITE);
		panelPrincipal.setLayout(null);
		
		btAceptar = new JButton();
		btAceptar.setBounds(170, 220, 100, 30);
		btAceptar.setText("Aceptar");
		
		panelPrincipal.add(btAceptar);
	}
	
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
	}

}
