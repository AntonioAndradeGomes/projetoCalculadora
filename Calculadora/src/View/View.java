package View;

import java.util.Scanner;
import Controler.Controlador;
import Controler.IControlador;
public class View {
	public static void main(String[] args) {
		Scanner t = new Scanner (System.in);
		while (true) {
			System.out.println("a escolha da operação \n"
					+ "por +, -, *, /");
			System.out.println();
			System.out.println("Digite dois numeros e sua operação");
			double num1 = t.nextDouble(); double num2 = t.nextDouble();
			String op = t.next();
			
			IControlador c  = new Controlador();
			System.out.println(c.calcular(num1, num2, op));
			System.out.println("Quer continuar? \n"
					+ "1: SIM, qualquer valor: NÃO");
			byte var = t.nextByte();
			if (var != 1) {
				break;
			}	
		}
	}
}
