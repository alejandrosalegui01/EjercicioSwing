import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ejercicio1 extends JFrame implements ActionListener {
    
	
	JTextField txtusuario;
	JPasswordField pswcontrasena;
	JLabel lblUsuario;
	JLabel lblContraseña;
	JButton btnValidacion;
	
	
	Ejercicio1 (){
		
		setLayout (new GridLayout(3,2));
		
		pswcontrasena = new JPasswordField();
		lblUsuario = new JLabel("Usuario");
		lblContraseña = new JLabel("Contraseña");
		btnValidacion = new JButton("Validacion");
		txtusuario = new JTextField();
		
		btnValidacion.addActionListener(this);
		
		add(lblUsuario);
		add(txtusuario);
		add(lblContraseña);
		add(pswcontrasena);
		add(btnValidacion);
		
		setTitle("Inicio de Sesión");
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== btnValidacion) {
		
			String valorusuario = new String (txtusuario.getText());
			String valorcontrasena = new String (pswcontrasena.getPassword());
			
			if (valorusuario.equals("admin")&& valorcontrasena.equals("admin1234"))
				btnValidacion.setText("La contraseña es correcta");
			
			else 
				btnValidacion.setText("La contraseña no es correcta");
				
		}
		

	}

	public static void main(String[] args) {
		new Ejercicio1();

	}

}
