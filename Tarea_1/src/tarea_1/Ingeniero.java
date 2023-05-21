/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1;

/**
 *
 * @author josep
 */
public class Ingeniero extends Empleado implements Atencion{
    private String telefono;

    public Ingeniero(String telefono, int cedula, String ubicacion, String nombre) {
        super(cedula, ubicacion, nombre);
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "telefono: " + telefono;
    }

    @Override
    public void AsignaSalario() {
        
    }
    
}
