package co.com.proyectos.esquivel.jpa.repository;

import co.com.proyectos.esquivel.jpa.entity.DepartamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio que contiene todas las operaciones necesarias para gestionar la información de la
 * entidad departamento
 *
 * @since 0.0.1
 */
@Repository
public interface DepartamentoRepository extends JpaRepository<DepartamentoEntity, Long> {}
