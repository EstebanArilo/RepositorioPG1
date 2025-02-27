package co.uniquindio.edu.poo;


import java.util.Scanner;

public class Estudiante{

    String nombre;
    String apellido;
    int edad;
    String correo;
    String telefono;

    public Estudiante(String nombre, String apellido, int edad, String correo){

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void datosEstudiante(){

        System.out.println ("Ingrese el nombre del estudiante: " + nombre);
        System.out.println ("Ingrese el apellido del estudiante: " + apellido);
        System.out.println ("Ingrese el edad del estudiante: " + edad);
        System.out.println ("Ingrese el correo del estudiante: " + correo);
        System.out.println ("Ingrese el telefono del estudiante: " + telefono);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del estudiante: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el edad del estudiante: ");
        int edad = scanner.nextLine();

        System.out.println("Ingrese el correo del estudiante: ");
        String correo = scanner.nextLine();

        System.out.println("Ingrese el telefono del estudiante: ");
        String telefono = scanner.nextLine();

        Estudiante estudiante = new Estudiante (nombre, apellido, edad, correo, telefono);

        estudiante.datosEstudiante();

        scanner.close();
    }

}



