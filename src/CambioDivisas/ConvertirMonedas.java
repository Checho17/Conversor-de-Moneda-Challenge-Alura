package CambioDivisas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirCOP_ADolares(double valor) {
		double monedaDolar = valor / 3940.74;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirCOP_AEuros(double valor) {
		double monedaEuro = valor / 4348.03;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	public void ConvertirCOP_ALibras(double valor) {
		double monedaLibra = valor / 5068.84;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void ConvertirCOP_AYen(double valor) {
		double monedaYen = valor / 28.08;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
	}
	
	public void ConvertirCOP_AWon(double valor) {
		double monedaWon = valor / 3.09;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
	}
	
	public void ConvertirCOP_AFrancoSuizo(double valor) {
		double monedaCHF = valor / 4539.29;
        monedaCHF = (double) Math.round(monedaCHF *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaCHF+ " Francos Suizos");
	}
}

