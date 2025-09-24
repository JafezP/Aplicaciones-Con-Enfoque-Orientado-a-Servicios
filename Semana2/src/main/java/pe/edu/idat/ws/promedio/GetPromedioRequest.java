//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.idat.ws.promedio;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ec1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ec2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ec3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ecf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ec1",
    "ec2",
    "ec3",
    "ecf"
})
@XmlRootElement(name = "getPromedioRequest")
public class GetPromedioRequest {

    protected int ec1;
    protected int ec2;
    protected int ec3;
    protected int ecf;

    /**
     * Obtiene el valor de la propiedad ec1.
     * 
     */
    public int getEc1() {
        return ec1;
    }

    /**
     * Define el valor de la propiedad ec1.
     * 
     */
    public void setEc1(int value) {
        this.ec1 = value;
    }

    /**
     * Obtiene el valor de la propiedad ec2.
     * 
     */
    public int getEc2() {
        return ec2;
    }

    /**
     * Define el valor de la propiedad ec2.
     * 
     */
    public void setEc2(int value) {
        this.ec2 = value;
    }

    /**
     * Obtiene el valor de la propiedad ec3.
     * 
     */
    public int getEc3() {
        return ec3;
    }

    /**
     * Define el valor de la propiedad ec3.
     * 
     */
    public void setEc3(int value) {
        this.ec3 = value;
    }

    /**
     * Obtiene el valor de la propiedad ecf.
     * 
     */
    public int getEcf() {
        return ecf;
    }

    /**
     * Define el valor de la propiedad ecf.
     * 
     */
    public void setEcf(int value) {
        this.ecf = value;
    }

}
