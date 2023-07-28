//Algoritmo que calcule lo que gana un empleado con base a las horas trabajadas  teniendo en cuenta que cada hora se paga a 2000, 
//adicionalmente se le realiza  unos descuentos con respecto a un impuesto de seguridad del 10% sobre su salario.
import javax.swing.JOptionPane;
public class SalarioEmpleado {

	public static void main(String[] args) {
		String mensaje;
        double salario, cantidadHoras, totalHoras, salarioTotal, descuento;
        final int valorHoras =2000;
        salario=Double.parseDouble(JOptionPane.showInputDialog("Digite su salario"));
        cantidadHoras=Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de horas trabajadas"));
        totalHoras= cantidadHoras*valorHoras;
        descuento= (salario+totalHoras)*0.1;
        salarioTotal= salario+totalHoras-descuento;
        mensaje= "SALARIO Y HORAS EXTRA\n";
        mensaje+= "Horas extra trabajadas: "+cantidadHoras+"\n";
        mensaje+= "Valor horas extra: "+totalHoras+"\n";
        mensaje+= "Salario: "+salario+"\n";
        mensaje+= "SALARIO TOTAL: "+salarioTotal;
        System.out.print(mensaje);

	}

}
