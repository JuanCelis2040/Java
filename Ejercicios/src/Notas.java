//Dadas tres notas de un estudiante, calcular la definitiva por promedio aritmético y un mensaje que indique si gano o perdió el curso. 
//La nota mínima necesaria para aprobar es 3.0.
import javax.swing.JOptionPane;
public class Notas {

	public static void main(String[] args) {
		double nota1,nota2,nota3;
		final double promedio;
		
		nota1=Double.parseDouble(JOptionPane.showInputDialog("Digite la primera nota"));
		nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite la segunda nota"));
		nota3=Double.parseDouble(JOptionPane.showInputDialog("Digite la tercera nota"));
		
		promedio = (nota1+nota2+nota3)/3;
		
		if(promedio>=3.0) {
			System.out.print("El estudiante aprobo con una nota de:"+promedio);
		}else {
			System.out.print("El estudiante reprobo con una nota de:"+promedio);
		}
	}

}
