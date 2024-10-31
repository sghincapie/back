package co.com.proyectos.esquivel.configuration;

import co.com.proyectos.esquivel.dto.Departamento;
import co.com.proyectos.esquivel.jpa.entity.DepartamentoEntity;
import co.com.proyectos.esquivel.mapper.DepartamentoMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MapperConfig {

    @Bean
    public DepartamentoMapper departamentoMapper() {
        return new DepartamentoMapper() {
            @Override
            public Departamento mapToDto(DepartamentoEntity entidad) {
                return new Departamento(entidad.getId(),entidad.getNombre());
            }

            @Override
            public List<Departamento> mapToDto(List<DepartamentoEntity> departamentos) {
                if ( departamentos == null ) {
                    return null;
                }

                List<Departamento> list = new ArrayList<Departamento>( departamentos.size() );
                for ( DepartamentoEntity departamentoEntity : departamentos ) {
                    list.add( mapToDto( departamentoEntity ) );
                }

                return list;
            }
        };
    }
}
