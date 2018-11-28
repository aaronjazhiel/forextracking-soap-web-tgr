//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.26 a las 10:08:51 AM CET 
//


package io.spring.guides.gs_producing_web_service;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="TG7065O" type="{http://spring.io/guides/gs-producing-web-service}TG7065O" maxOccurs="unbounded" minOccurs="0"/>
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
    "tg7065O"
})
@XmlRootElement(name = "getTG7065OResponse")
public class GetTG7065OResponse {

    @XmlElement(name = "TG7065O")
    protected List<TG7065O> tg7065O;

    /**
     * Gets the value of the tg7065O property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tg7065O property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTG7065O().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TG7065O }
     * 
     * 
     */
    public List<TG7065O> getTG7065O() {
        if (tg7065O == null) {
            tg7065O = new ArrayList<TG7065O>();
        }
        return this.tg7065O;
    }

    public void setTG7065O(List<TG7065O> TG7065O) {
        this.tg7065O = TG7065O;
    }
}
