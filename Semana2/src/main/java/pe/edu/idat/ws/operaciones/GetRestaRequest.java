//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.idat.ws.operaciones;

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
 *         <element name="num1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="num2" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "num1",
    "num2"
})
@XmlRootElement(name = "getRestaRequest")
public class GetRestaRequest {

    protected int num1;
    protected int num2;

    /**
     * Obtiene el valor de la propiedad num1.
     * 
     */
    public int getNum1() {
        return num1;
    }

    /**
     * Define el valor de la propiedad num1.
     * 
     */
    public void setNum1(int value) {
        this.num1 = value;
    }

    /**
     * Obtiene el valor de la propiedad num2.
     * 
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Define el valor de la propiedad num2.
     * 
     */
    public void setNum2(int value) {
        this.num2 = value;
    }

}
