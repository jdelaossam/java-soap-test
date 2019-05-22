/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.ws;

import com.prueba.ws.entities.Usuarios;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface UsuariosWs {

    @WebMethod
    public String crearUsuario(String nombre, String lastname, String email);

    @WebMethod
    public List<Usuarios> listarUsuarios();
}
