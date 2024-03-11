package co.edu.uniquindio.parcial1fx.appempresa.model;

public class Usuario {
    private int maximoPasajeros;
    private int edad;


    public Usuario() {
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}

