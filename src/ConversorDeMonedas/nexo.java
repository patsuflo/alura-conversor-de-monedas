package ConversorDeMonedas;

import javax.swing.JOptionPane;

public class nexo {
public void ConvertirMonedas(double valorRecibido) {
	ConvierteMonedas moneda= new ConvierteMonedas();
	
	String opciones=(JOptionPane.showInputDialog(null, "Elija una moneda", "Monedas",
			JOptionPane.QUESTION_MESSAGE,null, new Object[] {"De Dolar a Pesos", "De Euro a Pesos","De Yen a Pesos","De Won Coreano a Pesos","De Libras a Pesos","De Pesos a Dolar","De Pesos a Euro","De Pesos a Yen","De Pesos a Won Coreano","De Pesos a Libras"},"Seleccion")).toString();
	
	switch (opciones) {
	case "De Dolar a Pesos": {
		moneda.ConvertirDolarAPesosArgentinos(valorRecibido);
		break;
	
	}
	case "De Euro a Pesos" : {
		moneda.ConvertirEuroAPesosArgentinos(valorRecibido);
		break;	
	}
	case "De Yen a Pesos" : {
		moneda.ConvertirYenAPesosArgentinos(valorRecibido);
		break;	
	}
	case "De Won Coreano a Pesos" : {
		moneda.ConvertirWonAPesosArgentinos(valorRecibido);
		break;	
	}
	case "De Libras a Pesos" : {
		moneda.ConvertirLibrasAPesosArgentinos(valorRecibido);
		break;	
	}
	case "De Pesos a Dolar" : {
		moneda.ConvertirPesosArgentinosADolar(valorRecibido);
		break;	
	}
	case "De Pesos a Euro" : {
		moneda.ConvertirPesosArgentinosAEuros(valorRecibido);
		break;	
	}
	case "De Pesos a Yen" : {
		moneda.ConvertirPesosArgentinosAYen(valorRecibido);
		break;	
	}
	case "De Pesos a Won Coreano" : {
		moneda.ConvertirPesosArgentinosAWon(valorRecibido);
		break;	
	}
	case "De Pesos a Libras" : {
		moneda.ConvertirPesosArgentinosALibras(valorRecibido);
		break;	
	}
	}
}
}

	

	
	
	

