import javax.swing.JOptionPane;
public class Restaurante {

	public static void main(String[] args) {
		int codMenuPpal=0, codMenuTipico=0;
		do {
			String menu="MENU RESTAURANTE\n\n";
			menu+="1. Plato Tipico\n";
			menu+="2. Plato a la carta\n";
			menu+="3. Plato Internacional";
			menu+="Salir\n\n";
			menu+="Por favor seleccione una opcion \n";
			
			codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (codMenuPpal) {
			case 1:
			do {
				String menuTipico="MENU TIPICO\n\n";
				menuTipico+="1. Frijoles\n";
				menuTipico+="2. Sopa de Verduras\n";
				menuTipico+="3. Regresar\n\n";
				menuTipico+="Por favor seleccione una opcion\n";
				codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog(menuTipico));
				
				switch (codMenuTipico) {
				case 1:
					JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Frijoles, el costo es de $"+12000);
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, "Se ha solicitado unna Sopa de Verduras, el costo es de $"+8000);

				case 3:
					
					break;
					
				default: JOptionPane.showMessageDialog(null, "No corresponde a " + "un codigo valido",
						"ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
					break;
				}
				
				codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir " +
						"el menu tipico, de lo contrario regrese al menu principal"));
				
				if(codMenuTipico!=1) {
					codMenuTipico=3;
				}
			}while (codMenuTipico!=3);
				
			break;
				
			case 2:
				JOptionPane.showMessageDialog(null, "Menu 2");
				break;
				
			case 3:
				JOptionPane.showMessageDialog(null, "Menu 3");
				break;
				
			case 4:
				JOptionPane.showMessageDialog(null, "Mennu 4");

			default:
				JOptionPane.showMessageDialog(null, "No corresponde a un "+
			           "codigo valido","ADVERTENCIA",
						JOptionPane.WARNING_MESSAGE);
				break;
			}
		}while (codMenuPpal!=4);

	}

}
