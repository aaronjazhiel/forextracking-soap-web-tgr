//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.26 a las 10:08:51 AM CET 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TG7065O complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TG7065O">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GLOBALID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODPROOP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESPRODO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECALTA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECVTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMOPERA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPNOMINAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODIDIVI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPPRIMA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIVPRIMA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMPNOMVEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIVNOMVEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INDCOMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INDCALPUT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRANOPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NIVBARR1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIPBARR1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NIVBARR2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIPBARR2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NUMESTRAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TG7065O", propOrder = {
    "globalid",
    "codproop",
    "desprodo",
    "fecalta",
    "fecvto",
    "numopera",
    "impnominal",
    "codidivi",
    "impprima",
    "divprima",
    "impnomven",
    "divnomven",
    "indcomp",
    "indcalput",
    "tranope",
    "nivbarr1",
    "tipbarr1",
    "nivbarr2",
    "tipbarr2",
    "numestrat"
})
public class TG7065O {

    @XmlElement(name = "GLOBALID", required = true)
    protected String globalid;
    @XmlElement(name = "CODPROOP", required = true)
    protected String codproop;
    @XmlElement(name = "DESPRODO", required = true)
    protected String desprodo;
    @XmlElement(name = "FECALTA", required = true)
    protected String fecalta;
    @XmlElement(name = "FECVTO", required = true)
    protected String fecvto;
    @XmlElement(name = "NUMOPERA", required = true)
    protected String numopera;
    @XmlElement(name = "IMPNOMINAL", required = true)
    protected String impnominal;
    @XmlElement(name = "CODIDIVI", required = true)
    protected String codidivi;
    @XmlElement(name = "IMPPRIMA", required = true)
    protected String impprima;
    @XmlElement(name = "DIVPRIMA", required = true)
    protected String divprima;
    @XmlElement(name = "IMPNOMVEN", required = true)
    protected String impnomven;
    @XmlElement(name = "DIVNOMVEN", required = true)
    protected String divnomven;
    @XmlElement(name = "INDCOMP", required = true)
    protected String indcomp;
    @XmlElement(name = "INDCALPUT", required = true)
    protected String indcalput;
    @XmlElement(name = "TRANOPE", required = true)
    protected String tranope;
    @XmlElement(name = "NIVBARR1", required = true)
    protected String nivbarr1;
    @XmlElement(name = "TIPBARR1", required = true)
    protected String tipbarr1;
    @XmlElement(name = "NIVBARR2", required = true)
    protected String nivbarr2;
    @XmlElement(name = "TIPBARR2", required = true)
    protected String tipbarr2;
    @XmlElement(name = "NUMESTRAT", required = true)
    protected String numestrat;

    /**
     * Obtiene el valor de la propiedad globalid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLOBALID() {
        return globalid;
    }

    /**
     * Define el valor de la propiedad globalid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLOBALID(String value) {
        this.globalid = value;
    }

    /**
     * Obtiene el valor de la propiedad codproop.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODPROOP() {
        return codproop;
    }

    /**
     * Define el valor de la propiedad codproop.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODPROOP(String value) {
        this.codproop = value;
    }

    /**
     * Obtiene el valor de la propiedad desprodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESPRODO() {
        return desprodo;
    }

    /**
     * Define el valor de la propiedad desprodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESPRODO(String value) {
        this.desprodo = value;
    }

    /**
     * Obtiene el valor de la propiedad fecalta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECALTA() {
        return fecalta;
    }

    /**
     * Define el valor de la propiedad fecalta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECALTA(String value) {
        this.fecalta = value;
    }

    /**
     * Obtiene el valor de la propiedad fecvto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECVTO() {
        return fecvto;
    }

    /**
     * Define el valor de la propiedad fecvto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECVTO(String value) {
        this.fecvto = value;
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

    /**
     * Obtiene el valor de la propiedad impnominal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPNOMINAL() {
        return impnominal;
    }

    /**
     * Define el valor de la propiedad impnominal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPNOMINAL(String value) {
        this.impnominal = value;
    }

    /**
     * Obtiene el valor de la propiedad codidivi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIDIVI() {
        return codidivi;
    }

    /**
     * Define el valor de la propiedad codidivi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIDIVI(String value) {
        this.codidivi = value;
    }

    /**
     * Obtiene el valor de la propiedad impprima.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPPRIMA() {
        return impprima;
    }

    /**
     * Define el valor de la propiedad impprima.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPPRIMA(String value) {
        this.impprima = value;
    }

    /**
     * Obtiene el valor de la propiedad divprima.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIVPRIMA() {
        return divprima;
    }

    /**
     * Define el valor de la propiedad divprima.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIVPRIMA(String value) {
        this.divprima = value;
    }

    /**
     * Obtiene el valor de la propiedad impnomven.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPNOMVEN() {
        return impnomven;
    }

    /**
     * Define el valor de la propiedad impnomven.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPNOMVEN(String value) {
        this.impnomven = value;
    }

    /**
     * Obtiene el valor de la propiedad divnomven.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIVNOMVEN() {
        return divnomven;
    }

    /**
     * Define el valor de la propiedad divnomven.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIVNOMVEN(String value) {
        this.divnomven = value;
    }

    /**
     * Obtiene el valor de la propiedad indcomp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDCOMP() {
        return indcomp;
    }

    /**
     * Define el valor de la propiedad indcomp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDCOMP(String value) {
        this.indcomp = value;
    }

    /**
     * Obtiene el valor de la propiedad indcalput.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDCALPUT() {
        return indcalput;
    }

    /**
     * Define el valor de la propiedad indcalput.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDCALPUT(String value) {
        this.indcalput = value;
    }

    /**
     * Obtiene el valor de la propiedad tranope.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANOPE() {
        return tranope;
    }

    /**
     * Define el valor de la propiedad tranope.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANOPE(String value) {
        this.tranope = value;
    }

    /**
     * Obtiene el valor de la propiedad nivbarr1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIVBARR1() {
        return nivbarr1;
    }

    /**
     * Define el valor de la propiedad nivbarr1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIVBARR1(String value) {
        this.nivbarr1 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipbarr1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPBARR1() {
        return tipbarr1;
    }

    /**
     * Define el valor de la propiedad tipbarr1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPBARR1(String value) {
        this.tipbarr1 = value;
    }

    /**
     * Obtiene el valor de la propiedad nivbarr2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIVBARR2() {
        return nivbarr2;
    }

    /**
     * Define el valor de la propiedad nivbarr2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIVBARR2(String value) {
        this.nivbarr2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipbarr2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPBARR2() {
        return tipbarr2;
    }

    /**
     * Define el valor de la propiedad tipbarr2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPBARR2(String value) {
        this.tipbarr2 = value;
    }

    /**
     * Obtiene el valor de la propiedad numestrat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMESTRAT() {
        return numestrat;
    }

    /**
     * Define el valor de la propiedad numestrat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMESTRAT(String value) {
        this.numestrat = value;
    }

}
