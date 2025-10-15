package pe.edu.idat.app_demo_rest.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.app_demo_rest.model.Alumno;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService {

    private List<Alumno> alumnos = new ArrayList<>();
    private int nextCodigo;

    public Alumno agregarAlumno(Alumno alumno) {
        alumno.setCodigo(nextCodigo++);
        alumnos.add(alumno);
        return alumno;
    }

    public Alumno obtenerAlumnoXCodigo(Integer codigo) {
        return alumnos.stream()
                .filter(a -> a.getCodigo().equals(codigo))
                .findFirst().orElse(null);
    }

    public Alumno actualizarAlumno(Integer codigo,
                                   Alumno alumnoActualizacion) {
        Alumno alumno = obtenerAlumnoXCodigo(codigo);
        if(alumno != null) {
            alumno.setNombre(alumnoActualizacion.getNombre());
            alumno.setApellidoPaterno(alumnoActualizacion.getApellidoPaterno());
            alumno.setApellidoMaterno(alumnoActualizacion.getApellidoMaterno());
            alumno.setDni(alumnoActualizacion.getDni());
            alumno.setEdad(alumnoActualizacion.getEdad());
            return alumno;
        }
        return null;
    }
}
