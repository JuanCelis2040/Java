//Dado el precio de un artıculo, la cantidad de artıculos a comprar y el valor entregado por el cliente, 
//calcular la devuelta (si le alcanza) o imprimir un mensaje que le indique que le hace falta dinero para pagar la cuenta.
import javax.swing.JOptionPane;
public class CantidadArticulo {

	public static void main(String[] args) {
		double articulo,valorCliente,devuelta,falta,totalArticulo;
		int cantidad;
		
		articulo=Double.parseDouble(JOptionPane.showInputDialog("Ingrse el precio del articulo"));
		cantidad=Integer.parseInt(JOptionPane.showInputDialog("Cuantos articulos desea comprar"));
		valorCliente=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantida de dinero que tienee disponible"));
		
		totalArticulo=articulo*cantidad;
		
		if(valorCliente>totalArticulo) {
			devuelta=(totalArticulo-valorCliente)*-1;
			System.out.print("Su devuelta es de:"+devuelta);
		}else if(valorCliente<totalArticulo){
			falta=totalArticulo-valorCliente;
			System.out.print("le hicieron falta:"+falta+" para realizar la compra");
		}
	}

}
