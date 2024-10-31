package co.com.proyectos.esquivel.controller;

import co.com.proyectos.esquivel.dto.Departamento;
import co.com.proyectos.esquivel.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Clase donde se implementan servicios REST para la gestión de departamentos
 *
 * @since 0.0.1
 */
@RestController
@RequestMapping("departamentos")
public class DepartamentoController {

  @Autowired private IDepartamentoService iDepartamentoService;

  /**
   * Servicio para obtener todos los departamentos
   *
   * @return Lista de departamentos
   */
  @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  @CrossOrigin(origins = "http://localhost:4200")
  public ResponseEntity<Departamento> obtenerDepartamentoId(@PathVariable Long id)
          throws Exception {
    return new ResponseEntity<>(iDepartamentoService.getDepartamentoById(id), HttpStatus.OK);
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  @CrossOrigin(origins = "http://localhost:4200")
  public ResponseEntity<List<Departamento>> getDepartamentos()
          throws Exception {
    return new ResponseEntity<>(iDepartamentoService.getDepartamentos(), HttpStatus.OK);
  }
}
