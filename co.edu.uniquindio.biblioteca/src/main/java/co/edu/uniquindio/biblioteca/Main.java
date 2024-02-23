package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Biblioteca;
import co.edu.uniquindio.biblioteca.model.Bibliotecario;
import co.edu.uniquindio.biblioteca.model.Libro;

public class Main {
    public static void main(String[] args) {
       Biblioteca biblioteca = incializarDatos();

    }

    private static Biblioteca incializarDatos() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNombre("Pepito");

        Bibliotecario bibliotecario1 = new Bibliotecario();
        bibliotecario1.setNombre("Hugo");
        biblioteca.getListaEmpleados().add(bibliotecario1)

        Libro libro1 = new Libro();
        libro1.setTitulo("Mil y una noche");
        libro1.setAutor("Sebastián Torres");
        libro1.setISBM("34567");
        libro1.setEstado("Ocupado");
        biblioteca.getListaLibros().add(libro1);




    }
}