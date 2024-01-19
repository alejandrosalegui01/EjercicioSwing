import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejercicio2 extends JFrame implements ActionListener {

	JComboBox cboAnimales;
	String animales[]	 = {"GATO","PERRO","CABALLO"};
	ImageIcon imgGatos,imgPerros,imgCaballos ;
	JLabel lblimagen;
	
	
	
	
	
	Ejercicio2 () {
		 setLayout (new GridLayout(2,2));
		 
		cboAnimales  = new JComboBox(animales);
		
		lblimagen = new JLabel ();
		imgGatos = new ImageIcon ("E:\\imagenes\\gatos.jpg");
		imgPerros = new ImageIcon ("E:\\imagenes\\perros.jpg");
		imgCaballos = new ImageIcon ("E:\\imagenes\\caballos.jpg");
		
		cboAnimales.addActionListener(this);
		
		add(cboAnimales);
		add(lblimagen);
		add(lblimagen);
		
		setTitle ("Animales"); 
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== cboAnimales) {
			
			JOptionPane.showMessageDialog(this,"Seleccionado: " + cboAnimales.getSelectedItem());
			
		
		
		if(cboAnimales.getSelectedItem()== "GATO")
			lblimagen.setIcon(imgGatos);
		if(cboAnimales.getSelectedItem()== "PERRO")
			lblimagen.setIcon(imgPerros);
		if(cboAnimales.getSelectedItem()== "CABALLO")
			lblimagen.setIcon(imgCaballos);

	}
	}
	public static void main(String[] args) {
		new Ejercicio2 ();

	}

}
