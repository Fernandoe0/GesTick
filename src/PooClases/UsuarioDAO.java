/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PooClases;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author BICHO
 */
public class UsuarioDAO {
   // INSERTAR usuario
    public void insertar(Persona persona) {
        String sql = "INSERT INTO usuario (nombre, correo, contraseña, rol_id, departamento_id) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getEmail());
            stmt.setString(3, persona.getContraseña());
            stmt.setInt(4, persona.getRol().getId());
            stmt.setInt(5, persona.getDepartamento().getId());

            stmt.executeUpdate();
            System.out.println("Usuario insertado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // BUSCAR usuario por ID
    public Persona buscarPorId(int id) {
        String sql = "SELECT * FROM usuario WHERE id_usuario = ?";
        Persona persona = null;

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Rol rol = new Rol();
                rol.setId(rs.getInt("rol_id"));

                Departamento depto = new Departamento();
                depto.setId(rs.getInt("departamento_id"));

                persona = new Persona(
                    rs.getInt("id_usuario"),
                    rs.getString("nombre"),
                    rs.getString("correo"),
                    rs.getString("contraseña"),
                    depto,
                    rol
                ) {
                    @Override
                    public void cambiarEstadoTicket(Ticket ticket, EstadoTicket nuevoEstado) {
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                };
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persona;
    }

    // LISTAR todos los usuarios
    public List<Persona> listarTodos() {
        String sql = "SELECT * FROM usuario";
        List<Persona> lista = new ArrayList<>();

        try (Connection conn = ConexionBD.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Rol rol = new Rol();
                rol.setId(rs.getInt("rol_id"));

                Departamento depto = new Departamento();
                depto.setId(rs.getInt("departamento_id"));

                Persona persona;
                persona = new Persona(
                        rs.getInt("id_usuario"),
                        rs.getString("nombre"),
                        rs.getString("correo"),
                        rs.getString("contraseña"),
                        depto,
                        rol
                ) {
                    @Override
                    public void cambiarEstadoTicket(Ticket ticket, EstadoTicket nuevoEstado) {
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                };

                lista.add(persona);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // ACTUALIZAR usuario
    public void actualizar(Persona persona) {
        String sql = "UPDATE usuario SET nombre = ?, correo = ?, contraseña = ?, rol_id = ?, departamento_id = ? WHERE id_usuario = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getEmail());
            stmt.setString(3, persona.getContraseña());
            stmt.setInt(4, persona.getRol().getId());
            stmt.setInt(5, persona.getDepartamento().getId());
            stmt.setInt(6, persona.getId());

            stmt.executeUpdate();
            System.out.println("Usuario actualizado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ELIMINAR usuario
    public void eliminar(int id) {
        String sql = "DELETE FROM usuario WHERE id_usuario = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Usuario eliminado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
}
