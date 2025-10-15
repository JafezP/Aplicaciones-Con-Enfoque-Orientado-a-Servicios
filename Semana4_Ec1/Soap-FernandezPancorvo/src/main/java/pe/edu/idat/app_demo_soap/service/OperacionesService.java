package pe.edu.idat.app_demo_soap.service;

import org.springframework.stereotype.Service;

@Service
public class OperacionesService {

    public String ejercicio1(int num1, int num2) {
        if (num1 == num2) {
            return "Son iguales, multiplicación = " + (num1 * num2);
        } else if (num1 > num2) {
            return "El primero es mayor, resta = " + (num1 - num2);
        } else {
            return "El primero es menor, suma = " + (num1 + num2);
        }
    }
}
