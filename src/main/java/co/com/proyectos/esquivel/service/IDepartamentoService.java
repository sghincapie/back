package co.com.proyectos.esquivel.service;


import co.com.proyectos.esquivel.dto.Departamento;

import java.util.List;

/**
 * Interfaz con todos los métodos disponibles para gestionar Departamentos
 *
 * @since 0.0.1
 */
public interface IDepartamentoService {

  /**
   * Método encargado de obtener departamento por ID
   *
   * @param id Identificador único del departamento
   * @return Información del departamento
   * @since 0.0.1
   */
  public Departamento getDepartamentoById(Long id) throws Exception;


  /**
   * Método encargado de listar departamentos
   *
   * @return Lista de departamentos
   * @throws Exception Error cuando no se pueden consultar los departamentos
   * @since 0.0.1
   */
  public List<Departamento> getDepartamentos() throws Exception;

}
