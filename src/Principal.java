import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.somar(10,50);
		calculadora.somar(20,10);
		
		JOptionPane.showMessageDialog(null, calculadora.getValor());
	}

}
