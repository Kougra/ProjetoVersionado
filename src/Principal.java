import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
//		calculadora.somar(10,50);
//		calculadora.somar(20,10);
		
		int primeiroValor = Integer.parseInt( 
				JOptionPane.showInputDialog("Digite um valor: "));
		int segundoValor = Integer.parseInt(
				JOptionPane.showInputDialog("Digite um valor: "));
		calculadora.multiplicar(primeiroValor, segundoValor);
		
		JOptionPane.showMessageDialog(null, calculadora.getValor());
	}

}
