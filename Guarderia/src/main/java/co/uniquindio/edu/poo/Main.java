package co.uniquindio.edu.poo;

public class Main {
    public static void main(String[] args) {

        Guarderia guarderia = new Guarderia("Pequeños Gigantes");
        Ninio ninio= new Ninio("aris", 4,"1314","M", "Feminas","Pedro Sanchez", "82173298");
        Ninio ninio2= new Ninio("cecha", 4,"1314","M", "Feminas","Pedro Sanchez", "82173298");
        Ninio ninio3 = new Ninio("motas", 4,"1314","M", "Feminas","Pedro Sanchez", "82173298");

        guarderia.almacenarNinio(ninio);
        guarderia.almacenarNinio(ninio2);
        guarderia.almacenarNinio(ninio3);

        System.out.println(guarderia);
    }
}