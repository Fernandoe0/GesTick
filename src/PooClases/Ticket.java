/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooClases;

/**
 *
 * @author BICHO
 */
public class Ticket {
    private int numerTicket;
    private String descripcion;
    private Persona solicitante;
    private EstadoTicket estado;
    private Departamento departamentoAsignado;
    private Nota[] notas;
    private int cantidadNotas;

    public Ticket(int numerTicket, String descripcion, Persona solicitante, EstadoTicket estado) {
        this.numerTicket = numerTicket;
        this.descripcion = descripcion;
        this.solicitante = solicitante;
        this.estado = estado;
        this.notas = new Nota[5];
        this.cantidadNotas = 0;
    }
    
    public void agregarNota(Nota nota) {
        if (cantidadNotas < notas.length) {
            notas[cantidadNotas++] = nota;
        }
    }

    public void asignarDepartamento(Departamento departamento) {
        this.departamentoAsignado = departamento;
       
    }
   
    public void cambiarEstado(EstadoTicket nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public int getNumerTicket() {
        return numerTicket;
    }

    public void setNumerTicket(int numerTicket) {
        this.numerTicket = numerTicket;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public EstadoTicket getEstado() {
        return estado;
    }

    public void setEstado(EstadoTicket estado) {
        this.estado = estado;
    }

    public Departamento getDepartamentoAsignado() {
        return departamentoAsignado;
    }

    public void setDepartamentoAsignado(Departamento departamentoAsignado) {
        this.departamentoAsignado = departamentoAsignado;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

    public int getCantidadNotas() {
        return cantidadNotas;
    }

    public void setCantidadNotas(int cantidadNotas) {
        this.cantidadNotas = cantidadNotas;
    }
    
    
}
