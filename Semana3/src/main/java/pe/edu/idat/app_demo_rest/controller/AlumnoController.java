package pe.edu.idat.app_demo_rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.app_demo_rest.dto.ResponseDto;
import pe.edu.idat.app_demo_rest.model.Alumno;
import pe.edu.idat.app_demo_rest.service.AlumnoService;

@RestController
@RequestMapping("/api/alumno")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @PostMapping
    public ResponseEntity<Alumno> agregarAlumno(
          @RequestBody Alumno alumno) {
        alumnoService.agregarAlumno(alumno);
        //ResponseDto dto = new ResponseDto();
        //dto.setMensaje("Alumno agregado correctamente");
        return ResponseEntity.ok(alumno);
    }

    @PutMapping("/{codAlumno}")
    public ResponseEntity<Alumno> actualizarAlumno(
            @PathVariable Integer codAlumno,
            @RequestBody Alumno alumno) {
        //ResponseDto dto = new ResponseDto();
        //dto.setMensaje("Alumno actualizado correctamente");
        return ResponseEntity.ok(
                alumnoService.actualizarAlumno(codAlumno, alumno));
    }
}
