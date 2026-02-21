package application;

import java.util.List;

import domain.Paciente;
import infraestructure.PacienteRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PacienteService {

    @Inject
    private PacienteRepo repo;

    public List<Paciente> obtenerTodos() {
        return this.repo.findAll().list();
    }

    public Paciente buscarPorId(Integer id) {
        return this.repo.findById(id.longValue());
    }

        /**
         * Obtiene el paciente actual (mock).
         */
        public Paciente obtenerPacienteActual() {
            // Aquí normalmente se obtendría el usuario autenticado
            // Por ahora, devolvemos un paciente mock (id=1)
            return buscarPorId(1);
        }
}
