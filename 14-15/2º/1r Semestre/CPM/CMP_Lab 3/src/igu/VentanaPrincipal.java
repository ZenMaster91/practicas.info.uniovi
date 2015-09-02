package igu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel lblLogo;
	private JLabel lblArticulos;
	private JComboBox artCombo;
	private JLabel lblAccesorios;
	private JLabel lblUnidades;
	private JTextField txtUnidades;
	private JButton plusbut;
	private JLabel lblPrecioPedido;
	private JTextField txtPrecioPedido;
	private JButton btnSiguiente;
	private JButton btnCancelar;
	private VentanaRegistro ventanaRegistro = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/img/logo.jpg")));
		setTitle("Venta de Accesorios de Ordenador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 354);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblLogo());
		contentPane.add(getLblArticulos());
		contentPane.add(getArtCombo());
		contentPane.add(getLblAccesorios());
		contentPane.add(getLblUnidades());
		contentPane.add(getTxtUnidades());
		contentPane.add(getPlusbut());
		contentPane.add(getLblPrecioPedido());
		contentPane.add(getTxtPrecioPedido());
		contentPane.add(getBtnSiguiente());
		contentPane.add(getBtnCancelar());
	}
	private JLabel getLblLogo() {
		if (lblLogo == null) {
			lblLogo = new JLabel("");
			lblLogo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/logo.jpg")));
			lblLogo.setBounds(10, 11, 159, 144);
		}
		return lblLogo;
	}
	private JLabel getLblArticulos() {
		if (lblArticulos == null) {
			lblArticulos = new JLabel("Art\u00EDculos:");
			lblArticulos.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblArticulos.setBounds(10, 188, 129, 14);
		}
		return lblArticulos;
	}
	private JComboBox getArtCombo() {
		if (artCombo == null) {
			artCombo = new JComboBox();
			artCombo.setBounds(10, 201, 239, 20);
		}
		return artCombo;
	}
	private JLabel getLblAccesorios() {
		if (lblAccesorios == null) {
			lblAccesorios = new JLabel("PC-ACCESORIOS");
			lblAccesorios.setFont(new Font("Arial", Font.BOLD, 18));
			lblAccesorios.setBounds(251, 45, 159, 58);
		}
		return lblAccesorios;
	}
	private JLabel getLblUnidades() {
		if (lblUnidades == null) {
			lblUnidades = new JLabel("Unidades");
			lblUnidades.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblUnidades.setBounds(360, 168, 112, 14);
		}
		return lblUnidades;
	}
	private JTextField getTxtUnidades() {
		if (txtUnidades == null) {
			txtUnidades = new JTextField();
			txtUnidades.setBounds(360, 183, 39, 24);
			txtUnidades.setColumns(10);
		}
		return txtUnidades;
	}
	private JButton getPlusbut() {
		if (plusbut == null) {
			plusbut = new JButton("+");
			plusbut.setFont(new Font("Tahoma", Font.BOLD, 14));
			plusbut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			plusbut.setBounds(426, 182, 46, 22);
		}
		return plusbut;
	}
	private JLabel getLblPrecioPedido() {
		if (lblPrecioPedido == null) {
			lblPrecioPedido = new JLabel("Precio Pedido:");
			lblPrecioPedido.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblPrecioPedido.setBounds(360, 227, 112, 14);
		}
		return lblPrecioPedido;
	}
	private JTextField getTxtPrecioPedido() {
		if (txtPrecioPedido == null) {
			txtPrecioPedido = new JTextField();
			txtPrecioPedido.setBounds(360, 240, 112, 20);
			txtPrecioPedido.setColumns(10);
		}
		return txtPrecioPedido;
	}
	private JButton getBtnSiguiente() {
		if (btnSiguiente == null) {
			btnSiguiente = new JButton("Siguiente");
			btnSiguiente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					mostrarVentanaRegistro();
				}
			});
			btnSiguiente.setBounds(280, 282, 89, 23);
		}
		return btnSiguiente;
	}
	
	private void mostrarVentanaRegistro()
	{
		ventanaRegistro = new VentanaRegistro();
		ventanaRegistro.setLocationRelativeTo(this);
		ventanaRegistro.setModal(true);
		ventanaRegistro.setVisible(true);
	}
	
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(383, 282, 89, 23);
		}
		return btnCancelar;
	}
}
