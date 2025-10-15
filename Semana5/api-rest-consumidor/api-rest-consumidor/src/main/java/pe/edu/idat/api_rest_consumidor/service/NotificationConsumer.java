package pe.edu.idat.api_rest_consumidor.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class NotificationConsumer {

    @RabbitListener(queues = "idat-queue")
    public void notificarEmailCliente(String
                                      dniCliente) {
        try {
            System.out.println("Mensaje RabbitMQ Recibido" + LocalDateTime.now());
            TimeUnit.SECONDS.sleep(10);
            System.out.println("Mensaje enviado a su destino");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
