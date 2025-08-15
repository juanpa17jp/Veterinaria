package co.edu.uniquindio.Clases;

public class ConsultaMedica {

    private AgendaCita agenda;
    private String diagnostico;

    public ConsultaMedica(AgendaCita agenda, String diagnostico) {
        this.agenda = agenda;
        this.diagnostico = diagnostico;
    }

    public AgendaCita getAgenda() {
        return agenda;
    }

    public void setAgenda(AgendaCita agenda) {
        this.agenda = agenda;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
