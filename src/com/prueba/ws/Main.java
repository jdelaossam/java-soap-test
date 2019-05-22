/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.ws;

import javax.xml.ws.Endpoint;

/**
 *
 * @author jonathan.delaossa
 */
public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9091/WS/Usuarios", new UsuariosImpl());
    }
}
