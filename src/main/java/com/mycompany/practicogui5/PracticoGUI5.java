/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicogui5;


import com.mycompany.practicogui5.Clases.Directorio;
import com.mycompany.practicogui5.Clases.Contacto;
import com.mycompany.practicogui5.Forms.VistaPrincipal;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author FRANCO
 */
public class PracticoGUI5 {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);

            }
          });
         TreeSet<Contacto> setContactos = new TreeSet<>();
        Scanner consola = new Scanner(System.in);
        Contacto contacto1 = new Contacto(45801072,"Franco","Coria","Villa Mercedes","Juan Llerena 37");
        Contacto contacto2 = new Contacto(43451072,"Carlos","Aguero","Villa Mercedes","Balcarce 1200");
        Contacto contacto3 = new Contacto(33848316,"Lara","Sanchez","Chazon","Villa Urquiza 789");
        Contacto contacto4 = new Contacto(14035468,"Luciana","Migliavacca","Merlo","Pedernera 302");

        VistaPrincipal.directorio.agregarContacto(contacto1,265724680);
        VistaPrincipal.directorio.agregarContacto(contacto2,265728072);
        VistaPrincipal.directorio.agregarContacto(contacto3,265724689);
        VistaPrincipal.directorio.agregarContacto(contacto4,265724606);
        System.out.println(VistaPrincipal.directorio.buscarContacto(265724680).getNombre());
        System.out.println(VistaPrincipal.directorio.buscarTelefono("Coria"));
        for(Contacto c : VistaPrincipal.directorio.BuscarContactos("Villa Mercedes")){
            System.out.println("DNI: "+c.getDNI()+" - Nombre: "+c.getNombre());
        }
        VistaPrincipal.directorio.borrarContacto(265724680);
        System.out.println(VistaPrincipal.directorio.buscarContacto(265724680));
    }
    
}
