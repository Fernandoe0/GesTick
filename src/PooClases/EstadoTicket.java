/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooClases;

/**
 *
 * @author BICHO
 */
public class EstadoTicket {
    private String nombre;
    private String descripcion;
    private boolean estadoFinal;
    private String[] estadosPermitidos;
    private int cantidadEstados;

    public EstadoTicket(String nombre, String descripcion, boolean estadoFinal) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estadoFinal = estadoFinal;
        this.estadosPermitidos = new String[5];
        this.cantidadEstados=0;
    }

 public void agregarEstadoPermitido(String estado){
     if (cantidadEstados < estadosPermitidos.length) {
         estadosPermitidos[cantidadEstados++] = estado;
     }
     
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(boolean estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public String[] getEstadosPermitidos() {
        return estadosPermitidos;
    }

    public void setEstadosPermitidos(String[] estadosPermitidos) {
        this.estadosPermitidos = estadosPermitidos;
    }

    public int getCantidadEstados() {
        return cantidadEstados;
    }

    public void setCantidadEstados(int cantidadEstados) {
        this.cantidadEstados = cantidadEstados;
    }
 
 
}
