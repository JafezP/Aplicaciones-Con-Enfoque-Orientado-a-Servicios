package pe.edu.idat.api_rest_productor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.api_rest_productor.service.NotificationService;

@RestController
@RequestMapping("/api/v1/notification")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/email")
    public ResponseEntity<String> notificarCliente(
            @RequestParam String dniCliente
    ) {
        notificationService.notificarUsuario(dniCliente);
        return ResponseEntity.ok("Proceso Terminado");
    }
}
