//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.03 at 02:11:38 AM PDT 
//


package org.smpte_ra.schemas._433._2008.dcmltypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currentModeToken.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="currentModeToken">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="DC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "currentModeToken")
@XmlEnum
public enum CurrentModeToken {

    AC,
    DC;

    public String value() {
        return name();
    }

    public static CurrentModeToken fromValue(String v) {
        return valueOf(v);
    }

}
