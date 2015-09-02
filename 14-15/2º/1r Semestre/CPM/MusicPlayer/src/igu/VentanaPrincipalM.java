package igu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import org.jvnet.substance.SubstanceLookAndFeel;

import player.MusicPlayer;
import player.MyFile;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

import javax.swing.ListSelectionModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class VentanaPrincipalM extends JFrame {

	private JPanel contentPane;
	private JPanel pnNorte;
	private JLabel logo;
	private JSlider slider;
	private JPanel pnVolumen;
	private JPanel pnCentro;
	private JLabel lblVol;
	private JPanel pnLibrary;
	private JPanel pnPlay;
	private JLabel lblLibrary;
	private JPanel pnBotonesLibrary;
	private JButton btnAdd;
	private JButton btnDelete;
	private JScrollPane scLista1;
	private JList lista1;
	private JLabel lblPlaylist;
	private JPanel pnBononesPlay;
	private JButton btnRewind;
	private JButton btnPlay;
	private JButton btnForward;
	private JScrollPane scLista2;
	private JList lista2;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnPlay;
	private JMenu mnHelp;
	private JMenu mnOptions;
	private JMenuItem mntmOpen;
	private JMenuItem mntmExit;
	private JSeparator separator;
	private JTextField txVol;

	public Font fuentePrincipal = null;

	// this is for the model of the 2 lists
	private DefaultListModel modeloLista1 = null;
	private DefaultListModel modeloLista2 = null;

	private MusicPlayer mP = new MusicPlayer();
	
	//TESTING NEW FEATURES
	private int state=STOP;
	private int antiguo=-1;
	private final static int STOP=0,PLAY=1;

	// ------------------------------------------------------------------------
	// this is for the JFile chooser
	private JFileChooser selector = null;
	private JMenuItem mntmPlayresume;
	private JMenuItem mntmRewind;
	private JMenuItem mntmForward;
	private JMenuItem mntmAcercaDe;
	private JMenuItem mntmNewMenuItem;
	
	//Under development-----------------------
	private Preferencias preferencias;
	private String theme="org.jvnet.substance.skin.RavenSkin";
	//-----------------------------------------

	public JFileChooser getSelector() {
		if (selector == null) {
			selector = new JFileChooser();
			selector.setMultiSelectionEnabled(true);
			// Esto creara un filtro para que no acepte cualquier tipo de
			// formatos
			selector.setFileFilter(new FileNameExtensionFilter("Archivos MP3",
					"mp3"));
			// Esto es para que abra por defecto la ruta de abajo
			String desktopPath = System.getProperty("user.home") + "/Music";
			selector.setCurrentDirectory(new File(desktopPath));

		}
		return selector;
	}

	// ------------------------------------------------------------------------

	private void cargarFuentes() {
		try {
			InputStream myStream = new BufferedInputStream(new FileInputStream(
					"bin/ttf/DS-DIGIB.TTF"));
			fuentePrincipal = Font.createFont(Font.TRUETYPE_FONT, myStream);

		} catch (Exception e) {
			System.out.println("No se ha podido cargar las fuentes");
		}
	}

	// ------------------------------------------------------------------------

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					// to tell that they must be prepare to be decorated
					JFrame.setDefaultLookAndFeelDecorated(true);
					JDialog.setDefaultLookAndFeelDecorated(true);

					// now we select the skin that we want
					SubstanceLookAndFeel
							.setSkin("org.jvnet.substance.skin.RavenSkin");

					VentanaPrincipalM frame = new VentanaPrincipalM();
					frame.setLocationRelativeTo(null);
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
	public VentanaPrincipalM() {
		this.cargarFuentes();
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				VentanaPrincipalM.class.getResource("/img/LogoTitulored.PNG")));
		setTitle("Ultimate Player");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 510);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPnNorte(), BorderLayout.NORTH);
		contentPane.add(getPanel_2(), BorderLayout.CENTER);

	}

	private JPanel getPnNorte() {
		if (pnNorte == null) {
			pnNorte = new JPanel();
			pnNorte.setLayout(new GridLayout(0, 3, 0, 0));
			pnNorte.add(getLogo());
			pnNorte.add(getSlider());
			pnNorte.add(getPnVolumen());
		}
		return pnNorte;
	}

	private JLabel getLogo() {
		if (logo == null) {
			logo = new JLabel("");
			logo.setIcon(new ImageIcon(VentanaPrincipalM.class.getResource("/img/Logored.PNG")));
		}
		return logo;
	}

	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					txVol.setText(String.valueOf(slider.getValue()));
					setVolume(slider.getValue());
				}
			});
			slider.setForeground(Color.RED);
			slider.setFont(new Font("Dialog", Font.BOLD, 14));
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMinorTickSpacing(10);
			slider.setMajorTickSpacing(20);
		}
		return slider;
	}

	private void setVolume(double vol) { // this method is build because the
											// mP.setVolume expects a double
											// value
		double volMax = slider.getMaximum();
		mP.setVolume(vol, volMax);
	}

	private JPanel getPnVolumen() {
		if (pnVolumen == null) {
			pnVolumen = new JPanel();
			pnVolumen.add(getLblVol());
			pnVolumen.add(getTxVol());
		}
		return pnVolumen;
	}

	private JPanel getPanel_2() {
		if (pnCentro == null) {
			pnCentro = new JPanel();
			pnCentro.setLayout(new GridLayout(1, 0, 0, 0));
			pnCentro.add(getPnLibrary());
			pnCentro.add(getPnPlay());
		}
		return pnCentro;
	}

	private JLabel getLblVol() {
		if (lblVol == null) {
			lblVol = new JLabel("Vol:");
			lblVol.setHorizontalAlignment(SwingConstants.LEFT);
			lblVol.setFont(new Font("Dialog", Font.BOLD, 26));
		}
		return lblVol;
	}

	private JPanel getPnLibrary() {
		if (pnLibrary == null) {
			pnLibrary = new JPanel();
			pnLibrary.setLayout(new BorderLayout(0, 0));
			pnLibrary.add(getLblLibrary(), BorderLayout.NORTH);
			pnLibrary.add(getPnBotonesLibrary(), BorderLayout.SOUTH);
			pnLibrary.add(getScLista1(), BorderLayout.CENTER);
		}
		return pnLibrary;
	}

	private JPanel getPnPlay() {
		if (pnPlay == null) {
			pnPlay = new JPanel();
			pnPlay.setLayout(new BorderLayout(0, 0));
			pnPlay.add(getLblPlaylist(), BorderLayout.NORTH);
			pnPlay.add(getPnBononesPlay(), BorderLayout.SOUTH);
			pnPlay.add(getScrollPane_1(), BorderLayout.CENTER);
		}
		return pnPlay;
	}

	private JLabel getLblLibrary() {
		if (lblLibrary == null) {
			lblLibrary = new JLabel("Library:");
			lblLibrary.setFont(new Font("Dialog", Font.BOLD, 18));
			// lblLibrary.setFont(this.fuentePrincipal.deriveFont(Font.PLAIN,18));
		}
		return lblLibrary;
	}

	private JPanel getPnBotonesLibrary() {
		if (pnBotonesLibrary == null) {
			pnBotonesLibrary = new JPanel();
			pnBotonesLibrary.setLayout(new GridLayout(0, 2, 0, 0));
			pnBotonesLibrary.add(getBtnAdd());
			pnBotonesLibrary.add(getBtnDelete());
		}
		return pnBotonesLibrary;
	}

	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add to PlayList");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					List<Object> seleccionados = lista1.getSelectedValuesList(); // return a list of objects , instead using List we use Object because is more generic
					
					if (seleccionados.isEmpty()) {
						int respuesta = getSelector().showOpenDialog(null);
						if (respuesta == JFileChooser.APPROVE_OPTION) {

							for (int i = 0; i < selector.getSelectedFiles().length; i++) {
								modeloLista1.addElement(new MyFile(selector.getSelectedFiles()[i]));
								
							}
					}
					
					} else {

						for (Object f : seleccionados) {
							modeloLista2.addElement(f);
							lista2.setSelectedIndex(0);
						}
					}
				}
			});
			btnAdd.setFont(new Font("Dialog", Font.BOLD, 12));
		}
		return btnAdd;
	}

	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					List<Object> seleccionados = lista1.getSelectedValuesList();
					List<Object> seleccionados2 = lista2.getSelectedValuesList();
					// return a list of objects , instead using List we use Obj because is more generic
					if(lista1.isSelectionEmpty()==true){						
						for (Object f : seleccionados2) {
							modeloLista2.removeElement(f);
							if(modeloLista2.isEmpty())
								stop();
							}
					}else					
					for (Object f : seleccionados) {
						modeloLista1.removeElement(f);
						modeloLista2.removeElement(f);
					}
				
				}
			});
			btnDelete.setFont(new Font("Dialog", Font.BOLD, 12));
		}
		return btnDelete;
	}

	private JScrollPane getScLista1() {
		if (scLista1 == null) {
			scLista1 = new JScrollPane();
			scLista1.setBorder(new LineBorder(Color.RED, 3));
			scLista1.setViewportView(getLista1());
		}
		return scLista1;
	}

	private JList getLista1() {
		if (lista1 == null) {
			// here we create the model and link it
			modeloLista1 = new DefaultListModel();
			lista1 = new JList(modeloLista1);
		}
		return lista1;
	}
	

	private JLabel getLblPlaylist() {
		if (lblPlaylist == null) {
			lblPlaylist = new JLabel("PlayList: ");
			lblPlaylist.setFont(new Font("Dialog", Font.BOLD, 18));
		}
		return lblPlaylist;
	}

	private JPanel getPnBononesPlay() {
		if (pnBononesPlay == null) {
			pnBononesPlay = new JPanel();
			pnBononesPlay.setLayout(new GridLayout(1, 0, 0, 0));
			pnBononesPlay.add(getBtnRewind());
			pnBononesPlay.add(getBtnPlay());
			pnBononesPlay.add(getBtnForward());
		}
		return pnBononesPlay;
	}

	private JButton getBtnRewind() {
		if (btnRewind == null) {
			btnRewind = new JButton("\u25C4\u25C4");
			btnRewind.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					int indiceSeleccionado = lista2.getSelectedIndex();
					
					rewind(indiceSeleccionado);
				}
			});
			btnRewind.setFont(new Font("Dialog", Font.PLAIN, 12));
		}
		return btnRewind;
	}
	
	private void rewind(int indiceSeleccionado){
		
		if (indiceSeleccionado != -1 && indiceSeleccionado == 0) {
			int n =modeloLista2.getSize();
			lista2.setSelectedIndex(indiceSeleccionado + n-1 ); //si pongo un numero solo si va , si pongo un parametro que devuelve un int no , PORQUE??
			mP.play( ((MyFile) lista2.getSelectedValue()).getFile());
		}else
		if (indiceSeleccionado != -1 && indiceSeleccionado != 0) {
			lista2.setSelectedIndex(indiceSeleccionado - 1);
			mP.play(((MyFile) lista2.getSelectedValue()).getFile());
		}
	}

	private JButton getBtnPlay() {
		if (btnPlay == null) {
			btnPlay = new JButton("\u25BA");
			btnPlay.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lista1.clearSelection();
					int indiceSeleccionado = lista2.getSelectedIndex();					
					playStop(indiceSeleccionado);
					
				}
			});
			btnPlay.setFont(new Font("Dialog", Font.PLAIN, 12));
		}
		return btnPlay;
	}
	
	private void playStop(int indiceSeleccionado){
		switch (state) {
		case STOP:
			if(indiceSeleccionado==antiguo){
				mP.resume();
				state=PLAY;
				break;
			}else
			if (indiceSeleccionado != -1 ) {
				mP.play(((MyFile) lista2.getSelectedValue()).getFile());
				state=PLAY;
				antiguo=indiceSeleccionado;
				break;
			}
			break;
			
		case PLAY:
			
			if(antiguo!=indiceSeleccionado){
				state=STOP;
				break;
			}
			
			else
			{	mP.pause();
				state=0;
				break;
			}
		
		default:
			System.out.println("ERROR RESUME");
			break;
		}
	}
	
	private void stop(){
		mP.stop();
	}
	
	/*switch (state) {
					case STOP:
						if(indiceSeleccionado==antiguo){
							mP.resume();
							state=PLAY;
							break;
						}else
						if (indiceSeleccionado != -1 ) {
							mP.play(((MyFile) lista2.getSelectedValue()).getFile());
							state=PLAY;
							antiguo=indiceSeleccionado;
							break;
						}
						break;
						
					case PLAY:
						
						if(antiguo!=indiceSeleccionado){
							state=STOP;
							break;
						}
						
						else
						{	mP.pause();
							state=0;
							break;
						}
					
					default:
						System.out.println("ERROR RESUME");
						break;
					}
	}*/

	private JButton getBtnForward() {
		if (btnForward == null) {
			btnForward = new JButton("\u25BA\u25BA");
			btnForward.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int indiceSeleccionado = lista2.getSelectedIndex();
					forward( indiceSeleccionado);
				}
			});
			btnForward.setFont(new Font("Dialog", Font.PLAIN, 12));
		}
		return btnForward;
	}

	private void forward(int indiceSeleccionado){
		
		if (indiceSeleccionado != -1
				&& indiceSeleccionado == (modeloLista2.size()) ){ 
			lista2.setSelectedIndex(indiceSeleccionado - modeloLista2.size()+1);
			mP.play(((MyFile) lista2.getSelectedValue()).getFile());
		}else
		
		if (indiceSeleccionado != -1
				&& indiceSeleccionado != (modeloLista2.size()-1) ){ 
			lista2.setSelectedIndex(indiceSeleccionado + 1);
			mP.play(((MyFile) lista2.getSelectedValue()).getFile());
		}
	}
	
	private JScrollPane getScrollPane_1() {
		if (scLista2 == null) {
			scLista2 = new JScrollPane();
			scLista2.setBorder(new LineBorder(Color.RED, 3));
			scLista2.setViewportView(getLista2());
		}
		return scLista2;
	}

	private JList getLista2() {
		if (lista2 == null) {
			// here we create the model and link it
			// COMMENT: the model store the data ,
			// list is just a view , the advantage that we can have more that
			// one view for every model
			modeloLista2 = new DefaultListModel();
			lista2 = new JList(modeloLista2); // inside the constructor we put
												// the model
			lista2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		return lista2;
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnPlay());
			menuBar.add(getMnOptions());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}

	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.setMnemonic('f');
			mnFile.add(getMntmOpen());
			mnFile.add(getSeparator());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}

	private JMenu getMnPlay() {
		if (mnPlay == null) {
			mnPlay = new JMenu("Play");
			mnPlay.setMnemonic('p');
			mnPlay.add(getMntmPlayresume());
			mnPlay.add(getMntmRewind());
			mnPlay.add(getMntmForward());
		}
		return mnPlay;
	}

	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.setMnemonic('H');
			mnHelp.add(getMntmAcercaDe());
		}
		return mnHelp;
	}

	private JMenu getMnOptions() {
		if (mnOptions == null) {
			mnOptions = new JMenu("Options");
			mnOptions.setMnemonic('O');
			mnOptions.add(getMntmNewMenuItem());
		}
		return mnOptions;
	}

	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open...");
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					// this is for checking when the user press cancel instead
					// choose the file , we have to control this

					int respuesta = getSelector().showOpenDialog(null);
					if (respuesta == JFileChooser.APPROVE_OPTION) {

						for (int i = 0; i < selector.getSelectedFiles().length; i++) {

							modeloLista1.addElement(new MyFile(selector
									.getSelectedFiles()[i]));

						}
					}

				}
			});
			mntmOpen.setMnemonic('n');
		}
		return mntmOpen;
	}

	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			mntmExit.setMnemonic('e');
		}
		return mntmExit;
	}

	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}

	private JTextField getTxVol() {
		if (txVol == null) {
			txVol = new JTextField();
			txVol.setFont(new Font("Dialog", Font.BOLD, 40));
			txVol.setText("50");
			txVol.setColumns(3);
		}
		return txVol;
	}
	private JMenuItem getMntmPlayresume() {
		if (mntmPlayresume == null) {
			mntmPlayresume = new JMenuItem("Play/Resume");
			mntmPlayresume.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
			mntmPlayresume.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					playStop(lista2.getSelectedIndex());
				}
			});
		}
		return mntmPlayresume;
	}
	private JMenuItem getMntmRewind() {
		if (mntmRewind == null) {
			mntmRewind = new JMenuItem("Rewind");
			mntmRewind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
			mntmRewind.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					rewind(lista2.getSelectedIndex());
				}
			});
		}
		return mntmRewind;
	}
	private JMenuItem getMntmForward() {
		if (mntmForward == null) {
			mntmForward = new JMenuItem("Forward");
			mntmForward.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
			mntmForward.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					forward(lista2.getSelectedIndex());
				}
			});
		}
		return mntmForward;
	}
	private JMenuItem getMntmAcercaDe() {
		if (mntmAcercaDe == null) {
			mntmAcercaDe = new JMenuItem("Acerca de");
			mntmAcercaDe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, "Reproductor realizado por Roberto Fernandez Diaz \n Si has encontrado un bug puedes contactar conmigo a traves de : \n Twitter:robertofd1995\n correo:robertofd1995@gmail.com","Acerca de ",JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmAcercaDe;
	}
	
	
	//CRAPPY 	METHODS
	private void mostrarVentanaPreferencias(){
		
		preferencias = new Preferencias(this);
		//ventanaRegistro = new VentanaRegistro(); in that way you doesn't create a referent to the parent windows and you don't have their references 
		preferencias.setLocationRelativeTo(this);//this is to create in the middle of the screen 
		preferencias.setModal(true);
		preferencias.setVisible(true);
		
	}
	
	protected void changeColors(String colorS,boolean option){
		
		Color color;
		try {
		    Field field = Class.forName("java.awt.Color").getField(colorS);
		    color = (Color)field.get(null);
		} catch (Exception e) {
		    color = null; // Not defined
		}
		
		
		
		logo.setIcon(new ImageIcon(VentanaPrincipalM.class//cambia el logo de la pagina
				.getResource("/img/Logo"+colorS+".PNG")));
		scLista1.setBorder(new LineBorder(color, 3));
		scLista2.setBorder(new LineBorder(color, 3));
		slider.setForeground(color);	
		
		if(option==true){
			btnAdd.setForeground(color);
			btnDelete.setForeground(color);
			btnForward.setForeground(color);
			btnPlay.setForeground(color);
			btnRewind.setForeground(color);
			txVol.setForeground(color);
			lblVol.setForeground(color);
		}
		
		
	}
	
	
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Preferences...");
			mntmNewMenuItem.setMnemonic('r');
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					mostrarVentanaPreferencias();
				}
			});
		}
		return mntmNewMenuItem;
	}
}
