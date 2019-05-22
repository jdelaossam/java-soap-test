/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.ws;

import com.prueba.ws.entities.Usuarios;
import com.pruebas.ws.dao.UsuariosDAO;
import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "com.prueba.ws.UsuariosWs")
public class UsuariosImpl implements UsuariosWs {

    private UsuariosDAO conn = new UsuariosDAO();

    @Override
    public String crearUsuario(String nombre, String lastname, String email) {
        return this.conn.insertar(nombre, lastname, email);
    }

    @Override
    public List<Usuarios> listarUsuarios() {
        return this.conn.listarUsuarios();
    }
}
