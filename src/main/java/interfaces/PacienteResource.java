package interfaces;

import java.util.List;

import application.PacienteRepresentation;
import application.PacienteService;
import domain.Paciente;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

@Path("/pacientes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PacienteResource {

    @Inject
    private PacienteService service;

    @Inject
    UriInfo info;

    @GET
    @Path("")
    public List<Paciente> listarTodos() {
        // Paciente paciente = this.service.buscarPorId(null)
        return this.service.obtenerTodos();
    }

    // @GET
    // @Path("")
    // public List<application.PacienteRepresentation> listarTodoss() {
    //     // Paciente paciente = this.service.buscarPorId(null)
    //     Paciente paciente = this.service.buscarPorId(1);

    //     String selfLink = info.getAbsolutePathBuilder().build().toString();
    //     return new List<application.PacienteRepresentation>() {
            
    //     };application.PacienteRepresentation(
    //             paciente.getId(),
    //             paciente.getNombre(),
    //             paciente.getApellido(),
    //             paciente.getDireccion(),
    //             paciente.getFechaNacimiento(),
    //             selfLink);
    // }

    @GET
    @Path("{id}")
    public application.PacienteRepresentation buscarPorId(@PathParam("id") Integer id) {
        Paciente paciente = this.service.buscarPorId(id);
        if (paciente == null)
            return null;
        String selfLink = info.getAbsolutePathBuilder().build().toString();
        return new application.PacienteRepresentation(
                paciente.getId(),
                paciente.getNombre(),
                paciente.getApellido(),
                paciente.getDireccion(),
                paciente.getFechaNacimiento(),
                selfLink);
    }
}
