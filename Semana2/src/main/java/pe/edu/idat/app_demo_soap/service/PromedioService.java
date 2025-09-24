package pe.edu.idat.app_demo_soap.service;

import org.springframework.stereotype.Service;

@Service
public class PromedioService {

    public String promedio(int num1, int num2) {
        return "El promedio es: " + ((num1 + num2) / 2);
    }
}
