//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.28 a las 05:14:57 PM CET 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TG7065I" type="{http://spring.io/guides/gs-producing-web-service}TG7065I"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tg7065I"
})
@XmlRootElement(name = "getTG7065IRequest")
public class GetTG7065IRequest {

    @XmlElement(name = "TG7065I", required = true)
    protected TG7065I tg7065I;

    /**
     * Obtiene el valor de la propiedad tg7065I.
     * 
     * @return
     *     possible object is
     *     {@link TG7065I }
     *     
     */
    public TG7065I getTG7065I() {
        return tg7065I;
    }

    /**
     * Define el valor de la propiedad tg7065I.
     * 
     * @param value
     *     allowed object is
     *     {@link TG7065I }
     *     
     */
    public void setTG7065I(TG7065I value) {
        this.tg7065I = value;
    }

}
