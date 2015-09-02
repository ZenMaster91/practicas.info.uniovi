package igu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;

public class VentanaConfirmación extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaConfirmación dialog = new VentanaConfirmación();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaConfirmación() {
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		setTitle("Ventana de Confirmaci\u00F3n");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBounds(0, 0, 434, 70);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(197, 58, 50, 50);
			getContentPane().add(lblNewLabel);
			lblNewLabel.setIcon(new ImageIcon(VentanaConfirmación.class.getResource("/img/ok.png")));
		}
		{
			JLabel lblFelicidades = new JLabel("Felicidades!!!");
			lblFelicidades.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblFelicidades.setBounds(178, 119, 88, 46);
			getContentPane().add(lblFelicidades);
		}
		{
			JLabel lblTuPedidoSe = new JLabel("Tu pedido se esta imprimiendo");
			lblTuPedidoSe.setAlignmentX(Component.CENTER_ALIGNMENT);
			lblTuPedidoSe.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblTuPedidoSe.setBounds(150, 156, 144, 14);
			getContentPane().add(lblTuPedidoSe);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("999/99-A");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_1.setBounds(181, 175, 82, 46);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblLocalizadorDePedido = new JLabel("Localizador de pedido");
			lblLocalizadorDePedido.setFont(new Font("Tahoma", Font.ITALIC, 10));
			lblLocalizadorDePedido.setBounds(157, 217, 144, 14);
			getContentPane().add(lblLocalizadorDePedido);
		}
		{
			JButton btnFinalizar = new JButton("Finalizar");
			btnFinalizar.setBounds(155, 232, 133, 29);
			getContentPane().add(btnFinalizar);
		}
	}

}
