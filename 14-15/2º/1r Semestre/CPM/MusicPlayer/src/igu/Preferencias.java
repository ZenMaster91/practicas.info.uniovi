package igu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;

import java.awt.Label;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import net.miginfocom.swing.MigLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Component;

import javax.swing.BoxLayout;

import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;

public class Preferencias extends JDialog {
	private JPanel pAppearence;
	private JPanel pLanguage;
	private Label label;
	
	private VentanaPrincipalM ventanaPrincipal;
	private JComboBox comboBox;
	private JPanel panel;
	private JButton btnAplicar;
	private JButton btnCancelar;
	private JLabel lblChangeColorButtons;
	private JCheckBox checkBox1;
	private List themes;
	private  final static String THEME1="org.jvnet.substance.skin.RavenSkin",THEME2="org.jvnet.substance.skin.AutumnLookAndFeel";
	private Label label_1;
	
	
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			Preferencias dialog = new Preferencias();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public Preferencias(VentanaPrincipalM ventanaPrincipal) {
		setResizable(false);
		this.ventanaPrincipal=ventanaPrincipal;
		
		setTitle("Preferences");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Preferencias.class.getResource("/img/LogoTitulored.PNG")));
		setBounds(100, 100, 541, 356);
		setLocationRelativeTo(ventanaPrincipal);
		{
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			getContentPane().add(tabbedPane, BorderLayout.CENTER);
			tabbedPane.addTab("Appearence", new ImageIcon(Preferencias.class.getResource("/img/paint-icon.png")), getPAppearence(), null);
			tabbedPane.addTab("Languages", new ImageIcon(Preferencias.class.getResource("/img/Microsoft-Language-icon.png")), getPLanguage(), null);
		}
		getContentPane().add(getPanel(), BorderLayout.SOUTH);
	}
	
	public VentanaPrincipalM getVentanaPrincipal() {
		return ventanaPrincipal;
	}
	
	private JPanel getPAppearence() {
		if (pAppearence == null) {
			pAppearence = new JPanel();
			pAppearence.setLayout(new MigLayout("", "[][][grow]", "[][][][]"));
			pAppearence.add(getLabel(), "cell 1 1");
			pAppearence.add(getComboBox(), "cell 2 1,growx");
			pAppearence.add(getLblChangeColorButtons(), "cell 1 2");
			pAppearence.add(getCheckBox1(), "cell 2 2");
		}
		return pAppearence;
	}
	private JPanel getPLanguage() {
		if (pLanguage == null) {
			pLanguage = new JPanel();
			pLanguage.add(getLabel_1());
		}
		return pLanguage;
	}
	private Label getLabel() {
		if (label == null) {
			label = new Label("Color:");
		}
		return label;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"white", "red", "blue", "green", "pink"}));
		}
		return comboBox;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel.add(getBtnAplicar());
			panel.add(getBtnCancelar());
		}
		return panel;
	}
	private JButton getBtnAplicar() {
		if (btnAplicar == null) {
			btnAplicar = new JButton("Aplicar");
			btnAplicar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ventanaPrincipal.changeColors((String) comboBox.getSelectedItem(),checkBox1.isSelected());
					
				}
			});
		}
		return btnAplicar;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
		}
		return btnCancelar;
	}
	private JLabel getLblChangeColorButtons() {
		if (lblChangeColorButtons == null) {
			lblChangeColorButtons = new JLabel("Change color buttons:");
		}
		return lblChangeColorButtons;
	}
	private JCheckBox getCheckBox1() {
		if (checkBox1 == null) {
			checkBox1 = new JCheckBox("");
		}
		return checkBox1;
	}
	private Label getLabel_1() {
		if (label_1 == null) {
			label_1 = new Label("Under Development ");
		}
		return label_1;
	}
}
