package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextField sifra;
	private JTextField naziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField prodajni;
	private JTextField kupovni;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField srednji;
	private JTextField skraceniNaziv;
	private JButton btnObrisi;
	private JButton btnOdustani;
	private JCheckBox chckbxZaistaObrisiKurs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getSifra());
		contentPane.add(getNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getProdajni());
		contentPane.add(getKupovni());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getSrednji());
		contentPane.add(getSkraceniNaziv());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		contentPane.add(getChckbxZaistaObrisiKurs());
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(10, 11, 46, 14);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(186, 11, 72, 14);
		}
		return lblNaziv;
	}
	private JTextField getSifra() {
		if (sifra == null) {
			sifra = new JTextField();
			sifra.setEditable(false);
			sifra.setBounds(10, 36, 127, 20);
			sifra.setColumns(10);
		}
		return sifra;
	}
	private JTextField getNaziv() {
		if (naziv == null) {
			naziv = new JTextField();
			naziv.setEditable(false);
			naziv.setBounds(186, 36, 127, 20);
			naziv.setColumns(10);
		}
		return naziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 74, 94, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(186, 74, 82, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getProdajni() {
		if (prodajni == null) {
			prodajni = new JTextField();
			prodajni.setEditable(false);
			prodajni.setBounds(10, 99, 127, 20);
			prodajni.setColumns(10);
		}
		return prodajni;
	}
	private JTextField getKupovni() {
		if (kupovni == null) {
			kupovni = new JTextField();
			kupovni.setEditable(false);
			kupovni.setBounds(186, 99, 127, 20);
			kupovni.setColumns(10);
		}
		return kupovni;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 143, 82, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(186, 143, 94, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getSrednji() {
		if (srednji == null) {
			srednji = new JTextField();
			srednji.setEditable(false);
			srednji.setBounds(10, 168, 127, 20);
			srednji.setColumns(10);
		}
		return srednji;
	}
	private JTextField getSkraceniNaziv() {
		if (skraceniNaziv == null) {
			skraceniNaziv = new JTextField();
			skraceniNaziv.setEditable(false);
			skraceniNaziv.setBounds(186, 168, 127, 20);
			skraceniNaziv.setColumns(10);
		}
		return skraceniNaziv;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String poruka = "Sifra: " + sifra.getText() +  " Naziv: " + naziv.getText() + " Prodajni kurs: " +
					prodajni.getText() + " Kupovni kurs: " + kupovni.getText() + " Srednji kurs: " + 
					srednji.getText() + " Skraceni naziv: " + skraceniNaziv.getText();
				GUIKontroler.ispisi(poruka);
				dispose();
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(10, 227, 127, 23);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(186, 227, 127, 23);
		}
		return btnOdustani;
	}
	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxZaistaObrisiKurs.isSelected()==true){
						btnObrisi.setEnabled(true);
					}
					if(chckbxZaistaObrisiKurs.isSelected()==false){
						btnObrisi.setEnabled(false);
					}
				}
			});
			chckbxZaistaObrisiKurs.setBounds(7, 197, 143, 23);
			
		}
		return chckbxZaistaObrisiKurs;
	}
}
