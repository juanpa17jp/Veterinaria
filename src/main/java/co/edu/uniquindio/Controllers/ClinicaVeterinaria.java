package co.edu.uniquindio.Controllers;
import co.edu.uniquindio.Clases.Mascota;
import co.edu.uniquindio.Clases.PersonalApoyo;
import co.edu.uniquindio.Clases.Propietario;
import co.edu.uniquindio.Clases.Veterinario;
import co.edu.uniquindio.Enums.Especialidad;
import co.edu.uniquindio.Clases.AgendaCita;
import co.edu.uniquindio.Clases.HistoriaClinica;
import co.edu.uniquindio.Clases.Cita;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;


public class ClinicaVeterinaria {

    private String nombre;
    private String direccion;
    private String id;

    private ArrayList<Mascota> mascotas;
    private ArrayList<Propietario> propietarios;
    private ArrayList<Veterinario> veterinarios;
    private ArrayList<PersonalApoyo> trabajadores;
    private ArrayList<AgendaCita> citas;
    private ArrayList<HistoriaClinica> historiasClinicas;
    private ArrayList<Cita> citasTerminadas;
    



    public ClinicaVeterinaria(String nombre, String direccion, String id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;

        this.mascotas = new ArrayList<>();
        this.propietarios = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
        this.trabajadores = new ArrayList<>();
        this.citas = new ArrayList<>(); 
        this.historiasClinicas = new ArrayList<>();
        this.citas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(ArrayList<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(ArrayList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    public ArrayList<PersonalApoyo> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<PersonalApoyo> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public ArrayList<AgendaCita> getCitas() {
        return citas;
    }

    public boolean registrarMascota(String nombre, String especie, String raza, int edad, String id, String cedulaPropietario) {

        Propietario propietario = buscarPropietario(cedulaPropietario);

        if(propietario == null){
            return false;
        }

        for (Mascota mascotaExistente : mascotas) {
            if (mascotaExistente.getID().equals(id)) {
                return false;
            }
        }

        Mascota nuevaMascota = new Mascota(nombre, especie, raza, edad, id, propietario);
        mascotas.add(nuevaMascota);
        return true;
    }

    public Propietario buscarPropietario(String cedulaPropietario) {
        Propietario propietarioEncontrado = null;
        for (Propietario propietario : propietarios) {
            if (propietario.getId().equals(cedulaPropietario)) {
                propietarioEncontrado = propietario;
            }
        }
        return propietarioEncontrado;
    }

    public boolean registrarPropietario(String nombre, String apellido, String id, String direccion, int telefono) {

        for (Propietario propietarioExistente : propietarios) {
            if (propietarioExistente.getId().equals(id)) {
                return false;
            }
        }

        Propietario nuevoPropietario = new Propietario(nombre, apellido, id, direccion, telefono);
        propietarios.add(nuevoPropietario);
        return true;
    }


    public boolean registrarPersonalApoyo(String nombre, String apellido, String id, String direccion, int telefono) {

        for (PersonalApoyo trabajadorExistente : trabajadores) {
            if (trabajadorExistente.getId().equals(id)) {
                return false;
            }
        }

        PersonalApoyo nuevoPersonalApoyo = new PersonalApoyo(nombre, apellido, id, direccion, telefono);
        trabajadores.add(nuevoPersonalApoyo);
        return true;
    }

    public boolean registrarVeterinario(String nombre, String apellido, String id, String direccion, int telefono, Especialidad especialidad, String IDLicencia) {

        for (Veterinario veterinarioExistente : veterinarios) {
            if (veterinarioExistente.getId().equals(id)) {
                return false;
            }
        }

        Veterinario nuevoVeterinario = new Veterinario(nombre, apellido, id,direccion,telefono,especialidad,IDLicencia);
        veterinarios.add(nuevoVeterinario);
        return true;
    }

    // Metodo para buscar mascota por ID
    public Mascota buscarMascota(String idMascota) {
        for (Mascota mascota : mascotas) {
            if (mascota.getID().equals(idMascota)) {
                return mascota;
            }
        }
        return null;
    }

    // Metodo para buscar veterinario por cédula
    public Veterinario buscarVeterinario(String cedulaVeterinario) {
        for (Veterinario veterinario : veterinarios) {
            if (veterinario.getId().equals(cedulaVeterinario)) {
                return veterinario;
            }
        }
        return null;
    }

    // Metodo para agendar una cita
    public boolean agendarCita(String idMascota, String cedulaVeterinario, String motivoConsulta, String fecha, String hora) {

        Mascota mascota = buscarMascota(idMascota);
        Veterinario veterinario = buscarVeterinario(cedulaVeterinario);

        if (mascota == null || veterinario == null) {
            return false;
        }

        // Verificar disponibilidad del veterinario en la fecha y hora especificadas
        boolean veterinarioDisponible = citas.stream().anyMatch(cita ->
            cita.getFecha().equals(LocalDate.parse(fecha)) &&
            cita.getHora().equals(LocalTime.parse(hora)) &&
            cita.getVeterinarios().contains(veterinario)
        );

        AgendaCita nuevaCita = new AgendaCita(LocalDate.parse(fecha), LocalTime.parse(hora), motivoConsulta);
        nuevaCita.getMascotas().add(mascota);
        nuevaCita.getVeterinarios().add(veterinario);

        return true;
    }

    // Metodo para obtener todas las citas agendadas en una fecha específica
    public ArrayList<AgendaCita> obtenerCitasPorFecha(String fecha) {
        ArrayList<AgendaCita> citasEnFecha = new ArrayList<>();
        LocalDate fechaConsulta = LocalDate.parse(fecha);

        for (AgendaCita cita : citas) {
            if (cita.getFecha().equals(fechaConsulta)) {
                citasEnFecha.add(cita);
            }
        }
        return citasEnFecha;
    }

    // Metodo para guardar todas las citas de una mascota en su historia clínica
   public void guardarCitaEnHistoriaClinica(String idMascota,Cita cita) {
        Mascota mascota = buscarMascota(idMascota);
        if (mascota == null) throw new IllegalArgumentException("Mascota no encontrada");

        HistoriaClinica historia = historiasClinicas.stream()

            .filter(h -> h.getMascota().getID().equals(idMascota))
            .findFirst()
            .orElseGet(() -> {

                HistoriaClinica nuevaHistoria = new HistoriaClinica(mascota);
                historiasClinicas.add(nuevaHistoria);
                return nuevaHistoria;
            });

        historia.agregarCita(cita);
        }
    }

    // Funcionalidad unica   
    //Metodo que permite enviar recordatorios de las citas agendadas a los propietarios de las mascotas





