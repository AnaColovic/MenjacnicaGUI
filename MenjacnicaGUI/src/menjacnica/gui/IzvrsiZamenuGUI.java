package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblProdajniKurs;
	private JTextField kupovni;
	private JTextField prodajni;
	private JLabel lblValuta;
	private JComboBox<String> comboBox;
	private JLabel lblIznos;
	private JTextField iznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton kupovina;
	private JRadioButton prodaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private ButtonGroup bg = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 415, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getKupovni());
		contentPane.add(getProdajni());
		contentPane.add(getLblValuta());
		contentPane.add(getComboBox());
		comboBox.addItem("EUR");
		comboBox.addItem("USD");
		comboBox.addItem("CHF");
		contentPane.add(getLblIznos());
		contentPane.add(getIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getKupovina());
		contentPane.add(getProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kupovni kurs");
			lblNewLabel.setBounds(10, 11, 85, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(259, 11, 93, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getKupovni() {
		if (kupovni == null) {
			kupovni = new JTextField();
			kupovni.setEditable(false);
			kupovni.setBounds(10, 36, 130, 20);
			kupovni.setColumns(10);
		}
		return kupovni;
	}
	private JTextField getProdajni() {
		if (prodajni == null) {
			prodajni = new JTextField();
			prodajni.setEditable(false);
			prodajni.setBounds(259, 36, 130, 20);
			prodajni.setColumns(10);
		}
		return prodajni;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(150, 11, 46, 14);
		}
		return lblValuta;
	}
	private JComboBox<String> getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox<String>();
			comboBox.setBounds(150, 36, 88, 20);
		}
		return comboBox;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(10, 78, 46, 14);
		}
		return lblIznos;
	}
	private JTextField getIznos() {
		if (iznos == null) {
			iznos = new JTextField();
			iznos.setBounds(9, 103, 168, 20);
			iznos.setColumns(10);
		}
		return iznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(260, 78, 107, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getKupovina() {
		if (kupovina == null) {
			kupovina = new JRadioButton("Kupovina");
			kupovina.setSelected(true);
			bg.add(kupovina);
			kupovina.setBounds(259, 102, 109, 23);
		}
		return kupovina;
	}
	private JRadioButton getProdaja() {
		if (prodaja == null) {
			prodaja = new JRadioButton("Prodaja");
			bg.add(prodaja);
			prodaja.setBounds(258, 130, 109, 23);
		}
		return prodaja;
	}
	
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent arg0) {
					int vrednost = slider.getValue();
					iznos.setText(""+vrednost);
				}
			});
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMajorTickSpacing(10);
			slider.setBounds(10, 160, 379, 51);
		}
		return slider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String transakcija;
				if(prodaja.isSelected()){
					transakcija = "Prodaja";
				} else {
					transakcija = "Kupovina";
				}
					String poruka = "Naziv valute: " + comboBox.getSelectedItem() + " Iznos: " + iznos.getText() + 
							" Transakcija: " + transakcija;
				GUIKontroler.ispisi(poruka);
				dispose();
				}
			});
			btnIzvrsiZamenu.setBounds(44, 226, 119, 34);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(233, 226, 119, 34);
		}
		return btnOdustani;
	}
}
