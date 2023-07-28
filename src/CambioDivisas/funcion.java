package CambioDivisas;

import javax.swing.JOptionPane;

public class funcion {


	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
	public void ConvertirMonedas(double valor) {
		
		String opcion = (JOptionPane.showInputDialog(null, "Elije la divisa a la que deseas convertir", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Pesos a Franco Suizo",
    			"De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos","De Franco Suizo a Pesos"}, 
    			"Seleccion")).toString();
		
        switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.ConvertirCOP_ADolares(valor);
        	break;
        case "De Pesos a Euro":
        	monedas.ConvertirCOP_AEuros(valor);
        	break;
        case "De Pesos a Libras":
        	monedas.ConvertirCOP_ALibras(valor);
        	break;
        case "De Pesos a Yen":
        	monedas.ConvertirCOP_AYen(valor);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.ConvertirCOP_AWon(valor);
        	break;    	
        case "De Pesos a Franco Suizo":
        	monedas.ConvertirCOP_AFrancoSuizo(valor);
        	break;  
        case "De Dólar a Pesos":
        	pesos.ConvertirDolaresA_COP(valor);
        	break;
        case "De Euro a Pesos":
        	pesos.ConvertirEurosA_COP(valor);
        	break;
        case "De Libras a Pesos":
        	pesos.ConvertirLibrasA_COP(valor);
        	break;
        case "De Yen a Pesos":
        	pesos.ConvertirYenA_COP(valor);
        	break;
        case "De Won Coreano a Pesos":
            pesos.ConvertirWonA_COP(valor);
            break;
        case "De Franco Suizo a Pesos":
            pesos.ConvertirFrancoSuizoA_COP(valor);
            break;
        }      
	}

}
