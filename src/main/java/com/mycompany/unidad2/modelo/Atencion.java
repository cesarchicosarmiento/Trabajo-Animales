/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad2.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Usuario R
 */
public class Atencion {

    private LocalDate fecha;
    private String veterinario;
    private double costo;
    private ArrayList<Receta> recetaList;

    public Atencion(LocalDate fecha, String veterinario, double costo) {
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.costo = costo;
        this.recetaList = new ArrayList<>();
    }

    public Atencion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void nuevaReceta(String medicamento, int cantidad, String indicacion) {
        var receta = new Receta(medicamento, cantidad, indicacion);
        this.recetaList.add(receta);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public ArrayList<Receta> getRecetaList() {
        return recetaList;
    }

    public void setRecetaList(ArrayList<Receta> recetaList) {
        this.recetaList = recetaList;
    }

    @Override
    public String toString() {
        var retorno = "Atencion{" + "fecha=" + fecha + ", veterinario=" +
                veterinario + ", costo=" + costo + ", recetaList=" + recetaList + '}';
        for (var receta : this.recetaList) {
            retorno += receta.toString() + "\n";
        }
        return retorno;

    }

}
