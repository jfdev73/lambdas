package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
  private String nombre;

  private String apellidos;

  private int edad;

  

  @Override
  public String toString() {
    return "Persona [apellidos=" + apellidos + ", edad=" + edad + ", nombre=" + nombre + "]";
  }

}
