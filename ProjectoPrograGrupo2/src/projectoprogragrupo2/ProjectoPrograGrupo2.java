package projectoprogragrupo2;

import javax.swing.JOptionPane;

public class ProjectoPrograGrupo2 {

    public static void main(String[] args) {
        //Llamamos a gym
        Gimnasio gim = new Gimnasio();
        Barista barista = new Barista();
        //Precargamos informacion de trabajador en lista
        Trabajador trabajador1[] = new Trabajador[7];
        trabajador1[0] = new Trabajador("Mike", "It", "1");
        trabajador1[1] = new Trabajador("Juan", "It", "2");
        trabajador1[2] = new Trabajador("Hernest", "It", "3");
        trabajador1[3] = new Trabajador("Sofia", "It", "4");
        trabajador1[4] = new Trabajador("Juliana", "It", "5");
        trabajador1[5] = new Trabajador("Fernanda", "It", "6");
        trabajador1[6] = new Trabajador("Bravo", "It", "7");

        //Ciclo de menu
        int opcion = 0;
        boolean ciclo = true;
        while (ciclo) {
            //Continuar
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Hola que desea hacer:" + "\n1.Ver gimnasio\n" + "2.Barista"));
            switch (opcion) {
                case 1:
                    int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("1.Ver reservaciones\n" + "2.Hacer reservaciones\n" + "3.Cambiar reservacion\n" + "4.Eliminar reservacion"));
                    switch (opcion1) {
                        case 1:
                            gim.verReservaciones();
                            break;
                        case 2:
                            gim.hacerReservacion(trabajador1);
                            break;
                        case 3:
                            gim.modificarReserva(trabajador1);
                            break;
                        case 4:
                            gim.eliminarReserva();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion no valida");
                            break;
                    }
                    break;
                case 2:
                    int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("1.Ver bebidas asignadas\n" + "2.Asignar bebida\n" + "3.Cambiar bebida\n" + "4.Eliminar bebida reservada"));
                    switch (opcion2) {
                        case 1:
                            barista.mostrarReservas();
                            break;
                        case 2:
                            barista.reservarBebida(trabajador1);
                            break;
                        case 3:
                            barista.cambiarBebida();
                            break;
                        case 4:
                            barista.eliminarReserva();
                            break;
                    }
                    break;

            }

        }

    }

}
