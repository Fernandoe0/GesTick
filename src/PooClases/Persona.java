/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooClases;

/**
 *
 * @author BICHO
 */
public abstract class Persona {
    
    private int id;
    private String nombre;
    private String email;
    private String contraseña;
    private Departamento departamento;
    private Rol rol;

    public Persona(int id, String nombre, String email, String contraseña, Departamento departamento, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.departamento = departamento;
        this.rol = rol;
    }

    public abstract void cambiarEstadoTicket(Ticket ticket, EstadoTicket nuevoEstado);
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    
    
    
}
