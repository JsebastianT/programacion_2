package co.edu.uniquindio.parcial1fx.appempresa.factory;

import co.edu.uniquindio.parcial1fx.appempresa.model.builder.AsociadoBuilder;
import co.edu.uniquindio.parcial1fx.appempresa.model.Usuario;
import co.edu.uniquindio.parcial1fx.appempresa.model.VehiculoCarga;
import co.edu.uniquindio.parcial1fx.appempresa.model.VehiculoTransporte;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporteSingleton {

    private static EmpresaTransporteSingleton instance = null;
    private List<AsociadoBuilder> listaAsociados;
    private List<VehiculoCarga> listaVehiculosCarga;
    private List<VehiculoTransporte> listaVehiculosTransporte;
    private List<Usuario> listaUsuarios;

    private EmpresaTransporteSingleton() {
        // Inicializar listas
        listaAsociados = new ArrayList<>();
        listaVehiculosCarga = new ArrayList<>();
        listaVehiculosTransporte = new ArrayList<>();
        listaUsuarios = new ArrayList<>();
    }

    public static EmpresaTransporteSingleton getInstance() {
        if (instance == null) {
            instance = new EmpresaTransporteSingleton();
        }
        return instance;
    }

    // Métodos para agregar a las listas
    public void addAsociado(AsociadoBuilder asociado) {
        listaAsociados.add(asociado);
    }

    public void addVehiculoCarga(VehiculoCarga vehiculoCarga) {
        listaVehiculosCarga.add(vehiculoCarga);
    }

    public void addVehiculoTransporte(VehiculoTransporte vehiculoTransporte) {
        listaVehiculosTransporte.add(vehiculoTransporte);
    }

    public void addUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    // Getters
    public List<AsociadoBuilder> getListaAsociados() {
        return listaAsociados;
    }

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public List<VehiculoTransporte> getListaVehiculosTransporte() {
        return listaVehiculosTransporte;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    // Metodos de prueba

    public void inicializarDatosPrueba() {
        AsociadoBuilder asociado1 = new AsociadoBuilder.Builder()
                .withNombre("Juan")
                .withCedula("123456789")
                .withEmail("juan@example.com")
                .withCelular("3001234567")
                .build();
        addAsociado(asociado1);

        // Crear más datos de prueba...
    }
    public int calcularTotalPasajerosTransportados() {
        int total = 0;
        for (VehiculoTransporte vehiculo : listaVehiculosTransporte) {
            total += vehiculo.getMaximoPasajeros();
        }
        return total;
    }
    public int obtenerNumeroUsuariosPorPlaca(String placa) {
        // Implementar la lógica aquí...
        return 0; // Cambiar esto por el número real de usuarios
    }

    public int obtenerNumeroUsuariosMayoresEdad() {
        int count = 0;
        for (Usuario usuario : listaUsuarios) {
            if (usuario.esMayorDeEdad()) {
                count++;
            }
        }
        return count;
    }
}


