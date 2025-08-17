package co.edu.uniquindio.Clases;

import java.util.ArrayList;

public class HistoriaClinica {

    private Mascota mascota;
    private ArrayList<Cita> citasTerminadas;
    private ArrayList<AgendaCita> citas;


    public HistoriaClinica(Mascota mascota) {
        this.mascota = mascota;
        this.citasTerminadas = new ArrayList<>();
        this.citas = new ArrayList<>();
        
    }
    public ArrayList<AgendaCita> getCitas() {
        return citas;
    }
    public void setCitas(ArrayList<AgendaCita> citas) {
        this.citas = citas;
    }

    public Mascota getMascota() {
        return mascota;
    }
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    public ArrayList<Cita> getCitasTerminadas() {
        return citasTerminadas;
    }
    public void agregarCita(Cita cita) {
        citasTerminadas.add(cita);
    }
   


}
