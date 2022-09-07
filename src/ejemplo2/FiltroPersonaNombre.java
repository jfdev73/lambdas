package ejemplo2;

import models.Persona;

public class FiltroPersonaNombre implements FiltroPersona {

  private String nombre;

  public FiltroPersonaNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public boolean test(Persona persona) {
    if (persona.getNombre().equals(nombre)) {
      return true;

    }
    return false;
  }

}
