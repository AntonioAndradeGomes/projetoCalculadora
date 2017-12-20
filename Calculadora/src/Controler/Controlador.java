package Controler;
import Modelo.Operacao;
public class Controlador implements IControlador {
	private Operacao comando;
	private String operacao;
	private double valor1;
	private double valor2;
	
	public double calcular(double valor1, double valor2, String operacao) {
		comando = new Operacao();
		comando.setValor1(valor1);
		comando.setValor2(valor2);
		comando.setOperacao(operacao);
		comando.setResultado();
		return this.comando.getResultado();
	}	
}
