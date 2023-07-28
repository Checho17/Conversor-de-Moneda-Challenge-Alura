package main;

import CambioDivisas.funcion;
import ConversionTemperatura.FuncionTemperatura;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		funcion monedas = new funcion();
		FuncionTemperatura tempratura = new FuncionTemperatura();
		
		
		while(true) {
			
			String menu = (JOptionPane.showInputDialog(null, "Selecciona una opción de conversión:", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Seleccione un conversor...","Conversor de Monedas", "Conversor de Temperatura"},"Seleccion")).toString();
						
			switch (menu) {
			
			//Caso de no seleccion
			case "Seleccione un conversor...":
				JOptionPane.showMessageDialog(null,"Primero debe seleccionar el convesor a usar!","Alerta",JOptionPane.ERROR_MESSAGE);
			break;
			
			//Caso de conversor de Monedas
			case "Conversor de Monedas":
       		 String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
       		 
                if(ValidarNumero(input) == true) {
                    double Minput = Double.parseDouble(input);
                    monedas.ConvertirMonedas(Minput);

                    int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == respuesta){
                    	System.out.println("Selecciona opción Afirmativa");
                    }else{
                       	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                    }

                   } else {
                       JOptionPane.showMessageDialog(null, "Valor inválido");                
                   }
                break;
                
			//Caso de conversor de temperatura
			case "Conversor de Temperatura":
       		 String input_temp = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
       		 
                if(ValidarNumero(input_temp) == true) {
                    double temp = Double.parseDouble(input_temp);
                    tempratura.ConvertirTemperatura(temp);

                    int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == respuesta){
                    	System.out.println("Selecciona opción Afirmativa");
                    }else{
                       	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                    }

                   } else {
                       JOptionPane.showMessageDialog(null, "Valor inválido");                
                   }
                break;						
			}
		}
		break;
	}

	//Metodo Validación	
	private static boolean ValidarNumero(String input) {
		try {
            double n = Double.parseDouble(input);
            if(n >= 0 || n < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}

