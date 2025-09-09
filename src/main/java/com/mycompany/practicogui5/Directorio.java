/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicogui5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author FRANCO
 */
public class Directorio {

    Scanner consola = new Scanner(System.in);
    TreeMap<Long, Contacto> mapaContactos;

    public void agregarContacto(Contacto nuevoContacto) {
        System.out.println("Ingrese el numero de telefono");
        long telefono = consola.nextLong();
        mapaContactos.put(telefono, nuevoContacto);
    }

    public Contacto buscarContacto(long telefono) {
        return mapaContactos.get(telefono);
    }

    public Set<Long> buscarTelefono(String apellido) {
        Iterator<Map.Entry<Long, Contacto>> it = mapaContactos.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Long, Contacto> actual = it.next();
            Contacto c = actual.getValue();

            if (c.getApellido().equalsIgnoreCase(apellido)) {
                return mapaContactos.keySet();
            }

        }
        return null;
    }

    public ArrayList<Contacto> BuscarContactos(String ciudad) {
        ArrayList<Contacto> listaContactos = new ArrayList<>();
        Iterator<Map.Entry<Long, Contacto>> it = mapaContactos.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Long, Contacto> actual = it.next();
            Contacto c = actual.getValue();

            if (c.getCiudad().equalsIgnoreCase(ciudad)) {
                listaContactos.add(c);
            }
        }
        return null;
    }
    
    public void borrarContacto(long telefono){
        mapaContactos.remove(telefono);
    }

}
