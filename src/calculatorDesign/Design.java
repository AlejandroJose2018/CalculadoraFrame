package calculatorDesign;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;



public class Design extends JFrame implements ActionListener {

	
	JPanel base = (JPanel) this.getContentPane();
	
	//create the Display
	JTextField pantalla = new JTextField();//"J" For proprietary special 
	
	//create button
	
	Button b_one = new Button("1");
	Button b_two = new Button("2");
	Button b_tree = new Button("3");
	Button b_delete = new Button("Delete");
	
	Button b_four = new Button("4");
	Button b_five = new Button("5");
	Button b_six = new Button("6");
	Button b_sum = new Button("+");

	Button b_seven = new Button("7");
	Button b_eith = new Button("8");
	Button b_nine = new Button("9");
	Button b_less = new Button("-");

	Button b_by = new Button("*");
	Button b_zero = new Button("0");
	Button b_div = new Button("/");
	Button b_point = new Button(".");
	Button b_igual = new Button("=");
	
	public Design() {
		setForeground(new Color(255, 0, 255));
		setBackground(new Color(47, 79, 79));
		getContentPane().setBackground(new Color(47, 79, 79));
		//Propiedades del Formulario
		
		base.setLayout(null);//Acomodar manulmente los elemnetos
		setSize(350,450);
		setTitle("CALCULATOR STANDAR");
		setVisible(true);
		pantalla.setBackground(new Color(255, 255, 255));
		
		//Propiedades de Pantalla
		
		pantalla.setBounds(22, 8, 288, 70);
		getContentPane().add(pantalla);
		pantalla.setFont(new Font("arial", Font.BOLD, 28));
		b_one.setForeground(new Color(255, 255, 255));
		b_one.setBackground(new Color(0, 153, 0));

		
		//Propiedades de Botones
		b_one.setBounds(22, 83, 60, 60);
		b_one.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_one);
		b_one.addActionListener(this);
		b_two.setForeground(new Color(255, 255, 255));
		b_two.setBackground(new Color(0, 153, 0));
		
