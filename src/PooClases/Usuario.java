/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooClases;

/**
 *
 * @author BICHO
 */
public class Usuario extends Persona {
    private Ticket[] ticketsCreados;
    private int cantidadCreados;

    public Usuario(int id, String nombre, String email, String contraseña, Departamento departamento, Rol rol) {
        super(id, nombre, email, contraseña, departamento, rol);
        this.ticketsCreados = new Ticket [5];
        this.cantidadCreados = 0;
    }

    public Ticket[] getTicketsCreados() {
        return ticketsCreados;
    }

    public void setTicketsCreados(Ticket[] ticketsCreados) {
        this.ticketsCreados = ticketsCreados;
    }

    public int getCantidadCreados() {
        return cantidadCreados;
    }

    public void setCantidadCreados(int cantidadCreados) {
        this.cantidadCreados = cantidadCreados;
    }

    @Override
    public void cambiarEstadoTicket(Ticket ticket, EstadoTicket nuevoEstado){
        if (nuevoEstado.getNombre().equals("Cerrado")) {
            ticket.cambiarEstado(nuevoEstado);
            System.out.println("Usuario final Cerró el Ticket");
            
        } else {
            System.out.println("El usuario no puede cambiar el estado a: " + nuevoEstado.getNombre());
        }
    }



    
}
