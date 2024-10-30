package co.com.proyectos.esquivel.configuration;

import co.com.proyectos.esquivel.dto.Departamento;
import co.com.proyectos.esquivel.jpa.entity.DepartamentoEntity;
import co.com.proyectos.esquivel.mapper.DepartamentoMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public DepartamentoMapper departamentoMapper() {
        return new DepartamentoMapper() {
            @Override
            public Departamento mapToDto(DepartamentoEntity entidad) {
                return new Departamento(entidad.getId(),entidad.getNombre());
            }
        };
    }
}
