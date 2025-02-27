package co.uniquindio.edu.poo;

import java.util.ArrayList;
import java.util.List;

public class Guarderia {
    private String Nombres;
    private List<Ninio> ListNinios;

    public Guarderia(String nombres) {
        this.Nombres = nombres;
        this.ListNinios = new ArrayList<>();
    }

    public void almacenarNinio(Ninio ninio) {
        this.ListNinios.add(ninio);
    }

    @Override
    public String toString() {
        return "Guarderia{" +
                "Nombres='" + Nombres + '\'' +
                ", ListNinios=" + ListNinios +
                '}';
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public List<Ninio> getListNinios() {
        return ListNinios;
    }

    public void setListNinios(List<Ninio> listNinios) {
        ListNinios = listNinios;
    }

}
