package CambioDivisas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	public void ConvertirDolaresA_COP(double valor) {
		double monedaDolar = valor * 3940.74;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Colombianos");
	}
	
	public void ConvertirEurosA_COP(double valor) {
		double monedaEuro = valor * 4348.03;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Colombianos");
	}
	
	public void ConvertirLibrasA_COP(double valor) {
		double monedaLibra = valor * 5068.84;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Colombianos");
	}
	
	public void ConvertirYenA_COP(double valor) {
		double monedaYen = valor * 28.08;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Colombianos");
	}
	
	public void ConvertirWonA_COP(double valor) {
		double monedaWon = valor * 3.09;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Colombianos");
	}
	
	public void ConvertirFrancoSuizoA_COP(double valor) {
		double monedaCHF = valor* 4539.29;
        monedaCHF = (double) Math.round(monedaCHF *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaCHF+ " Francos Suizos");
	}
}
