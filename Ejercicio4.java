import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio4 extends JFrame implements ActionListener {
 
	JLabel lbletiqueta1,lbletiqueta2,lbletiqueta3,lblresultado;
	JButton btnboton;
	
	
	Ejercicio4 () {
		 setLayout (new GridLayout(4,4));
		 
		 
		btnboton     = new JButton("Visualizar") ;
		lbletiqueta1 = new JLabel();
		lbletiqueta2 = new JLabel();
		lbletiqueta3 = new JLabel();
		lblresultado = new JLabel();
		
		add(btnboton);
		add(lbletiqueta1);
		add(lbletiqueta2);
		add(lbletiqueta3);
		add(lblresultado);
		
		btnboton.addActionListener(this);
		
		setTitle ("Animales"); 
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int aleatorio1 =(int)Math.floor(Math.random() * 10)+1;
		int aleatorio2 =(int)Math.floor(Math.random() * 10)+1;
		int aleatorio3 =(int)Math.floor(Math.random() * 10)+1;
		
		
		lbletiqueta1.setText(String.valueOf(aleatorio1));
		lbletiqueta2.setText(String.valueOf(aleatorio2));
		lbletiqueta3.setText(String.valueOf(aleatorio3));
		
		
		if(aleatorio1 == aleatorio2 && aleatorio1 == aleatorio3)
			lblresultado.setText("Los valores son iguales");
		if(aleatorio1 == aleatorio2 && aleatorio1 != aleatorio3)
			lblresultado.setText("Hay valores que son iguales");
		if(aleatorio1 != aleatorio2 && aleatorio1 == aleatorio3)
			lblresultado.setText("Hay dos valores que son iguales");
		if(aleatorio1 != aleatorio2 && aleatorio1 != aleatorio3)
			lblresultado.setText("Los tres valores no son iguales");
			
			
		
		

	}

	public static void main(String[] args) {
		new Ejercicio4();

	}

}
