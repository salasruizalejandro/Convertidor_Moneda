package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura{
	
	public void ConvertirFaren(double valorRecibidoTemperaruta){
		double Faren	 = (valorRecibidoTemperaruta * 9/5) + 32 ; 
		Faren = (double) Math.round(Faren * 100d) / 100;
		JOptionPane.showMessageDialog(null, "es" + Faren + " Grado Fahrenheit");				
	}
	
	public void ConvertirCelsius(double valorRecibidoTemperaruta){
		double Celsius = (valorRecibidoTemperaruta - 32) * 5/9; 
		Celsius = (double) Math.round(Celsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "es" + Celsius + " Grado Celsius");				
	}
}