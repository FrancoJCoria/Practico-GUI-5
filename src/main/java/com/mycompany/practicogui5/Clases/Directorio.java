/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicogui5.Clases;

import com.mycompany.practicogui5.Clases.Contacto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author FRANCO
 */
public class Directorio {

    TreeMap<Long, Contacto> mapaContactos = new TreeMap<>();

    public void agregarContacto(Contacto nuevoContacto, long telefono) {
        mapaContactos.put(telefono, nuevoContacto);
    }

    public Contacto buscarContacto(long telefono) {
        return mapaContactos.get(telefono);
    }

    public Set<Long> buscarTelefono(String apellido) {
        Iterator<Map.Entry<Long, Contacto>> it = mapaContactos.entrySet().iterator();
        Set<Long> clavesCoincidentes = new HashSet<>();
        while (it.hasNext()) {
            Map.Entry<Long, Contacto> actual = it.next();
            Contacto c = actual.getValue();

            if (c.getApellido().equalsIgnoreCase(apellido)) {
                clavesCoincidentes.add(actual.getKey());
            }

        }
        return clavesCoincidentes;
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
        return listaContactos;
    }

    public void borrarContacto(long telefono) {
        mapaContactos.remove(telefono);
    }

    public TreeMap<Long, Contacto> getMapaContactos() {
        return mapaContactos;
    }
    
   
          
    
}
