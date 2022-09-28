package ConversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesConversionTemp {
	
	ConvertirTemperatura Grados = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double valorRecibidoTemperaruta) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elige el tipo de grado que desea cambiar", "Grados",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"centigrados", "Farenh"}, "Seleccion")).toString();
		
		switch(opcion) {
		case "centigrados" : 
			Grados.ConvertirFaren(valorRecibidoTemperaruta);
			break;
		}
	}
}
		
		
		
		
	

