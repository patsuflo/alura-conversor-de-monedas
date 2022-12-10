package ConversosDeTemperaturas;

import javax.swing.JOptionPane;

public class ConvierteTemperatura {

	public void conviertecelsiusAFarenheit(double valorRecibido) {
		double celsiusAFarenheit = (valorRecibido * 9 / 5) + 32;
		JOptionPane.showMessageDialog(null, "La temperatura es  " + celsiusAFarenheit + "  °F");
	}
	public void conviertecelsiusAKelvin(double valorRecibido) {
		double celsiusAKelvin = valorRecibido  + 273.15;
		celsiusAKelvin=(double)Math.round(celsiusAKelvin*100)/100;
		JOptionPane.showMessageDialog(null, "La temperatura es  " + celsiusAKelvin + "  °K");
	}

	public void conviertefarenheitAcelsius(double valorRecibido) {
		double farenheitAcelsius = (valorRecibido - 32) * 9 / 5;
		JOptionPane.showMessageDialog(null, "La temperatura es  " + farenheitAcelsius + "  °C");
	}
	public void conviertefarenheitAKelvin(double valorRecibido) {
		double farenheitAKelvin = (valorRecibido - 32)* 5/9 + 273.15;
		farenheitAKelvin=(double)Math.round(farenheitAKelvin*100)/100;
		JOptionPane.showMessageDialog(null, "La temperatura es  " + farenheitAKelvin + "  °K");
	}
	public void conviertekelvinAfarenheit(double valorRecibido) {
		double KelvinAfarenheit = (valorRecibido - 273.15)* 5/9+32 ;
		KelvinAfarenheit=(double)Math.round(KelvinAfarenheit*100)/100;
		JOptionPane.showMessageDialog(null, "La temperatura es  " + KelvinAfarenheit + "  °F");
	}
	public void conviertekelvinACelsius(double valorRecibido) {
		double KelvinACelsius = (valorRecibido - 273.15);
		JOptionPane.showMessageDialog(null, "La temperatura es  " + KelvinACelsius + "  °C");
	}

}
