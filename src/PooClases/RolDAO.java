/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import PooClases.ConexionBD;
import PooClases.Rol;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RolDAO {

    // Crear nuevo rol
    public void insertar(Rol rol) {
        String sql = "INSERT INTO rol (nombre) VALUES (?)";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, rol.getNombre());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Actualizar nombre de rol por ID
    public void actualizar(Rol rol) {
        String sql = "UPDATE rol SET nombre = ? WHERE id_rol = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, rol.getNombre());
            stmt.setInt(2, rol.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Eliminar rol por ID
    public void eliminar(int id) {
        String sql = "DELETE FROM rol WHERE id_rol = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Buscar un rol por su ID
    public Rol buscarPorId(int id) {
        String sql = "SELECT * FROM rol WHERE id_rol = ?";
        Rol rol = null;

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                rol = new Rol(id, nombre); // usar constructor de 2 parámetros
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rol;
    }

    // Listar todos los roles
    public List<Rol> listarTodos() {
        List<Rol> lista = new ArrayList<>();
        String sql = "SELECT * FROM rol";

        try (Connection conn = ConexionBD.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id_rol");
                String nombre = rs.getString("nombre");
                Rol rol = new Rol(id, nombre);
                lista.add(rol);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
