package com.pruebas.ws.dao;

import com.prueba.ws.controller.UsuariosJpaController;
import com.prueba.ws.entities.Usuarios;
import java.util.List;

/**
 *
 * @author jonathan.delaossa
 */
public class UsuariosDAO {

    private UsuariosJpaController usrctrl = new UsuariosJpaController();
    private Usuarios user = new Usuarios();

    public String insertar(String nombre, String lastname, String email) {
        String message = "Usuario guardado";
        try {
            user.setNombre(nombre);
            user.setLastname(lastname);
            user.setEmail(email);
            usrctrl.create(user);
        } catch (Exception e) {
            System.out.println("Error en guardar usuario " + e.getMessage());
            message = "Ocurrio un error al guardar los datos";
        }

        return message;
    }

    public List<Usuarios> listarUsuarios() {
        return usrctrl.findUsuariosEntities();
    }

    public void actualizar(String nombre, String apellidos, String correo) {
    }

    public void eliminar(String correo) {
    }
}
