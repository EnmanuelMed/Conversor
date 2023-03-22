import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class Conversor {
	
	

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	private double valor;
	private int divisa1, divisa2, divisa3;
	private double resultado;
	 

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getDivisa1() {
		return divisa1;
	}

	public void setDivisa1(int divisa1) {
		this.divisa1 = divisa1;
	}

	public int getDivisa2() {
		return divisa2;
	}

	public void setDivisa2(int divisa2) {
		this.divisa2 = divisa2;
	}
	
	
	
	public int getDivisa3() {
		return divisa3;
	}

	public void setDivisa3(int divisa3) {
		this.divisa3 = divisa3;
	}
	
	
	
	
	
	

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public Conversor() {
		super();
	}
	


	public double convertir() {
		if (divisa1 == 0 && divisa2 == 1)
			resultado =  valor * 0.93 ;
		if (divisa1 == 1 && divisa2 == 0)
			resultado = valor * 1.08;
		if (divisa1 == 0 && divisa2 == 2)
			resultado = valor * 132.30;
		if (divisa1 == 1 && divisa2 == 2)
			resultado = valor * 142.12;
		if (divisa1 == 2 && divisa2 == 0)
			resultado = valor * 0.0076;
		if (divisa1 == 2 && divisa2 == 1)
			resultado = valor * 0.0070;
		
		if (divisa1 == 0 && divisa2 == 0)
			resultado = valor;
		if (divisa1 == 1 && divisa2 == 1)
			resultado = valor;	
		if (divisa1 == 2 && divisa2 == 2)
			resultado = valor ;	
		
	
		
		return Math.round(resultado);

		
		
		
		
		 
		
		
		
		
		
		
		
	}

	}
	
