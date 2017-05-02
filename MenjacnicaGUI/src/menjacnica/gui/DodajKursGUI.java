package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextField sifra;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField prodajniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField srednjiKurs;
	private JButton btnDodaj;
	private JButton btnOdustani;
	private JTextField naziv;
	private JTextField kupovniKurs;
	private JTextField skraceniNaziv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
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
	public DodajKursGUI() {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 369, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getSifra());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getProdajniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getSrednjiKurs());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		contentPane.add(getNaziv());
		contentPane.add(getKupovniKurs());
		contentPane.add(getSkraceniNaziv());
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(30, 11, 86, 20);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(197, 11, 84, 20);
		}
		return lblNaziv;
	}
	private JTextField getSifra() {
		if (sifra == null) {
			sifra = new JTextField();
			sifra.setBounds(30, 42, 134, 20);
			sifra.setColumns(10);
		}
		return sifra;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(30, 83, 86, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(197, 83, 84, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getProdajniKurs() {
		if (prodajniKurs == null) {
			prodajniKurs = new JTextField();
			prodajniKurs.setBounds(30, 108, 134, 20);
			prodajniKurs.setColumns(10);
		}
		return prodajniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(30, 154, 86, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(197, 154, 84, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getSrednjiKurs() {
		if (srednjiKurs == null) {
			srednjiKurs = new JTextField();
			srednjiKurs.setBounds(30, 179, 134, 20);
			srednjiKurs.setColumns(10);
		}
		return srednjiKurs;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String poruka = "Dodat kurs: " + "\n" + "Sifra: " + sifra.getText() +  " Naziv: " + naziv.getText() + " Prodajni kurs: " +
				prodajniKurs.getText() + " Kupovni kurs: " + kupovniKurs.getText() + " Srednji kurs: " + 
				srednjiKurs.getText() + " Skraceni naziv: " + skraceniNaziv.getText();
				GUIKontroler.ispisi(poruka);
				dispose();
				}
				
			});
			btnDodaj.setBounds(30, 219, 133, 30);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(197, 219, 134, 30);
		}
		return btnOdustani;
	}
	private JTextField getNaziv() {
		if (naziv == null) {
			naziv = new JTextField();
			naziv.setColumns(10);
			naziv.setBounds(197, 42, 134, 20);
		}
		return naziv;
	}
	private JTextField getKupovniKurs() {
		if (kupovniKurs == null) {
			kupovniKurs = new JTextField();
			kupovniKurs.setColumns(10);
			kupovniKurs.setBounds(197, 108, 134, 20);
		}
		return kupovniKurs;
	}
	private JTextField getSkraceniNaziv() {
		if (skraceniNaziv == null) {
			skraceniNaziv = new JTextField();
			skraceniNaziv.setColumns(10);
			skraceniNaziv.setBounds(197, 179, 134, 20);
		}
		return skraceniNaziv;
	}
}
