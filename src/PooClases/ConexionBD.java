/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooClases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author BICHO
 */
public class ConexionBD {
    private static final String URL = "jdbc:postgresql://dpg-d05g5j2li9vc738p2q3g-a.oregon-postgres.render.com:5432/gestick";
    private static final String USUARIO = "gestick_user";
    private static final String CONTRASENA = "vEsssiIHfeXvBAfXHTjTYhP71yV3jT1i";
    
    public static Connection conectar() {
        try {
            return (Connection) DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return null;
        
    }

}
