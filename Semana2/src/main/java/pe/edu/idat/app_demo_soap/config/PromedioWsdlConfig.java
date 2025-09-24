package pe.edu.idat.app_demo_soap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class PromedioWsdlConfig {

    @Bean(name = "promedio")
    public DefaultWsdl11Definition promedioWsdl(
            XsdSchema promedioSchema) {
        DefaultWsdl11Definition wsdl =
                new DefaultWsdl11Definition();
        wsdl.setPortTypeName("promedioPort");
        wsdl.setLocationUri("/ws/promedio");
        wsdl.setTargetNamespace("http://www.idat.edu.pe/ws/promedio");
        wsdl.setSchema(promedioSchema);
        return wsdl;
    }
}
