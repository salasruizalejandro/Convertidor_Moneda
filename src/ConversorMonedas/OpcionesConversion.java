package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elige la moneda a la que deseas convertir tu dinero", "monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"De Pesos Colombianos a Dolares", "De Pesos Colombianos a Real Brazileño", "De Pesos Colombianos a Euros", "De Pesos Colombianos a Yuan Chino", "De Pesos Colombianos a Dolar Canadience", 
				"De pesos Colombianos a Won Coreano"  }, "Seleccion")).toString();
		switch(opcion) {		
		case "De Pesos Colombianos a Dolares" : 
			monedas.ConvertirPesosColombianosADolares(valor);
			break;
		
		case "De Pesos Colombianos a Real Brazileño" : 
			monedas.ConvertirPesosColombianosARealBrazileño(valor);
			break;
		
		case "De Pesos Colombianos a Euros" : 
			monedas.ConvertirPesosColombianosAEuros(valor);
			break;
			
		case "De Pesos Colombianos a Yuan Chino" : 
			monedas.ConvertirPesosColombianosAYuanChino(valor);
			break;
		
		case "De Pesos Colombianos a Dolar Canadience" : 
			monedas.ConvertirPesosColombianosADolarCanadience(valor);
			break;
			
		case "De pesos Colombianos a Won Coreano" : 
			monedas.ConvertirPesosColombianosAWonCoreano(valor);
			break;
		
		}
	}
	
}
