/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_1;

/**
 *
 * @author josep
 */
public class Empleado {
    private int cedula;
    private String ubicacion;
    private String nombre;

    public Empleado(int cedula, String ubicacion, String nombre) {
        this.cedula = cedula;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected String print() {
        return  "Nombre: " + nombre+ ", cedula: " + cedula + ", ubicacion: " + ubicacion ;
    }
}
