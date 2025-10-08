package pe.edu.idat.app_demo_soap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class OperacionesWsdlConfig {

    @Bean(name = "operaciones")
    public DefaultWsdl11Definition operacionesWsdl(
            XsdSchema operacionesSchema){
        DefaultWsdl11Definition wsdl =
                new DefaultWsdl11Definition();
        wsdl.setPortTypeName("OperacionesPort");
        wsdl.setLocationUri("/ws/operaciones");
        wsdl.setTargetNamespace("http://www.idat.edu.pe/ws/operaciones");
        wsdl.setSchema(operacionesSchema);
        return wsdl;
    }

}
