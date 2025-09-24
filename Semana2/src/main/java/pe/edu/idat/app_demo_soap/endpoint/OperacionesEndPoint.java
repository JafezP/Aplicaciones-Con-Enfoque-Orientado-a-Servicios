package pe.edu.idat.app_demo_soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.idat.app_demo_soap.service.OperacionesService;
import pe.edu.idat.ws.operaciones.GetSumaRequest;
import pe.edu.idat.ws.operaciones.GetSumaResponse;

@Endpoint
public class OperacionesEndPoint {

    private final OperacionesService operacionesService;

    private static final String URI_NAMESPACE = "http://www.idat.edu.pe/ws/operaciones";

    public OperacionesEndPoint(OperacionesService operacionesService) {
        this.operacionesService = operacionesService;
    }

    @PayloadRoot(namespace = "URI_NAMESPACE", localPart = "getSumaRequest")
    @ResponsePayload
    public GetSumaResponse getSumaResponse(@RequestPayload
                                           GetSumaRequest request) {
        GetSumaResponse response = new GetSumaResponse();
        response.setResultado(
                operacionesService.suma(request.getNum1(), request.getNum2()));
        return response;
    }


}
