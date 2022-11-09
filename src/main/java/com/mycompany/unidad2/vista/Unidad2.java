/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.unidad2.vista;

import com.mycompany.unidad2.modelo.Atencion;
import com.mycompany.unidad2.modelo.Dueño;
import com.mycompany.unidad2.modelo.Mascota;
import java.time.LocalDate;

/**
 *
 * @author Usuario R
 */
public class Unidad2 {

    public static void main(String[] args) {
       
        var mauricio = new Dueño("0103667754","Mauricio Ortiz",3);
        mauricio.nuevoTelefono("0984357604", 0, "Móvil", "tuenti",0);
        mauricio.nuevoTelefono("074078385",2,"Casa","Etapa",1);
        mauricio.nuevoTelefono("074135250",1287,"Fijo IP","Etapa",2);
        
        //System.out.println(mauricio.toString());
        
        //var receta = new Receta ("Paracetamol canino",28,"Cada 8 horas");
        
        var mcqueen = new Mascota ("Mcqueen","Perro","Grandanes",5.30,mauricio); 
          
        var atencion = new Atencion (LocalDate.now(),"Dra.Polo",30,2);
        
        atencion.nuevaReceta("Paracetamol", 5, "Cada 16 horas" , 0);
        atencion.nuevaReceta("Pro-Can", 12, "Cada 12 horas" , 1);
        
        mauricio.mostrarInfo();
        
        System.out.println(atencion.toString());
        
        
       
        
        
    }
    
   
}
