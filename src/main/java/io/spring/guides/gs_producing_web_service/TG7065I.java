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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TG7065I complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TG7065I">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OPCION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODENTID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NIF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMPERSONA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMOPERA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TG7065I", propOrder = {
    "opcion",
    "codentid",
    "nif",
    "numpersona",
    "numopera"
})
public class TG7065I {

    @XmlElement(name = "OPCION", required = true)
    protected String opcion;
    @XmlElement(name = "CODENTID", required = true)
    protected String codentid;
    @XmlElement(name = "NIF", required = true)
    protected String nif;
    @XmlElement(name = "NUMPERSONA", required = true)
    protected String numpersona;
    @XmlElement(name = "NUMOPERA", required = true)
    protected String numopera;

    /**
     * Obtiene el valor de la propiedad opcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPCION() {
        return opcion;
    }

    /**
     * Define el valor de la propiedad opcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPCION(String value) {
        this.opcion = value;
    }

    /**
     * Obtiene el valor de la propiedad codentid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODENTID() {
        return codentid;
    }

    /**
     * Define el valor de la propiedad codentid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODENTID(String value) {
        this.codentid = value;
    }

    /**
     * Obtiene el valor de la propiedad nif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIF() {
        return nif;
    }

    /**
     * Define el valor de la propiedad nif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIF(String value) {
        this.nif = value;
    }

    /**
     * Obtiene el valor de la propiedad numpersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMPERSONA() {
        return numpersona;
    }

    /**
     * Define el valor de la propiedad numpersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMPERSONA(String value) {
        this.numpersona = value;
    }

    /**
     * Obtiene el valor de la propiedad numopera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMOPERA() {
        return numopera;
    }

    /**
     * Define el valor de la propiedad numopera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMOPERA(String value) {
        this.numopera = value;
    }

}
