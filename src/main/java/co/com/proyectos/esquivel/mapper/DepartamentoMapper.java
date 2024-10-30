package co.com.proyectos.esquivel.mapper;


import co.com.proyectos.esquivel.dto.Departamento;
import co.com.proyectos.esquivel.jpa.entity.DepartamentoEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface DepartamentoMapper {

  /**
   * Método que permite mappear un objeto DepartamentoEntity a Departamento
   *
   * @param entidad Objeto entity DepartamentoEntity
   * @return Departamento
   */
  Departamento mapToDto(DepartamentoEntity entidad);
}
