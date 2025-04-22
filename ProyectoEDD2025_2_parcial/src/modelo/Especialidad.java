/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author otjos
 */
public class Especialidad extends Datos implements Serializable
{

    private int numeroCamas;
    private int numeroMedicos;

    public Especialidad(int numeroCamas, int numeroMedicos, String nombre)
    {
        super(nombre, "M");
        this.numeroCamas = numeroCamas;
        this.numeroMedicos = numeroMedicos;
    }

    public int getNumeroCamas()
    {
        return numeroCamas;
    }

    public int getNumeroMedicos()
    {
        return numeroMedicos;
    }

    @Override
    public String toString()
    {
        return super.toString()+ "camas: " + numeroCamas+ "medicos: " + numeroMedicos;
    }
}
