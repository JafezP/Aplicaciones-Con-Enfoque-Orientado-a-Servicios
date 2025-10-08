package pe.edu.idat.app_demo_soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.idat.app_demo_soap.service.OperacionesService;
import pe.edu.idat.ws.operaciones.GetEjercicio1Request;
import pe.edu.idat.ws.operaciones.GetEjercicio1Response;


@Endpoint
public class OperacionesEndPoint {

    private final OperacionesService operacionesService;

    private static final String URI_NAMESPACE = "http://www.idat.edu.pe/ws/operaciones";

    public OperacionesEndPoint(
            OperacionesService operacionesService) {
        this.operacionesService = operacionesService;
    }

    @PayloadRoot(namespace = URI_NAMESPACE, localPart = "getEjercicio1Request")
    @ResponsePayload
    public GetEjercicio1Response getEjercicio1(@RequestPayload GetEjercicio1Request request) {
        GetEjercicio1Response response = new GetEjercicio1Response();
        response.setResultado(
                operacionesService.ejercicio1(request.getNum1(), request.getNum2())
        );
        return response;
    }
}
