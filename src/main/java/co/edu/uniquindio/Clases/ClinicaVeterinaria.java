package co.edu.uniquindio.Clases;


import co.edu.uniquindio.Enums.Especialidad;

import java.util.ArrayList;


public class ClinicaVeterinaria {

    private String nombre;
    private String direccion;
    private String id;

    private ArrayList<Mascota> mascotas;
    private ArrayList<Propietario> propietarios;
    private ArrayList<Veterinario> veterinarios;
    private ArrayList<PersonalApoyo> trabajadores;


    public ClinicaVeterinaria(String nombre, String direccion, String id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;

        this.mascotas = new ArrayList<>();
        this.propietarios = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
        this.trabajadores = new ArrayList<>();

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

    public boolean registrarMascota(String nombre, String especie, String raza, int edad, String id, Propietario propietario) {

        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío");
            return false;
        }

        if (id == null || id.trim().isEmpty()) {
            System.out.println("Error: El ID no puede estar vacío");
            return false;
        }

        for (Mascota mascotaExistente : mascotas) {
            if (mascotaExistente.getID().equals(id)) {
                System.out.println("Error: Ya existe una mascota con ID: " + id);
                return false;
            }
        }

        Mascota nuevaMascota = new Mascota(nombre, especie, raza, edad, id, propietario);
        mascotas.add(nuevaMascota);
        System.out.println("Mascota registrada exitosamente: " + nombre);
        return true;
    }

    public boolean registrarPropietario(String nombre, String id, String direccion, int telefono) {

        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío");
            return false;
        }

        if (id == null || id.trim().isEmpty()) {
            System.out.println("Error: El ID no puede estar vacío");
            return false;
        }

        for (Propietario propietarioExistente : propietarios) {
            if (propietarioExistente.getId().equals(id)) {
                System.out.println("Error: Ya existe una mascota con ID: " + id);
                return false;
            }
        }

        Propietario nuevoPropietario = new Propietario(nombre, id, direccion, telefono);
        propietarios.add(nuevoPropietario);
        System.out.println("Propietario registrado exitosamente: " + nombre);
        return true;
    }

    public boolean registrarPersonalApoyo(String nombre, String id, String direccion, int telefono) {

        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío");
            return false;
        }

        if (id == null || id.trim().isEmpty()) {
            System.out.println("Error: El ID no puede estar vacío");
            return false;
        }

        for (PersonalApoyo trabajadorExistente : trabajadores) {
            if (trabajadorExistente.getId().equals(id)) {
                System.out.println("Error: Ya existe una mascota con ID: " + id);
                return false;
            }
        }

        PersonalApoyo nuevoPersonalApoyo = new PersonalApoyo(nombre, id, direccion, telefono);
        trabajadores.add(nuevoPersonalApoyo);
        System.out.println("Propietario registrado exitosamente: " + nombre);
        return true;
    }

    public boolean registrarVeterinario(String nombre, String id, String direccion, int telefono, Especialidad especialidad, String IDLicencia) {

        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío");
            return false;
        }

        if (id == null || id.trim().isEmpty()) {
            System.out.println("Error: El ID no puede estar vacío");
            return false;
        }

        if (IDLicencia == null || IDLicencia.trim().isEmpty()) {
            System.out.println("Error: La licencia Profesional no puede estar vacío");
            return false;
        }

        for (Veterinario veterinarioExistente : veterinarios) {
            if (veterinarioExistente.getId().equals(id)) {
                System.out.println("Error: Ya existe una mascota con ID: " + id);
                return false;
            }
        }

        Veterinario nuevoVeterinario = new Veterinario(nombre,id,direccion,telefono,especialidad,IDLicencia);
        veterinarios.add(nuevoVeterinario);
        System.out.println("Propietario registrado exitosamente: " + nombre);
        return true;
    }

}



