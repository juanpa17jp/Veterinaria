package co.edu.uniquindio.Clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AgendaCita {

    private LocalDate fecha;
    private LocalTime hora;
    private String motivoConsulta;

    private ArrayList<Mascota> mascotas;
    private ArrayList<Veterinario> veterinarios;

    public AgendaCita(LocalDate fecha, LocalTime hora, String motivoConsulta) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoConsulta = motivoConsulta;

        this.mascotas = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
    } 
    public List<Mascota> getMascotas() { 
        return mascotas; 
    }
    public List<Veterinario> getVeterinarios() { 
        return veterinarios; 
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
}
