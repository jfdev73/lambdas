package ejemplo2;

import java.util.ArrayList;
import java.util.List;

import models.Persona;

public class Main2 {
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
    p3.setNombre("elizabeth");
    p3.setApellidos("hernandez");
    p3.setEdad(20);

    listaPersonas.add(p);
    listaPersonas.add(p2);
    listaPersonas.add(p3);
    List<Persona> nueva = buscarPersonaConFiltro(new FiltroPersonaNombre("elizabeth"), listaPersonas);
    for (Persona persona : nueva) {
      System.out.println(persona);
    }
  }

  public static List<Persona> buscarPersonaConFiltro(FiltroPersona filtro, List<Persona> miLista) {
    List<Persona> listaFiltro = new ArrayList<>();

    for (Persona p : miLista) {
      if (filtro.test(p)) {
        listaFiltro.add(p);

      }
    }
    return listaFiltro;
  }

}
