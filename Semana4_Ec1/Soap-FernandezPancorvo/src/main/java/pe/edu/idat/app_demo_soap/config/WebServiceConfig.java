package pe.edu.idat.app_demo_soap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurer;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig implements WsConfigurer {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet>
        messageDispatcherServlet(ApplicationContext app){
         MessageDispatcherServlet servlet =
         new MessageDispatcherServlet();
         servlet.setApplicationContext(app);
         servlet.setTransformSchemaLocations(true);
         return new ServletRegistrationBean<>(servlet,
                 "/ws/*");
    }
    @Bean
    public XsdSchema operacionesSchema(){
        return new SimpleXsdSchema(
                new ClassPathResource("xsd/operaciones.xsd")
        );
    }

}
