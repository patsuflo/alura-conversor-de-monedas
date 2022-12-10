package ConversosDeTemperaturas;

import javax.swing.JOptionPane;

public class nexoTemperatura {

	public void convierteTemperatura(double valorRecibido) {
		ConvierteTemperatura temperatura=new ConvierteTemperatura();
		
		String opciones=(JOptionPane.showInputDialog(null, "Elija una opcion", "Temperaturas",
				JOptionPane.QUESTION_MESSAGE,null, new Object[] {"De Celsius a Farenheit", "De Celsius a Kelvin","De Farenheit a Celsius","De Farenheit a Kelvin","De Kelvin a Farenheit","De Kelvin a Celsius"},"Seleccion")).toString();
		 
		switch (opciones) {
		case "De Celsius a Farenheit": {
			temperatura.conviertecelsiusAFarenheit(valorRecibido);
			break;
			}
		case "De Celsius a Kelvin":{
			temperatura.conviertecelsiusAKelvin(valorRecibido);
			break;
		}
		case "De Farenheit a Celsius":{
			temperatura.conviertefarenheitAcelsius(valorRecibido);
			break;
		}
		case "De Farenheit a Kelvin":{
			temperatura.conviertefarenheitAKelvin(valorRecibido);
			break;
		}
		case "De Kelvin a Farenheit":{
			temperatura.conviertekelvinAfarenheit(valorRecibido);
			break;
		}
		case "De Kelvin a Celsius":{
			temperatura.conviertekelvinACelsius(valorRecibido);
			break;
		}
	
	}
	
	}
}
