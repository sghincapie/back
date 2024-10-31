package co.com.proyectos.esquivel.service.implementation;



import co.com.proyectos.esquivel.dto.Departamento;
import co.com.proyectos.esquivel.jpa.entity.DepartamentoEntity;
import co.com.proyectos.esquivel.jpa.repository.DepartamentoRepository;
import co.com.proyectos.esquivel.mapper.DepartamentoMapper;
import co.com.proyectos.esquivel.service.IDepartamentoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Clase que implementa las funcionalidades de la interfaz DepartamentoPersistenceOutPort
 *
 * @since 0.0.1
 */
@Slf4j
@Service
public class DepartamentoService implements IDepartamentoService {

  @Autowired
  private DepartamentoMapper departamentoMapper;
  @Autowired
  private DepartamentoRepository departamentoRepository;

  @Override
  public Departamento getDepartamentoById(Long id) throws Exception {
    Optional<DepartamentoEntity> optDepartamento = departamentoRepository.findById(id);
    if (optDepartamento.isPresent()) {
      return departamentoMapper.mapToDto(optDepartamento.get());
    } else {
      log.info("No se encontró el departamento {}", id);
      throw new Exception("No se encontró el departamento " + id);
    }
  }

  @Override
  public List<Departamento> getDepartamentos() throws Exception {
    List<DepartamentoEntity> departamentoEntityList = departamentoRepository.findAll();
    if (departamentoEntityList.isEmpty()) {
      log.info("No se encontraron departamentos");
      throw new Exception("No se encontraron departamentos");
    } else {
      return departamentoMapper.mapToDto(departamentoEntityList);
    }
  }
}
