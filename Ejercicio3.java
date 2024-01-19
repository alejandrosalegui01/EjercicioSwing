import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ejercicio3 extends JFrame implements ActionListener {
	  
	
	JComboBox cboProvincia;
	String provincia[]	 = {"Guipuzcoa","Vizcaya","Alava"};
	JComboBox cboLocalidad;
	String guipuzcoa[]	 = {"San Sebasian","Beasain","Hernani","Zarautz"};
	String vizcaya[]	 = {"Bilbao","Bermeo","Balmaseda"};
	String alava[]	     = {"Vitoria","Araman","Labastida"};
	
	Ejercicio3 (){
		
		setLayout(new GridLayout(2,2));
	
	cboProvincia = new JComboBox(provincia);
	cboLocalidad = new JComboBox(guipuzcoa);
	cboLocalidad = new JComboBox(alava);
	cboLocalidad = new JComboBox(vizcaya);
	
	
	
	setTitle ("Provincias y Localidades"); 
	setVisible(true);
	setSize(500,500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Ejercicio3();

	}

}
