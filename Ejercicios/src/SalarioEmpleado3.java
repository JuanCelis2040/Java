import javax.swing.JOptionPane;

//Modifique el algoritmo anterior para calcular el nuevo salario del obrero basado en un incremento que determina el jefe inmediato.
public class SalarioEmpleado3 {

	public static void main(String[] args) {
		String mensaje;
        double salario, porcentaje, incremento, salarioTotal;
        salario=Double.parseDouble(JOptionPane.showInputDialog("Digite su salario"));
        porcentaje= Double.parseDouble(JOptionPane.showInputDialog("¿De cuando va hacer el incremento?"));
        incremento= porcentaje/100;
        salarioTotal= (salario*incremento)+salario;
        mensaje= "SALARIO CON INCREMENTO\n";
        mensaje+= "Salario actual: "+salario+"\n";
        mensaje+= "Salario con incremento: "+salarioTotal;
        System.out.print(mensaje);

	}

}
