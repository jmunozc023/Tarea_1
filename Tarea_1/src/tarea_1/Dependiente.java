/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1;

/**
 *
 * @author santi
 */
public class Dependiente extends Empleado implements Atencion{
    private String descripcionPuesto;

    public Dependiente(String descripcionPuesto, int cedula, String ubicacion, String nombre) {
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
