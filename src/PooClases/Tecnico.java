/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooClases;

/**
 *
 * @author BICHO
 */
public class Tecnico extends Persona {

    public Tecnico(int id, String nombre, String email, String contraseña, Departamento departamento, Rol rol) {
        super(id, nombre, email, contraseña, departamento, rol);
    }

    @Override
    public void cambiarEstadoTicket(Ticket ticket, EstadoTicket nuevoEstado) {
        String estado = nuevoEstado.getNombre();
        if (estado.equals("En Proceso")|| estado.equals("Resuelto")) {
            ticket.cambiarEstado(nuevoEstado);
            System.out.println("El Ticket cambió a: " + estado);
        } else {
            System.out.println("No es posible cambiar el estado del Ticket");
        }
    }

   
    
}
