//Modifique el algoritmo anterior para calcular el nuevo salario de un obrero bas�ndose en la siguiente tabla
import javax.swing.JOptionPane;
public class SalarioEmpeado4 {

	public static void main(String[] args) {
		String mensaje,categoria, nombre;
		int cedula;
        double salario, salarioTotal;
        nombre=JOptionPane.showInputDialog("�Cual es su nombre?");
        cedula=Integer.parseInt(JOptionPane.showInputDialog("�Cual es su cedula?"));
        salario=Double.parseDouble(JOptionPane.showInputDialog("Digite su salario"));
        categoria=JOptionPane.showInputDialog("�A que categoria pertenece? recuerde puede ser A,B,C");
        if(categoria.equals("A")) {
        	salarioTotal=salario*0.30+salario;
        	 mensaje= "<<TABLA AUMENTOS>>\n";
         	 mensaje+= "****************************\n";
             mensaje+= "Cedula: "+cedula+"\n";
             mensaje+= "Nombre: "+nombre+"\n";
             mensaje+= "Categoria: "+categoria+"\n";
             mensaje+= "Salario anterior: "+salario+"\n";
             mensaje+= "Salario actual: "+salarioTotal;
             JOptionPane.showInternalMessageDialog(null, mensaje, "INFORMATION_MENSSAGE",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(categoria.equals("B")) {
        	salarioTotal=salario*0.20+salario;
        	 mensaje= "<<TABLA AUMENTOS>>\n";
         	 mensaje+= "****************************\n";
             mensaje+= "Cedula: "+cedula+"\n";
             mensaje+= "Nombre: "+nombre+"\n";
             mensaje+= "Categoria: "+categoria+"\n";
             mensaje+= "Salario anterior: "+salario+"\n";
             mensaje+= "Salario actual: "+salarioTotal;
             JOptionPane.showInternalMessageDialog(null, mensaje, "INFORMATION_MENSSAGE",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(categoria.equals("C")) {
        	salarioTotal=salario*0.10+salario;
        	 mensaje= "<<TABLA AUMENTOS>>\n";
         	 mensaje+= "****************************\n";
             mensaje+= "Cedula: "+cedula+"\n";
             mensaje+= "Nombre: "+nombre+"\n";
             mensaje+= "Categoria: "+categoria+"\n";
             mensaje+= "Salario anterior: "+salario+"\n";
             mensaje+= "Salario actual: "+salarioTotal;
             JOptionPane.showInternalMessageDialog(null, mensaje, "INFORMATION_MENSSAGE",JOptionPane.INFORMATION_MESSAGE);
        } else {
        	JOptionPane.showInternalMessageDialog(null, "Categoria NO valia", "ERROR_MENSSAGE",JOptionPane.ERROR_MESSAGE);
        }
       
	}

}
