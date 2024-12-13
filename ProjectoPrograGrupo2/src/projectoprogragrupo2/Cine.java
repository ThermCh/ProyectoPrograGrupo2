package projectoprogragrupo2;

import javax.swing.JOptionPane;

public class Cine {

    //cantidad salas reservadas
    private int salasReservadas;

    //Cantidad de asientos (Trabajadores que vamos a usar)
    private int cantAsientos;

    //Esta relacionado punto anterior 
    private Trabajador trabajadores[];

    //Usamos para salas
    private String salas[][] = {{"L", "L", "L", "L", "L", "L"}, {"L", "L", "L", "L", "L", "L"}, {"L", "L", "L", "L", "L", "L"}, {"L", "L", "L", "L", "L", "L"}, {"L", "L", "L", "L", "L", "L"}};
    private String letras[] = {"A", "B", "C", "D", "E"};
    private String numeros[] = {"1", "2", "3", "4", "5", "6"};

    private String nomPelicula;

    public Cine() {
    }

    public Cine(int salasReservadas, int cantAsientos, Trabajador[] trabajadores, String nomPelicula) {
        this.salasReservadas = salasReservadas;
        this.cantAsientos = cantAsientos;
        this.trabajadores = trabajadores;
        this.nomPelicula = nomPelicula;
    }

    public String getNomPelicula() {
        return nomPelicula;
    }

    public void setNomPelicula() {
        String nombrePeli = JOptionPane.showInputDialog("Cual es el nombre de la pelicula");
        this.nomPelicula = nombrePeli;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos() {
        //Bandera verificar
        boolean bandera = true;
        while (bandera) {
            //Bandera verificar asientos
            boolean bandera1 = true;
            int cantidadAsientos = Integer.parseInt(JOptionPane.showInputDialog("Cual es la cantidad de asientos de la sala"));
            if (cantidadAsientos > 31) {
                JOptionPane.showMessageDialog(null, "No se permiten salas de mas de 30 asientos");
                bandera1 = false;
            }

            if (bandera1) {
                {
                    JOptionPane.showMessageDialog(null, "La sala se creo exitosamente");
                    this.cantAsientos = cantAsientos;
                    bandera = false;
                }

            }
        }
    }

    public void mostrarSalas() {
        String mensaje = "";
        for (int i = 0; i < 5; i++) {
            mensaje += letras[i] + "   ";
            for (int j = 0; j < 6; j++) {
                mensaje += salas[i][j] + "  ";

            }
            mensaje += "\n";

        }
        mensaje += "   ";
        for (int k = 0; k < 6; k++) {
            mensaje += "  " + numeros[k] + "";

        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void ocuparAsientos() {
        boolean bandera = true;
        while (bandera) {
            mostrarSalas();
            String fila = JOptionPane.showInputDialog("Cual es la fila que desea usar");
            int columna = Integer.parseInt(JOptionPane.showInputDialog("Cual es el numero de columna que quiere usar")) - 1;
            int seleccion = 0;
            fila = fila.toUpperCase();
            switch (fila) {
                case "A":
                    seleccion = 0;
                    break;
                case "B":
                    seleccion = 1;
                    break;
                case "C":
                    seleccion = 2;
                    break;
                case "D":
                    seleccion = 3;
                    break;
                case "E":
                    seleccion = 4;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }

            if (columna < 0 || columna >= 6) {
                JOptionPane.showMessageDialog(null, "Columna no valida");
            }

            if (salas[seleccion][columna].equals("O")) {
                JOptionPane.showMessageDialog(null, "El asiento esta ocupado");
            } else {
                salas[seleccion][columna] = "O";
                JOptionPane.showMessageDialog(null, "Asiento guardado");
                bandera = false;
            }
        }
    }

}
