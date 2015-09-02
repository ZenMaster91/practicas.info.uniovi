package igu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Toolkit;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logica.Articulo;
import logica.Catalogo;
import logica.Pedido;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.SwingConstants;

import org.jvnet.substance.SubstanceLookAndFeel;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel lblLogo;
	private JLabel lblPcAccesorios;
	private JLabel lblArticulos;
	private JLabel lblUnidades;
	private JLabel lblPrecioPedido;
	private JComboBox cBArticulos;
	private JButton btPlus;
	private JTextField tFUnidades;
	private JTextField tFPrecioFinal;
	private JButton btnCancelar;
	private JButton btnSiguiente;
	private VentanaRegistro ventanaRegistro = null;
	
	private Pedido pedido = null;
	private Catalogo catalogo = null;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame.setDefaultLookAndFeelDecorated(true);
					JDialog.setDefaultLookAndFeelDecorated(true);
					SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeBlue2007Skin");
					
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setLocationRelativeTo(null);//this change the open location to the middle 
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
	public VentanaPrincipal() {
		setResizable(false);
		pedido = new Pedido();
		catalogo = new Catalogo();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/img/logo.jpg")));
		setTitle("Venta de Accesorios de Ordenador ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 395);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblLogo());
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getLabel_3());
		contentPane.add(getLabel_4());
		contentPane.add(getCBArticulos());
		contentPane.add(getBtPlus());
		contentPane.add(getTFUnidades());
		contentPane.add(getTFPrecioFinal());
		contentPane.add(getBtnCancelar());
		contentPane.add(getBtnSiguiente());
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Integer.parseInt(tFUnidades.getText().length()) > 0){
					
					Articulo articuloSeleccionado = (Articulo) cBArticulos.getSelectedItem();
					Integer unidades = Integer.parseInt(tFUnidades.getText());
					pedido.sub(articuloSeleccionado, unidades-1);		//the comboBox no devuelve un string devuelve la instancia de ese objeto (en este caso )
					Float precioFinal = pedido.calcularTotalSinIva();
					tFPrecioFinal.setText(String.valueOf(precioFinal)+ "\u20AC");  //u20AC is to show the € symbol , you can put use directly € in the String but is better in this way 
					if(!btnSiguiente.isEnabled() )
					{
						btnSiguiente.setEnabled(true);
					}
				}
				else{
					tFUnidades.grabFocus();
				}
			}
		});
		button.setBounds(529, 201, 41, 23);
		contentPane.add(button);
		
	}
	private JLabel getLblLogo() {
		if (lblLogo == null) {
			lblLogo = new JLabel("");
			lblLogo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/logo.jpg")));
			lblLogo.setBounds(27, 11, 158, 147);
		}
		return lblLogo;
	}
	private JLabel getLabel_1() {
		if (lblPcAccesorios == null) {
			lblPcAccesorios = new JLabel("PC-ACCESORIOS");
			lblPcAccesorios.setHorizontalAlignment(SwingConstants.CENTER);
			lblPcAccesorios.setForeground(new Color(139, 69, 19));
			lblPcAccesorios.setFont(new Font("Tahoma", Font.BOLD, 28));
			lblPcAccesorios.setBounds(245, 59, 268, 50);
		}
		return lblPcAccesorios;
	}
	private JLabel getLabel_2() {
		if (lblArticulos == null) {
			lblArticulos = new JLabel("Articulos:");
			lblArticulos.setDisplayedMnemonic('A');
			lblArticulos.setLabelFor(getCBArticulos());
			lblArticulos.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblArticulos.setBounds(27, 159, 75, 50);
		}
		return lblArticulos;
	}
	private JLabel getLabel_3() {
		if (lblUnidades == null) {
			lblUnidades = new JLabel("Unidades:");
			lblUnidades.setToolTipText("");
			lblUnidades.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblUnidades.setBounds(382, 159, 68, 50);
		}
		return lblUnidades;
	}
	private JLabel getLabel_4() {
		if (lblPrecioPedido == null) {
			lblPrecioPedido = new JLabel("Precio Pedido:");
			lblPrecioPedido.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblPrecioPedido.setBounds(384, 235, 97, 38);
		}
		return lblPrecioPedido;
	}
	private JComboBox getCBArticulos() {
		if (cBArticulos == null) {
			cBArticulos = new JComboBox(catalogo.getArticulos()); //in this way works , but in the design mode you can see this , because in the desing mode doesn't load methods (unless that there are static methods )
			cBArticulos.setToolTipText("Relacion de articulos disponibles ");
			cBArticulos.setFont(new Font("Tahoma", Font.BOLD, 11));
			cBArticulos.setBounds(27, 192, 260, 32);
			
			
			
		/*	the other option is intead of the line commented 
		 * 
		 * for (articulo a:catalogo.getArticulos()){
		 * comboBox.addItem(a);
		 * }
		 */
		}
		return cBArticulos;
	}
	private JButton getBtPlus() {
		if (btPlus == null) {
			btPlus = new JButton("+");
			btPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(tFUnidades.getText().length()!=0){
						
						Articulo articuloSeleccionado = (Articulo) cBArticulos.getSelectedItem();
						Integer unidades = Integer.parseInt(tFUnidades.getText());
						pedido.add(articuloSeleccionado, unidades);		//the comboBox no devuelve un string devuelve la instancia de ese objeto (en este caso )
						Float precioFinal = pedido.calcularTotalSinIva();
						tFPrecioFinal.setText(String.valueOf(precioFinal)+ "\u20AC");  //u20AC is to show the € symbol , you can put use directly € in the String but is better in this way 
						if(!btnSiguiente.isEnabled() )
						{
							btnSiguiente.setEnabled(true);
						}
					}
					else{
						tFUnidades.grabFocus();
					}
				}
			});
			btPlus.setBounds(481, 201, 41, 23);
		}
		return btPlus;
	}
	private JTextField getTFUnidades() {
		if (tFUnidades == null) {
			tFUnidades = new JTextField();
			tFUnidades.setToolTipText("Unidades a comprar ");
			tFUnidades.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent arg0) {
				tFUnidades.setText("1");
				tFUnidades.selectAll();
				}
				@Override
				public void focusLost(FocusEvent arg0) {
					try{
					Integer.parseInt(tFUnidades.getText());
					}
					catch(Exception e){
						tFUnidades.setText("1");
						tFUnidades.selectAll();
					}
				}
			});
			tFUnidades.setBounds(382, 201, 97, 23);
			tFUnidades.setColumns(10);
		}
		return tFUnidades;
	}
	private JTextField getTFPrecioFinal() {
		if (tFPrecioFinal == null) {
			tFPrecioFinal = new JTextField();
			tFPrecioFinal.setEditable(false);
			tFPrecioFinal.setBounds(384, 274, 165, 32);
			tFPrecioFinal.setColumns(10);
		}
		return tFPrecioFinal;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			btnCancelar.setBounds(481, 323, 89, 23);
		}
		return btnCancelar;
	}
	private JButton getBtnSiguiente() {
		if (btnSiguiente == null) {
			btnSiguiente = new JButton("Siguiente");
			btnSiguiente.setMnemonic('S');
			btnSiguiente.setEnabled(false);
			btnSiguiente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					mostrarVentanaregistro();
				}
			});
			btnSiguiente.setBounds(382, 323, 89, 23);
		}
		return btnSiguiente;
	}
	
	private void mostrarVentanaregistro(){
		
		ventanaRegistro = new VentanaRegistro(this);
		//ventanaRegistro = new VentanaRegistro(); in that way you doesn't create a referent to the parent windows and you don't have their references 
		ventanaRegistro.setLocationRelativeTo(this);//this is to create in the middle of the screen 
		ventanaRegistro.setModal(true);
		ventanaRegistro.setVisible(true);
		
	}

	public Pedido getPedido() {
		return pedido;
	}
	
	public void hide()
	{
		dispose();
	}
}
