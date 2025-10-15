package pe.edu.idat.api_rest_consumidor.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String EXCHANGE
            = "idat-exchange";

    public static final String ROUTING_KEY
            = "idat-route";

    public static final String QUEUE
            = "idat-queue";

    @Bean
    TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }

    @Bean
    Queue queue() {
        return new Queue(QUEUE, true);
    }

    @Bean
    Binding binding(Queue queue,
                    TopicExchange exchange) {
        return BindingBuilder.bind(queue)
                .to(exchange).with(ROUTING_KEY);
    }
}
