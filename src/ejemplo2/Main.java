package ejemplo2;

import java.util.ArrayList;
import java.util.List;

import models.Persona;

public class Main {
  public static void main(String[] args) {

    List<Persona> listaPersonas = new ArrayList<>();
    Persona p = new Persona();
    p.setNombre("juan");
    p.setApellidos("miranda");
    p.setEdad(40);

    Persona p2 = new Persona();
    p2.setNombre("ana");
    p2.setApellidos("martinez");
    p2.setEdad(30);

    Persona p3 = new Persona();
    p3.setNombre("elziabeth");
    p3.setApellidos("hernandez");
    p3.setEdad(20);

    listaPersonas.add(p);
    listaPersonas.add(p2);
    listaPersonas.add(p3);
    List<Persona> nueva = buscarPersonaPorNombre("juan", listaPersonas);
    for (Persona persona : nueva) {
      System.out.println(persona);
    }
  }

  public static List<Persona> buscarPersonaPorNombre(String nombre, List<Persona> miLista) {
    List<Persona> listaFiltro = new ArrayList<>();

    for (Persona p : miLista) {
      if (p.getNombre().equals(nombre)) {
        listaFiltro.add(p);

      }
    }
    return listaFiltro;
  }

}
