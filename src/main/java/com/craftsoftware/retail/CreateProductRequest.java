//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.28 at 05:11:57 PM EAT 
//


package com.craftsoftware.retail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateProduct" type="{http://www.craftsoftware.com/retail}CreateProduct"/>
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
    "createProduct"
})
@XmlRootElement(name = "CreateProductRequest")
public class CreateProductRequest {

    @XmlElement(name = "CreateProduct", required = true)
    protected CreateProduct createProduct;

    /**
     * Gets the value of the createProduct property.
     * 
     * @return
     *     possible object is
     *     {@link CreateProduct }
     *     
     */
    public CreateProduct getCreateProduct() {
        return createProduct;
    }

    /**
     * Sets the value of the createProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateProduct }
     *     
     */
    public void setCreateProduct(CreateProduct value) {
        this.createProduct = value;
    }

}
