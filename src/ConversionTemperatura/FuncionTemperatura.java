package ConversionTemperatura;

import javax.swing.JOptionPane;


public class FuncionTemperatura {

	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double valorT) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elija una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
        case "Grados Celcius a Grados Farenheit":
        	temperatura.ConvertirCelciusAFarenheit(valorT);
        	break;
        case "Grados Celcius a Kelvin":
            temperatura.ConvertirCelciusAKelvin(valorT);
            break;
        case "Grados Farenheit a Grados Celcius":
           temperatura.ConvertirFarenheitACelcius(valorT);
           break;
        case "Kelvin a Grados Celcius":
           temperatura.ConvertirKelvinACelcius(valorT);
           break;
        case "Kelvin a Grados Farenheit":
        	temperatura.ConvertirKelvinAFarenheit(valorT);
        	break;
        }
	}
}