package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas{
	public void ConvertirPesosColombianosADolares(double valor){
		double monedaDolar = valor / 4554.01;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Dolares");				
	}
	
	public void ConvertirPesosColombianosARealBrazileño(double valor){
		double monedaRealBrazileño = valor / 846.52;
		monedaRealBrazileño = (double) Math.round(monedaRealBrazileño * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaRealBrazileño + " Real Brazileño");				
	}
	
	public void ConvertirPesosColombianosAEuros(double valor){
		double monedaEuros = valor / 4354.95;
		monedaEuros = (double) Math.round(monedaEuros * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuros + " Euros");				
	}
	
	public void ConvertirPesosColombianosAYuanChino(double valor){
		double monedaYuanChino = valor / 629.41;
		monedaYuanChino = (double) Math.round(monedaYuanChino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaYuanChino + " Yuan Chino");				
	}
	
	public void ConvertirPesosColombianosADolarCanadience(double valor){
		double monedaDolarCanadience = valor / 3307.78;
		monedaDolarCanadience = (double) Math.round(monedaDolarCanadience * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolarCanadience + " Dolar Canadience");				
	}
	
	public void ConvertirPesosColombianosAWonCoreano(double valor){
		double monedaWonCoreano = valor / 3.16;
		monedaWonCoreano = (double) Math.round(monedaWonCoreano * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaWonCoreano + " Won Coreano");				
	}
}