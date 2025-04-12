/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooClases;

/**
 *
 * @author BICHO
 */
public class Departamento {
    private String nombre;
    private String descripcion;
    private Persona[] empleados;
    private int cantidadEmpleados;

    public Departamento(String nombre, String descripcion, Persona[] empleados, int cantidadEmpleados) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.empleados = new Persona[10];
        this.cantidadEmpleados = 0;
    }

     public void agregarUsuario(Persona usuario) {
        if (cantidadEmpleados< empleados.length) {
            empleados[cantidadEmpleados++] = usuario;
        }
   
     }
     
     public void quitarUsuario(String usuario) {
        for (int i = 0; i < cantidadEmpleados; i++) {
            if (empleados[i].equals(empleados)) {
                for (int j = i; j < cantidadEmpleados - 1; j++) {
                    empleados[j] = empleados[j + 1];
                }
                cantidadEmpleados--;
                break;
            }
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

    public Persona[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Persona[] empleados) {
        this.empleados = empleados;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }
     
     public Persona [] listarUsuarios() {
         return empleados;
     }
}
