//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.17 at 03:26:09 PM CET 
//


/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 *
 * This file is part of the "DSS - Digital Signature Services" project.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.ec.markt.dss.validation102853.data.diagnostic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 * 
 *
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Signature" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="SignatureFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="StructuralValidation" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}StructuralValidationType"/>
 *                   &lt;element name="BasicSignature" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}BasicSignatureType"/>
 *                   &lt;element name="SigningCertificate" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}SigningCertificateType"/>
 *                   &lt;element name="CertificateChain" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}CertificateChainType"/>
 *                   &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ContentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ContentHints" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SignatureProductionPlace" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="StateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CommitmentTypeIndication" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ClaimedRoles" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ClaimedRole" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CertifiedRoles" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}CertifiedRolesType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Policy">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Notice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Identified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="ProcessingError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DigestAlgorithmsEqual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Timestamps">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Timestamp" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}TimestampType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SignatureScopes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SignatureScope" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}SignatureScopeType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UsedCertificates">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Certificate" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SubjectDistinguishedName" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}DistinguishedName" maxOccurs="unbounded"/>
 *                             &lt;element name="IssuerDistinguishedName" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}DistinguishedName" maxOccurs="unbounded"/>
 *                             &lt;element name="IssuerCertificate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="DigestAlgAndValue" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}DigestAlgAndValueType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="NotAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="NotBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="PublicKeySize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="PublicKeyEncryptionAlgo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="KeyUsageBits" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KeyUsage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="IdKpOCSPSigning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="IdPkixOcspNoCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="ExpiredCertOnCRL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="BasicSignature" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}BasicSignatureType"/>
 *                             &lt;element name="SigningCertificate" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}SigningCertificateType"/>
 *                             &lt;element name="CertificateChain" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}CertificateChainType"/>
 *                             &lt;element name="Trusted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="SelfSigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="QCStatement" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="QCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="QCPPlus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="QCC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="QCSSCD" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TrustedServiceProvider" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}TrustedServiceProviderType" maxOccurs="unbounded"/>
 *                             &lt;element name="Revocation" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}RevocationType"/>
 *                             &lt;element name="Info" type="{http://dss.markt.ec.europa.eu/validation/diagnostic}InfoType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "documentName",
    "signature",
    "usedCertificates"
})
@XmlRootElement(name = "DiagnosticData")
public class DiagnosticData {

    @XmlElement(name = "DocumentName", required = true)
    protected String documentName;
    @XmlElement(name = "Signature")
    protected List<XmlSignature> signature;
    @XmlElement(name = "UsedCertificates", required = true)
    protected XmlUsedCertificates usedCertificates;

    /**
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignature().add(newItem);
     * </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link XmlSignature }
     * 
     * 
     */
    public List<XmlSignature> getSignature() {
        if (signature == null) {
            signature = new ArrayList<XmlSignature>();
        }
        return this.signature;
    }

    /**
     * Gets the value of the usedCertificates property.
     * 
     * @return
     *     possible object is
     *     {@link XmlUsedCertificates }
     *     
     */
    public XmlUsedCertificates getUsedCertificates() {
        return usedCertificates;
    }

    /**
     * Sets the value of the usedCertificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlUsedCertificates }
     *     
     */
    public void setUsedCertificates(XmlUsedCertificates value) {
        this.usedCertificates = value;
    }

}