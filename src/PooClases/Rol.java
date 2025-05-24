/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooClases;

/**
 *
 * @author BICHO
 */
public class Rol {
    private int id;
    private String nombre;
    private String[] permisos;
    private int cantidadPermisos;
    
    public Rol(){
        
    }
    
    public Rol(int id) {
        this.id = id;
    }
    public Rol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.permisos = new String[5];
        this.cantidadPermisos = 0;
    }
    

    public void agregarPermiso(String permiso) {
        if (cantidadPermisos < permisos.length) {
            permisos[cantidadPermisos++] = permiso;
        }
    }
    
    public void quitarPermiso(String permiso) {
        for (int i = 0; i < cantidadPermisos; i++) {
            if (permisos[i].equals(permiso)) {
                for (int j = i; j < cantidadPermisos - 1; j++) {
                    permisos[j] = permisos[j + 1];
                }
                cantidadPermisos--;
                break;
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadPermisos() {
        return cantidadPermisos;
    }

    public void setCantidadPermisos(int cantidadPermisos) {
        this.cantidadPermisos = cantidadPermisos;
    }
    
    public String[] getPermisos(){
        return permisos;
    }
    
    public String getNombre() {
        return nombre;
    
    }

    @Override
    public String toString() {
        return "Rol{" + "nombre=" + nombre + '}';
    }
}
