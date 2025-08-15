package co.edu.uniquindio.Clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class AgendaCita {
    private LocalDate fecha;
    private LocalTime hora;
    private String motivoConsulta;

    public AgendaCita(LocalDate fecha, LocalTime hora, String motivoConsulta) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoConsulta = motivoConsulta;
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
