package co.edu.uniquindio.Clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AgendaCita {

    private LocalDate fecha;
    private LocalTime hora;
    private String motivoConsulta;

    private Mascota mascota;
    private Veterinario veterinario;
    private ArrayList<AgendaCita> citas;

    public AgendaCita(LocalDate fecha, LocalTime hora, String motivoConsulta, Mascota mascota, Veterinario veterinario) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoConsulta = motivoConsulta;

        this.mascota = mascota;
        this.veterinario = veterinario;
    } 
    public Mascota getMascota() { 
        return mascota; 
    }

    public void setMascota(Mascota mascota) { 
        this.mascota = mascota; 
    }

    public void setVeterinario(Veterinario veterinario) { 
        this.veterinario = veterinario; 
    }   

    public Veterinario getVeterinario() { 
        return veterinario; 
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public ArrayList<AgendaCita> getCitas() {
        return citas;
    }

    public void agregarCita(AgendaCita cita) {
        citas.add(cita);
    }
}
