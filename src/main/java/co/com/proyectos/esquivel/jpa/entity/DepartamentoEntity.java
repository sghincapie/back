package co.com.proyectos.esquivel.jpa.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * Entidad Departamento. RUNTPROD.PA_DEPARTAME
 *
 * @since 0.0.1
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(schema = "myproject", name = "departamento")
@Data
public class DepartamentoEntity {

  @Id
  @Column(name = "IDDEPARTAMENTO")
  private Long id;

  @Column(name = "NOMBREDEPARTAMENTO")
  private String nombre;
}
