package infraestructure;

import domain.Paciente;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PacienteRepo implements PanacheRepository<Paciente> {

}
