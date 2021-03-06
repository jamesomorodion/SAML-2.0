/*
 * Copyright [2005] [University Corporation for Advanced Internet Development, Inc.]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * 
 */
package org.opensaml.saml2.metadata.impl;

import javax.xml.namespace.QName;

import org.opensaml.common.BaseSAMLObjectProviderTestCase;
import org.opensaml.common.xml.SAMLConstants;
import org.opensaml.saml2.metadata.AuthzService;

/**
 * Test case for creating, marshalling, and unmarshalling
 * {@link org.opensaml.saml2.metadata.impl.AuthzServiceImpl}.
 */
public class AuthzServiceTest extends BaseSAMLObjectProviderTestCase {
    
    protected String expectedBinding;
    protected String expectedLocation;
    protected String expectedResponseLocation;
    
    /**
     * Constructor
     */
    public AuthzServiceTest() {
        singleElementFile = "/data/org/opensaml/saml2/metadata/impl/AuthzService.xml";
        singleElementOptionalAttributesFile = "/data/org/opensaml/saml2/metadata/impl/AuthzServiceOptionalAttributes.xml";
    }
    
    /** {@inheritDoc} */
    protected void setUp() throws Exception {
        super.setUp();
        
        expectedBinding = "urn:binding:foo";
        expectedLocation = "example.org";
        expectedResponseLocation = "example.org/response";
    }

    /** {@inheritDoc} */
    public void testSingleElementUnmarshall() {
        AuthzService service = (AuthzService) unmarshallElement(singleElementFile);
        
        assertEquals("Binding URI was not expected value", expectedBinding, service.getBinding());
        assertEquals("Location was not expected value", expectedLocation, service.getLocation());
    }

    /** {@inheritDoc} */
    public void testSingleElementOptionalAttributesUnmarshall() {
        AuthzService service = (AuthzService) unmarshallElement(singleElementOptionalAttributesFile);
        
        assertEquals("Binding URI was not expected value", expectedBinding, service.getBinding());
        assertEquals("Location was not expected value", expectedLocation, service.getLocation());
        assertEquals("ResponseLocation was not expected value", expectedResponseLocation, service.getResponseLocation());;
    }

    /** {@inheritDoc} */
    public void testSingleElementMarshall() {
        QName qname = new QName(SAMLConstants.SAML20MD_NS, AuthzService.DEFAULT_ELEMENT_LOCAL_NAME);
        AuthzService service = (AuthzService) buildXMLObject(qname);
        
        service.setBinding(expectedBinding);
        service.setLocation(expectedLocation);

        assertEquals(expectedDOM, service);
    }

    /** {@inheritDoc} */
    public void testSingleElementOptionalAttributesMarshall() {
        QName qname = new QName(SAMLConstants.SAML20MD_NS, AuthzService.DEFAULT_ELEMENT_LOCAL_NAME);
        AuthzService service = (AuthzService) buildXMLObject(qname);
        
        service.setBinding(expectedBinding);
        service.setLocation(expectedLocation);
        service.setResponseLocation(expectedResponseLocation);

        assertEquals(expectedOptionalAttributesDOM, service);
    }
}