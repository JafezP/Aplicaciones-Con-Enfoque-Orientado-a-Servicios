package EC1.Rest_FernandezPancorvo.service;

import org.springframework.stereotype.Service;

@Service
public class FundamentosService {
    public String obtenerMesEnLetras(int numeroMes) {
        String[] meses = {
                "Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        if (numeroMes < 1 || numeroMes > 12) {
            return "Número de mes inválido. Debe estar entre 1 y 12.";
        }

        return meses[numeroMes - 1];
    }
}
