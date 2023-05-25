/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Dependiente extends Empleado implements Atencion{
    Scanner scanner= new Scanner(System.in);
    private String descripcionPuesto;

    public Dependiente( String descripcionPuesto, int cedula, String ubicacion, String nombre) {
        super(cedula, ubicacion, nombre);
        this.descripcionPuesto = descripcionPuesto;

    }


    public String getDescripcionPuesto() {
        return descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
    }


    @Override
    public String toString() {
        return "Descripcion del puesto: " + descripcionPuesto;
    }
    

    @Override
    public void AsignaSalario() {
        int cod=0;
        float mon=0;
        int cant=0;
        Salario salario = new Salario(cod, mon, cant);
        
    }
    
}
