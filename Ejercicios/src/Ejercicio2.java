import javax.swing.JOptionPane;
public class Ejercicio2 {

	public static void main(String[] args) {
		double precio, precioFinal;
		final double descuento=0.1;
		
		precio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
		
		if(precio >=50.000) {
			double des = precio * descuento;
			precioFinal = precio - des;
			JOptionPane.showInternalMessageDialog(null,"El precio final del producto es de:" + precioFinal,
					"INFORMATION_MENSSAGE",
					JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showInternalMessageDialog(null, "El descuento no aplica para productos con precio menor a  $50.000",
					"INFORMATION_MENSSAGE",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
