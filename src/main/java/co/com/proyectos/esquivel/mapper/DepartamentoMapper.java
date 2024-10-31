package co.com.proyectos.esquivel.mapper;


import co.com.proyectos.esquivel.dto.Departamento;
import co.com.proyectos.esquivel.jpa.entity.DepartamentoEntity;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface DepartamentoMapper {

  /**
   * Método que permite mappear un objeto DepartamentoEntity a Departamento
   *
   * @param entidad Objeto entity DepartamentoEntity
   * @return Departamento
   */
  Departamento mapToDto(DepartamentoEntity entidad);


  List<Departamento> mapToDto(List<DepartamentoEntity> departamentos);
}
