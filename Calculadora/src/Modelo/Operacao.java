package Modelo;

public class Operacao {
	private double valor1 = 0;
	private double valor2 = 0;
	private String operacao = "";
	private double  resultado = 0;


	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public double getResultado() {
		return resultado;
	}
	
	public void setResultado() {
		if (this.getOperacao().equals("+")) {
			this.resultado = (valor2 + valor1);
		}else if (this.getOperacao().equals("-")) {
			this.resultado = (valor1 - valor2);
		}else if (this.getOperacao().equals("*")) {
			this.resultado = (valor2 * valor1);
		}else if (this.getOperacao().equals("/")) {
			if(valor2 == 0) {
				System.out.println("não há divisão por 0");
			}else {
			this.resultado = (valor1 / valor2);}
		}else {
			System.out.println("Falha na escolha da operação");
		}
	}
}