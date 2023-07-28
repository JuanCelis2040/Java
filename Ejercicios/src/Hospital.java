//Cree un algoritmo que calcule e imprima lo que debe pagar un paciente 
//a un hospital debido a un tratamiento teniendo como entradas el costo del tratamiento,
//el n�mero de d�as de hospitalizaci�n y el costo de los medicamentos. 
//Cada d�a de hospitalizaci�n cuesta $100000.
//Tenga en cuenta qu� si el paciente es subsidiado se le realizar� un descuento del 10% sobre el valor total del valor a pagar.
//Sino, por motivos de cumplea�os de la empresa, tan solo se descontar� el 5%;

import javax.swing.JOptionPane;
public class Hospital {

	public static void main(String[] args) {
		double costoTratamiento,costoMedicamentos, costoTotal;
        int numeroDias,costoDias;
        String mensaje,subsidio,cumplea�os;
        costoTratamiento= Double.parseDouble(JOptionPane.showInputDialog("Cuanto fue el costo del tratamiento?"));
        costoMedicamentos= Double.parseDouble(JOptionPane.showInputDialog("�De cuanto fue el costo de los tratamientos?"));
        numeroDias= Integer.parseInt(JOptionPane.showInputDialog("�Cuantos dias estuvo hospitalizado?"));
        costoDias= numeroDias*100000;
        costoTotal= costoTratamiento+costoMedicamentos+costoDias;
        subsidio = JOptionPane.showInputDialog("�Es usted subsidiado?, Digite s para si, n para no");
        
        
        if(subsidio=="s") {
        	costoTotal= costoTotal-costoTotal*0.1;
        	
        }
        
        else if(subsidio=="n"){
        	cumplea�os = JOptionPane.showInputDialog("�Usted esta cumpliendo a�os?, Digite s para si, n para no");
        	if(cumplea�os=="s") {
        		costoTotal= costoTotal-costoTotal*0.05;
        	}
        }

        mensaje= "COSTOS:\n";
        mensaje+= "Tratamientos: "+costoTratamiento+"\n";
        mensaje+= "Medicamentos: "+costoMedicamentos+"\n";
        mensaje+= "Dias: "+costoDias+"\n";
        mensaje+= "COSTO TOTAL: "+costoTotal;

        System.out.print(mensaje);

	}

}
