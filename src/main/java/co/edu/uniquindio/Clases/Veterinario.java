package co.edu.uniquindio.Clases;

import co.edu.uniquindio.Enums.Especialidad;

public class Veterinario extends Persona {

    private Especialidad especialidad;
    private String IDLicencia;

    public Veterinario(String nombre, String apellido, String id, String direccion, int telefono, Especialidad especialidad, String IDLicencia) {
        super(nombre, apellido, id, direccion, telefono);
        this.especialidad = especialidad;
        this.IDLicencia = IDLicencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getIDLicencia() {
        return IDLicencia;
    }

    public void setIDLicencia(String IDLicencia) {
        this.IDLicencia = IDLicencia;
    }
}
