package menjacnica.gui;
	import java.awt.EventQueue;
import java.awt.JobAttributes;
import java.io.File;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import menjacnica.gui.MenjacnicaGUI;

	public class GUIKontroler {
		private static MenjacnicaGUI menjacnicaGUI;
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						menjacnicaGUI = new MenjacnicaGUI();
						menjacnicaGUI.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		public static void otvoriFajl(){
			JFileChooser fc = new JFileChooser();
			int vrednost = fc.showOpenDialog(menjacnicaGUI.getContentPane());
			if(vrednost==JFileChooser.APPROVE_OPTION){
				File fajl = fc.getSelectedFile();
				menjacnicaGUI.ispis("Ucitan fajl: " + fajl.getAbsolutePath());
			}
		}
	
	public static void sacuvajFajl(){
		JFileChooser fc = new JFileChooser();
		int vrednost = fc.showSaveDialog(menjacnicaGUI.getContentPane());
		if(vrednost == JFileChooser.APPROVE_OPTION){
			File fajl = fc.getSelectedFile();
			menjacnicaGUI.ispis("Sacuvan fajl: " + fajl.getAbsolutePath());
		}
	}
	
	public static void ugasiAplikaciju(){
		JOptionPane opcija = new JOptionPane();
		int vrednost = JOptionPane.showConfirmDialog(menjacnicaGUI.getContentPane(), "Da li zelite da izadjete iz programa?","Zatvaranje aplikacije", JOptionPane.YES_NO_CANCEL_OPTION);
		if(vrednost==JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}
	
	public static void napraviDodajKurs(){
		DodajKursGUI kurs = new DodajKursGUI();
		kurs.setVisible(true);
	}
	
	public static void ispisi(String poruka){
		menjacnicaGUI.ispis(poruka);
	}
	
	public static void napraviObrisiKurs(){
		ObrisiKursGUI obrisi = new ObrisiKursGUI();
		obrisi.setVisible(true);
	}
	
	public static void podaciOAutoru(){
		String poruka = "Ime: Ana Colovic" + "\n" + "Fakultet: Fakultet organizacionih nauka " + "\n" + "Smer: Informacioni sistemi i tehnologije";
		JOptionPane.showMessageDialog(menjacnicaGUI.getContentPane(), poruka, "Podaci o autoru", 1);
	}
	
	public static void napraviIzvrsiZamenu(){
		IzvrsiZamenuGUI zamena = new IzvrsiZamenuGUI();
		zamena.setVisible(true);
	}
	}
