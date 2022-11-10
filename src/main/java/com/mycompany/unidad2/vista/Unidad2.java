/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.unidad2.vista;

import com.mycompany.unidad2.modelo.Atencion;
import com.mycompany.unidad2.modelo.Dueño;
import com.mycompany.unidad2.modelo.Mascota;
import com.mycompany.unidad2.modelo.Receta;
import java.time.LocalDate;

/**
 *
 * @author Usuario R
 */
public class Unidad2 {

    public static void main(String[] args) {
        var juana = new Dueño("0104048794", "Juana Moreno Dávila");
        juana.nuevoTelefono("0984357604", 0, "Móvil personal", "Bellsouth");
        juana.nuevoTelefono("072818314", 0, "Casa", "Etapa");
        juana.nuevoTelefono("0984357604", 0, "Móvil de mi esposo", "Movistar");

        System.out.println("juana = " + juana.toString());
        
        var atencion1 = new Atencion(LocalDate.now(),"Dra. Polo", 9.5);
        
        atencion1.nuevaReceta("Paracetamol canino ", 12, " cada 8 horas");
        atencion1.nuevaReceta("Procan vitamina ", 20, "  despues de cada comida");
        
          System.out.println("juana = " + atencion1.toString());
    }
}
