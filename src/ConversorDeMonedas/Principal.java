package ConversorDeMonedas;

import java.util.concurrent.Exchanger;

import javax.swing.JOptionPane;

import ConversosDeTemperaturas.nexoTemperatura;

public class Principal {
	public static void main(String[] args) {
		nexo nexo= new nexo();
		nexoTemperatura temp=new nexoTemperatura();
		
		String opciones=(JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "MENU",
			JOptionPane.QUESTION_MESSAGE,null, new Object[] {"Conversor de Monedas", "Conversor de Temperaturas"},"Seleccion")).toString();
	
		switch (opciones) {
		case  "Conversor de Monedas":{
		String input=	JOptionPane.showInputDialog( "Ingresa la cantidad de dinero que deseas convertir");
		double valorRecibido= Double.parseDouble(input);
		nexo.ConvertirMonedas(valorRecibido);
		
		}
	
		case  "Conversor de Temperaturas":{
			String input=	JOptionPane.showInputDialog( "Ingresa la temperatura que deseas convertir");
			double valorRecibido= Double.parseDouble(input);
			temp.convierteTemperatura(valorRecibido);
			}
		}
		
	}
}

			
	
	
	


