import javax.swing.JOptionPane;
public class lavaAutos {

	public static void main(String[] args) {
			int codigoMenuP=0, codigoAuto=0, codigoCampe=0, codigoCamio=0;
			String menu="", menuAuto="",menuCampe="", menuCamio="";
			
			do {
				menu="";
				menu+="Menu LavaAutos\n\n";
				menu+="1. Automovil\n";
				menu+="2. Campero\n";
				menu+="3. Camioneta\n";
				menu+="4. Salir\n";
				
				codigoMenuP=Integer.parseInt(JOptionPane.showInputDialog(menu));
				
				switch (codigoMenuP) {
				case 1:
					do {
						menuAuto="Menu Automoviles\n";
						menuAuto+="1. Peque�o\n";
						menuAuto+="2. Mediano\n";
						menuAuto+="3. De lojo\n";
						menuAuto+="4. Regresar\n";
						
						codigoAuto=Integer.parseInt(JOptionPane.showInputDialog(menuAuto));
						
						switch (codigoAuto) {
						case 1: JOptionPane.showMessageDialog(null, "Se ha seleccionado tipo de auto peque�o tendra un costo de $"+4000); break;
						case 2: JOptionPane.showMessageDialog(null, "Se ha seleccionado tipo de auto mediano, tendra un costo de $"+5000); break;
						case 3: JOptionPane.showMessageDialog(null, "Se ha seleccionado tipo de auto de lujo tendra un costo de $"+6000); break;
						case 4: break;

						default:
							JOptionPane.showMessageDialog(null, "No corresponde a "+ "un codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
							break;
						}if(codigoAuto!=1) {
							codigoAuto=3;
						}
						
					}while(codigoAuto!=4);
					break;
					
				case 2:
					do {
						menuCampe="Menu Campero\n\n";
						menuCampe+="Sencillo\n";
						menuCampe+="de lujo\n";
						menuCampe+="Regresar";
						
						codigoCampe=Integer.parseInt(JOptionPane.showInputDialog(menuCampe));
						
						switch (codigoCampe) {
						case 1: JOptionPane.showMessageDialog(null, "Se ha seleccionado tipo de campero sencillo tendra un costo de $"+5000); break;
						case 2: JOptionPane.showMessageDialog(null, "SE ha seleccionado tipio de Campero de lujo tendra un costo de $"+8000); break;
						case 3: break;

						default:
							JOptionPane.showMessageDialog(null , "No corresponde a " + "un codigo valido","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
							break;
						}if(codigoCampe!=1) {
							codigoCampe=2;
						}
					}while(codigoCampe!=4);
					break;
					
				case 3:
					do {
						menuCamio="Menu Camioneta\n\n";
						menuCamio+="1. Cabina sencilla\n";
						menuCamio+="2. Doble cabina\n";
						menuCamio+="Regresar";
						
						codigoCamio=Integer.parseInt(JOptionPane.showInputDialog(menuCamio));
						
						switch (codigoCamio) {
						case 1: JOptionPane.showMessageDialog(null, "Se ha seleccionado tipo de camioneta de cabina sencilla tendra un costo de $"+6000); break;
						case 2: JOptionPane.showMessageDialog(null, "Se ha seleccionado tipo de camioneta de doble cabina tendra un costo de $"+8000); break;	

						default:
							JOptionPane.showMessageDialog(null, "No corresponde a" + "un codigo valido","ADVERTENCIA", JOptionPane.WARNING_MESSAGE );
							break;
						}
						
					}while(codigoCamio!=3);
					
					break;
				default:
					break;
				}
				
			}while (codigoMenuP!=4);

	}

}
