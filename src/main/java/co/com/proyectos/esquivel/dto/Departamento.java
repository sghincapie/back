package co.com.proyectos.esquivel.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO Departamento donde se definen atributos a utilizar en la aplicación.
 *
 * @since 0.0.1
 */
@Getter
@Setter
@ToString
public class Departamento {
  private Long id;
  private String nombre;

  public Departamento(Long id, String nombre) {
    this.id = id;
    this.nombre = nombre;
  }
}
