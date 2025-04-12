/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooClases;

/**
 *
 * @author BICHO
 */
public class Empresa {
    private String nombre;
    private String logo;
    private String idioma;
    private String zonaHoraria;
    private int tiempoTickets;
    private String[] nivelesPrioridadTicket;
    private int cantidadNiveles;

    public Empresa(String nombre, String logo, String idioma, String zonaHoraria, int tiempoTickets) {
        this.nombre = nombre;
        this.logo = logo;
        this.idioma = idioma;
        this.zonaHoraria = zonaHoraria;
        this.tiempoTickets = tiempoTickets;
        this.nivelesPrioridadTicket = new String[5];
        this.cantidadNiveles = 0;
    }
    
    public void agregarNivelPrioridad(String nivel) {
        if (cantidadNiveles < nivelesPrioridadTicket.length) {
            nivelesPrioridadTicket[cantidadNiveles++] = nivel;
        }
    }
    
    public void mostrarInformacion() {
        System.out.println("Sistema: " + nombre);
        System.out.println("Idioma: " + idioma);
        System.out.println("Zona Horaria: " + zonaHoraria);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getZonaHoraria() {
        return zonaHoraria;
    }

    public void setZonaHoraria(String zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public int getTiempoTickets() {
        return tiempoTickets;
    }

    public void setTiempoTickets(int tiempoTickets) {
        this.tiempoTickets = tiempoTickets;
    }

    public String[] getNivelesPrioridadTicket() {
        return nivelesPrioridadTicket;
    }

    public void setNivelesPrioridadTicket(String[] nivelesPrioridadTicket) {
        this.nivelesPrioridadTicket = nivelesPrioridadTicket;
    }

    public int getCantidadNiveles() {
        return cantidadNiveles;
    }

    public void setCantidadNiveles(int cantidadNiveles) {
        this.cantidadNiveles = cantidadNiveles;
    }
    
    
}
