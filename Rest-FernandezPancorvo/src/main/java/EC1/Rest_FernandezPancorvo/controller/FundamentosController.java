package EC1.Rest_FernandezPancorvo.controller;

import EC1.Rest_FernandezPancorvo.dto.MesDto;
import EC1.Rest_FernandezPancorvo.service.FundamentosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/operaciones")
public class FundamentosController {

    private final FundamentosService fundamentosService;

    public FundamentosController(FundamentosService fundamentosService) {
        this.fundamentosService = fundamentosService;
    }

    @GetMapping("/mes")
    public ResponseEntity<MesDto> obtenerMes(@RequestParam Integer numero) {
        MesDto mesDto = new MesDto();
        mesDto.setNumeroMes(numero);
        mesDto.setNombreMes(fundamentosService.obtenerMesEnLetras(numero));

        return ResponseEntity.ok(mesDto);
    }
}
