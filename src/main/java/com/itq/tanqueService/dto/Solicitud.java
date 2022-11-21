//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.26 a las 04:00:56 PM CDT 
//


package com.itq.tanqueService.dto;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSolicitud"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="idTank"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="clienteCurp"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="litros"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;maxInclusive value="1500"/&gt;
 *               &lt;minInclusive value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fecha"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="(\d{2}/\d{2}/\d{4})"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idSolicitud",
    "idTank",
    "clienteCurp",
    "litros",
    "fecha"
})
@XmlRootElement(name = "solicitud")
public class Solicitud {

    protected int idSolicitud;
    protected int idTank;
    protected int clienteCurp;
    protected int litros;
    @XmlElement(required = true)
    protected String fecha;

    /**
     * Obtiene el valor de la propiedad idSolicitud.
     * 
     */
    public int getIdSolicitud() {
        return idSolicitud;
    }

    /**
     * Define el valor de la propiedad idSolicitud.
     * 
     */
    public void setIdSolicitud(int value) {
        this.idSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad idTank.
     * 
     */
    public int getIdTank() {
        return idTank;
    }

    /**
     * Define el valor de la propiedad idTank.
     * 
     */
    public void setIdTank(int value) {
        this.idTank = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteCurp.
     * 
     */
    public int getClienteCurp() {
        return clienteCurp;
    }

    /**
     * Define el valor de la propiedad clienteCurp.
     * 
     */
    public void setClienteCurp(int value) {
        this.clienteCurp = value;
    }

    /**
     * Obtiene el valor de la propiedad litros.
     * 
     */
    public int getLitros() {
        return litros;
    }

    /**
     * Define el valor de la propiedad litros.
     * 
     */
    public void setLitros(int value) {
        this.litros = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

}
