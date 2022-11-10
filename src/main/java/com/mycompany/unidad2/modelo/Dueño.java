/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad2.modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario R
 */
public class Dueño {

    private String cedula;
    private String nombre;
    private ArrayList<Telefono> telefonoList;

    public Dueño(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefonoList = new ArrayList<>();
    }

    public void nuevoTelefono(String n, int e, String tT, String op) {
        var telefono = new Telefono(n, e, tT, op);
        this.telefonoList.add(telefono);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Telefono> getTelefonoList() {
        return telefonoList;
    }

    public void setTelefonoList(ArrayList<Telefono> telefonoList) {
        this.telefonoList = telefonoList;
    }

    @Override
    public String toString() {
        var retorno = "Dueño{" + "cedula=" + cedula + ", nombre="
                + nombre + "\n";
        /*
        for(var telefono:this.telefonoList){
            retorno+=telefono.toString()+"\n";
        }*/

        for (var i = 0; i < this.telefonoList.size(); i++) {
            retorno += this.telefonoList.get(i) + "\n";
        }

        return retorno;
    }

}
