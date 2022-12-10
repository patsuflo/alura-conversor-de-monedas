package ConversorDeMonedas;

import javax.swing.JOptionPane;

public class ConvierteMonedas {


	public void ConvertirDolarAPesosArgentinos(double valorRecibido) {
		double valorDolar=valorRecibido*176.81;
		valorDolar=(double)Math.round(valorDolar*100)/100;
		JOptionPane.showMessageDialog(null, "Tienes  "+ valorDolar+ "  Pesos");
		
	}	
		
	public void ConvertirEuroAPesosArgentinos(double valorRecibido) {
		double valorEuro=valorRecibido*185.92;
		valorEuro=(double)Math.round(valorEuro*100)/100;
		JOptionPane.showMessageDialog(null, "Tienes  "+ valorEuro+ "  Pesos");
		
	}	
		
	public void ConvertirYenAPesosArgentinos(double valorRecibido) {
		double valorYen=valorRecibido*1.24;
		valorYen=(double)Math.round(valorYen*100)/100;
		JOptionPane.showMessageDialog(null, "Tienes  "+ valorYen+ "  Pesos");
		
	}		
		
	public void ConvertirWonAPesosArgentinos(double valorRecibido) {
		double valorWonCoreano=valorRecibido*0.13;
		valorWonCoreano=(double)Math.round(valorWonCoreano*100)/100;
		JOptionPane.showMessageDialog(null, "Tienes  "+ valorWonCoreano+ "  Pesos");
		
	}

	public void ConvertirLibrasAPesosArgentinos(double valorRecibido) {
		double valorLibras=valorRecibido*208.29;
		valorLibras=(double)Math.round(valorLibras*100)/100;
		JOptionPane.showMessageDialog(null, "Tienes  "+ valorLibras+ "  Pesos");
		
	}
		
	public void ConvertirPesosArgentinosADolar(double valorRecibido) {
		double valorPesosADolar=valorRecibido/176.81;
		valorPesosADolar=(double)Math.round(valorPesosADolar*100)/100;
		JOptionPane.showMessageDialog(null, "Tienes  "+ valorPesosADolar+ "  Dolares");
		
	}
		
	public void ConvertirPesosArgentinosAEuros(double valorRecibido) {
		double valorPesosAEuro=valorRecibido/185.92;
		valorPesosAEuro=(double)Math.round(valorPesosAEuro*100)/100;
		JOptionPane.showMessageDialog(null, "Tienes  "+ valorPesosAEuro+ "  Euros");
		
	}
	public void ConvertirPesosArgentinosAYen(double valorRecibido) {
		double valorPesosAYen=valorRecibido/1.24;
		valorPesosAYen=(double)Math.round(valorPesosAYen*100)/100;
		JOptionPane.showMessageDialog(null, "Tienes  "+ valorPesosAYen+ "  Yenes");
		
	}
		
	public void ConvertirPesosArgentinosAWon(double valorRecibido) {
		double valorPesosAWonCoreano=valorRecibido/0.13;
		valorPesosAWonCoreano=(double)Math.round(valorPesosAWonCoreano*100)/100;
		JOptionPane.showMessageDialog(null, "Tienes  "+ valorPesosAWonCoreano+ "  Wons");
		
	}

	public void ConvertirPesosArgentinosALibras(double valorRecibido) {
		double valorPesosALibras=valorRecibido/208.29;
		valorPesosALibras=(double)Math.round(valorPesosALibras*100)/100;
		JOptionPane.showMessageDialog(null, "Tienes  "+ valorPesosALibras+ "  Libras");
		
	}

	
	}
	
	
	
	
	

