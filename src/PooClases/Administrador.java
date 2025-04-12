/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooClases;

/**
 *
 * @author BICHO
 */
public class Administrador extends Persona {

    public Administrador(int id, String nombre, String email, String contraseña, Departamento departamento, Rol rol) {
        super(id, nombre, email, contraseña, departamento, rol);
    }

    @Override
    public void cambiarEstadoTicket(Ticket ticket, EstadoTicket nuevoEstado) {
        ticket.cambiarEstado(nuevoEstado);
        System.out.println("Admin. cambió el estado a: " + nuevoEstado.getNombre());
    }

   
   
}
