package co.edu.uniquindio.biblioteca.model;

import java.time.LocalDate;

public class Prestamo {
    private String numeroPrestamo;
    private Libro libroAsociado;
    private Miembro miembroAsociado;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public Libro getLibroAsociado() {
        return libroAsociado;
    }

    public void setLibroAsociado(Libro libroAsociado) {
        this.libroAsociado = libroAsociado;
    }

    public Miembro getMiembroAsociado() {
        return miembroAsociado;
    }

    public void setMiembroAsociado(Miembro miembroAsociado) {
        this.miembroAsociado = miembroAsociado;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
