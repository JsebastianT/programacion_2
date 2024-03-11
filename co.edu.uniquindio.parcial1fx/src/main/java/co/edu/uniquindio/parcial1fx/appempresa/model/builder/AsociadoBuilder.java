package co.edu.uniquindio.parcial1fx.appempresa.model.builder;

public class AsociadoBuilder {
    private String nombre;
    private String cedula;
    private String email;
    private String celular;

    private AsociadoBuilder(Builder builder) {
        this.nombre = builder.nombre;
        this.cedula = builder.cedula;
        this.email = builder.email;
        this.celular = builder.celular;
    }

    public static class Builder {
        private String nombre;
        private String cedula;
        private String email;
        private String celular;

        public Builder withNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder withCedula(String cedula) {
            this.cedula = cedula;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withCelular(String celular) {
            this.celular = celular;
            return this;
        }

        public AsociadoBuilder build() {
            return new AsociadoBuilder(this);
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}