		b_two.setBounds(87, 83, 60, 60);
		b_two.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_two);
		b_two.addActionListener(this);
		b_tree.setForeground(new Color(255, 255, 255));
		b_tree.setBackground(new Color(0, 153, 0));
		
		b_tree.setBounds(152, 83, 60, 60);
		b_tree.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_tree);
		b_tree.addActionListener(this);
		b_delete.setForeground(new Color(255, 255, 255));
		b_delete.setBackground(new Color(0, 153, 0));
		
		b_delete.setBounds(217, 83, 92, 60);
		b_delete.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_delete);
		b_delete.addActionListener(this);
		b_four.setForeground(new Color(255, 255, 255));
		b_four.setBackground(new Color(0, 153, 0));
		
		//Segundo Bloque
		
		b_four.setBounds(22, 148, 60, 60);
		b_four.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_four);
		b_four.addActionListener(this);
		b_five.setForeground(new Color(255, 255, 255));
		b_five.setBackground(new Color(0, 153, 0));
		
		b_five.setBounds(87, 148, 60, 60);
		b_five.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_five);
		b_five.addActionListener(this);
		b_six.setForeground(new Color(255, 255, 255));
		b_six.setBackground(new Color(0, 153, 0));
		
		b_six.setBounds(152, 148, 60, 60);
		b_six.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_six);
		b_six.addActionListener(this);
		b_sum.setForeground(new Color(255, 255, 255));
		b_sum.setBackground(new Color(0, 153, 0));
		
		b_sum.setBounds(217, 148, 92, 60);
		b_sum.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_sum);
		b_sum.addActionListener(this);
		b_seven.setForeground(new Color(255, 255, 255));
		b_seven.setBackground(new Color(0, 153, 0));
		
		//Tercer Bloque
		
		b_seven.setBounds(22, 213, 60, 60);
		b_seven.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_seven);
		b_seven.addActionListener(this);
		b_eith.setForeground(new Color(255, 255, 255));
		b_eith.setBackground(new Color(0, 153, 0));
		
		b_eith.setBounds(87, 213, 60, 60);
		b_eith.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_eith);
		b_eith.addActionListener(this);
		b_nine.setForeground(new Color(255, 255, 255));
		b_nine.setBackground(new Color(0, 153, 0));
		
		b_nine.setBounds(152, 213, 60, 60);
		b_nine.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_nine);
		b_nine.addActionListener(this);
		b_less.setForeground(new Color(255, 255, 255));
		b_less.setBackground(new Color(0, 153, 0));
		
		b_less.setBounds(217, 213, 92, 60);
		b_less.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_less);
		b_less.addActionListener(this);
		b_by.setForeground(new Color(255, 255, 255));
		b_by.setBackground(new Color(0, 153, 0));
		
		//Cuarto Bloque
		
		b_by.setBounds(22, 278, 60, 60);
		b_by.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_by);
		b_by.addActionListener(this);
		b_zero.setForeground(new Color(255, 255, 255));
		b_zero.setBackground(new Color(0, 153, 0));
		
		b_zero.setBounds(87, 278, 60, 60);
		b_zero.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_zero);
		b_zero.addActionListener(this);
		b_div.setForeground(new Color(255, 255, 255));
		b_div.setBackground(new Color(0, 153, 0));
		
		b_div.setBounds(152, 278, 60, 60);
		b_div.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_div);
		b_div.addActionListener(this);
		b_point.setForeground(new Color(255, 255, 255));
		b_point.setBackground(new Color(0, 153, 0));
		
		b_point.setBounds(217, 278, 92, 60);
		b_point.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_point);
		b_point.addActionListener(this);
		b_igual.setBackground(new Color(0, 153, 102));
		
		b_igual.setBounds(22, 343, 288, 60);
		b_igual.setFont(new Font("arial", Font.BOLD, 20));
		getContentPane().add(b_igual);
		b_igual.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Design();	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b_one) {
			if(pantalla.getText() == "") {
				pantalla.setText("1");
			}
			else {
				pantalla.setText(pantalla.getText() + "1");
			}
		}
		
		if(e.getSource() == b_two) {
			if(pantalla.getText() == "") {
				pantalla.setText("2");
			}
			else {
				pantalla.setText(pantalla.getText() + "2");
			}
		}
		if(e.getSource() == b_tree) {
			if(pantalla.getText() == "") {
				pantalla.setText("3");
			}
			else {
				pantalla.setText(pantalla.getText() + "3");
			}
		}
		
		if(e.getSource() == b_four) {
			if(pantalla.getText() == "") {
				pantalla.setText("4");
			}
			else {
				pantalla.setText(pantalla.getText() + "4");
			}
		}
		
		if(e.getSource() == b_five) {
			if(pantalla.getText() == "") {
				pantalla.setText("5");
			}
			else {
				pantalla.setText(pantalla.getText() + "5");
			}
		}
		
		if(e.getSource() == b_six) {
			if(pantalla.getText() == "") {
				pantalla.setText("6");
			}
			else {
				pantalla.setText(pantalla.getText() + "6");
			}
		}
		
		
		if(e.getSource() == b_seven) {
			if(pantalla.getText() == "") {
				pantalla.setText("7");
			}
			else {
				pantalla.setText(pantalla.getText() + "7");
			}
		}
		
		if(e.getSource() == b_eith) {
			if(pantalla.getText() == "") {
				pantalla.setText("8");
			}
			else {
				pantalla.setText(pantalla.getText() + "8");
			}
		}
		
		if(e.getSource() == b_nine) {
			if(pantalla.getText() == "") {
				pantalla.setText("9");
			}
			else {
				pantalla.setText(pantalla.getText() + "9");
			}
		}
		
		if(e.getSource() == b_zero) {
			if(pantalla.getText() == "") {
				pantalla.setText("0");
			}
			else {
				pantalla.setText(pantalla.getText() + "0");
			}
		}
		
		if(e.getSource() == b_sum) {
			if(pantalla.getText() == "") {
				pantalla.setText("+");
			}
			else {
				pantalla.setText(pantalla.getText() + "+");
			}
		}
		
		if(e.getSource() == b_less) {
			if(pantalla.getText() == "") {
				pantalla.setText("-");
			}
			else {
				pantalla.setText(pantalla.getText() + "-");
			}
		}
		if(e.getSource() == b_by) {
			if(pantalla.getText() == "") {
				pantalla.setText("*");
			}
			else {
				pantalla.setText(pantalla.getText() + "*");
			}
		}
		if(e.getSource() == b_div) {
			if(pantalla.getText() == "") {
				pantalla.setText("/");
			}
			else {
				pantalla.setText(pantalla.getText() + "/");
			}
		}
		
		if(e.getSource() == b_point) {
			if(pantalla.getText() == "") {
				pantalla.setText(".");
			}
			else {
				pantalla.setText(pantalla.getText() + ".");
			}
		}
		
		if(e.getSource() == b_delete) {
			pantalla.setText("");
		}
		
		if(e.getSource() == b_igual) {
			
			String cadena = pantalla.getText();
			
			for (int i = 0; i < cadena.length(); i++) {
				char caracter = cadena.charAt(i);
				//los char van en commillas simples
				
					if(caracter == '+') {
						String primeraParte = cadena.substring(0, i);
						String segundaParte = cadena.substring(i+1, cadena.length());
						
						double resultado = Double.parseDouble(primeraParte) + Double.parseDouble(segundaParte);
						
						
						pantalla.setText(Double.toString(resultado));
						
					}
					
					
					if(caracter == '-') {
						String primeraParte = cadena.substring(0, i);
						String segundaParte = cadena.substring(i+1, cadena.length());
						
						double resultado = Double.parseDouble(primeraParte) - Double.parseDouble(segundaParte);
						
						
						pantalla.setText(Double.toString(resultado));
						
					}
					
					if(caracter == '*') {
						String primeraParte = cadena.substring(0, i);
						String segundaParte = cadena.substring(i+1, cadena.length());
						
						double resultado = Double.parseDouble(primeraParte) * Double.parseDouble(segundaParte);
						
						
						pantalla.setText(Double.toString(resultado));
						
					}
					
					if(caracter == '/') {
						String primeraParte = cadena.substring(0, i);
						String segundaParte = cadena.substring(i+1, cadena.length());
						
						double cero = Double.parseDouble(segundaParte);
						if(cero == 0) {
							//JOptionPane.showMessageDialog(null, "No se Puede Dividir Entre Cero");
							pantalla.setText("Infinity");
						}
						
						double resultado = Double.parseDouble(primeraParte) / Double.parseDouble(segundaParte);
						
						
						pantalla.setText(Double.toString(resultado));
						
					}
			}

	}
	}
}
