/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_1;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Tarea_1 {

    public static void main(String[] args) {
        String Inge;
        String depen;
        String ub;
        String tele;
        int ced;
        String desc;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Crear Dependiente");
            System.out.println("2. Crear Ingeniero");
            System.out.println("3. Recibe Salario por Ingeniero");
            System.out.println("4. Recibe Salario por Dependiente");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para crear un dependiente
                    
                    System.out.println("Ingrese el nombre del dependiente: ");
                    depen= scanner.next();
                    System.out.println("Ingrese la cedula del dependiente: ");
                    ced= scanner1.nextInt();
                    System.out.println("Ingrese la descripcion del puesto: ");
                    desc= scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese la ubicacion: ");
                    ub= scanner.nextLine();
                    System.out.println("Un momento por favor...");
                    Dependiente dependiente = new Dependiente(desc, ced, ub, depen);
                    dependiente.setNombre(depen);
                    dependiente.setCedula(ced);
                    dependiente.setDescripcionPuesto(desc);
                    dependiente.setUbicacion(ub);                    
                    System.out.println("Creando un dependiente...");
                    System.out.println("Nombre: "+dependiente.getNombre()+" Cedula: "+dependiente.getCedula()+" Descripcion del puesto: "+ dependiente.getDescripcionPuesto()+" Ubicacion: "+ dependiente.getUbicacion());
                    
                    break;
                case 2:
                    // Lógica para crear un ingeniero
                    System.out.println("Ingrese el nombre del Ingeniero: ");
                    Inge= scanner.next();
                    System.out.println("Ingrese la cedula del Ingeniero: ");
                    ced= scanner1.nextInt();
                    System.out.println("Ingrese el telefono: ");
                    tele= scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese la ubicacion: ");
                    ub= scanner.nextLine();
                    System.out.println("Un momento por favor...");
                    Ingeniero ingeniero = new Ingeniero(tele, ced, ub, Inge);
                    ingeniero.setNombre(Inge);
                    ingeniero.setCedula(ced);
                    ingeniero.setUbicacion(ub);
                    ingeniero.setTelefono(tele);
                    System.out.println("Creando un ingeniero...");
                    System.out.println("Nombre: "+ingeniero.getNombre()+" Cedula: "+ingeniero.getCedula()+" Telefono: "+ ingeniero.getTelefono()+" Ubicacion: "+ ingeniero.getUbicacion());
                    break;
                case 3:
                    // Lógica para recibir salario por ingeniero
                    System.out.println("Recibiendo salario por ingeniero...");
                    break;
                case 4:
                    // Lógica para recibir salario por dependiente
                    System.out.println("Recibiendo salario por dependiente...");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }

}
