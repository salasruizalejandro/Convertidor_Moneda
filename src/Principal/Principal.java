package Principal;

import javax.swing.*;

import ConversorMonedas.OpcionesConversion;

public class Principal {
	public static void main (String [] args) {
		OpcionesConversion conversion = new OpcionesConversion();
		while(true) {
			String opciones = JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion", "Menu", JOptionPane.PLAIN_MESSAGE, null,
					new Object[]{"Conversor de moneda", "Conversor de temperatura"},"Elegir").toString();
			switch(opciones) {
			case "Conversor de moneda":
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);
				
				
			case "Conversor de temperatura":
				String inputTemperatura = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibidoTemperaruta = Double.parseDouble(inputTemperatura);
				conversion.ConvertirTemperatura(valorRecibidoTemperaruta);			
			
			}
		}
	}
}