package co.edu.uniquindio.biblioteca.model;

public class Libro {
    private String titulo;
    private String autor;
    private String ISBM;
    private String estado;
    private Miembro miembroAsociado;
    private Prestamo prestamoAsociado;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBM() {
        return ISBM;
    }

    public void setISBM(String ISBM) {
        this.ISBM = ISBM;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Miembro getMiembroAsociado() {
        return miembroAsociado;
    }

    public void setMiembroAsociado(Miembro miembroAsociado) {
        this.miembroAsociado = miembroAsociado;
    }

    public Prestamo getPrestamoAsociado() {
        return prestamoAsociado;
    }

    public void setPrestamoAsociado(Prestamo prestamoAsociado) {
        this.prestamoAsociado = prestamoAsociado;
    }
}
