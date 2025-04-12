/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooClases;

import java.time.LocalDateTime;

/**
 *
 * @author BICHO
 */
public class Nota {
    private String autor;
    private String informacion;
    private LocalDateTime fecha;

    public Nota(String autor, String informacion, LocalDateTime fecha) {
        this.autor = autor;
        this.informacion = informacion;
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    
    
}
