/*
 * Copyright 2008 University Corporation for Advanced Internet Development, Inc.
 * Copyright 2008 Members of the EGEE Collaboration.
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

package org.opensaml.xacml.policy.impl;

import org.opensaml.xacml.impl.AbstractXACMLObjectMarshaller;
import org.opensaml.xacml.policy.AttributeDesignatorType;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.io.MarshallingException;
import org.opensaml.xml.util.DatatypeHelper;
import org.w3c.dom.Element;

/**
 * Marshaller for {@link AttributeDesignatorType}.
 */
public class AttributeDesignatorTypeMarshaller extends AbstractXACMLObjectMarshaller {

    /** Constructor. */
    public AttributeDesignatorTypeMarshaller() {
        super();
    }

    /** {@inheritDoc} */
    protected void marshallAttributes(XMLObject xmlObject, Element domElement)
	    throws MarshallingException {
	AttributeDesignatorType attributeDesignatorType = (AttributeDesignatorType) xmlObject;

	if (!DatatypeHelper.isEmpty(attributeDesignatorType.getAttributeId())) {
	    domElement.setAttribute(
		    AttributeDesignatorType.ATTRIBUTE_ID_ATTRIB_NAME,
		    attributeDesignatorType.getAttributeId());
	}
	if (!DatatypeHelper.isEmpty(attributeDesignatorType.getDataType())) {
	    domElement.setAttribute(
		    AttributeDesignatorType.DATA_TYPE_ATTRIB_NAME,
		    attributeDesignatorType.getDataType());
	}
	if (!DatatypeHelper.isEmpty(attributeDesignatorType.getIssuer())) {
	    domElement.setAttribute(AttributeDesignatorType.ISSUER_ATTRIB_NAME,
		    attributeDesignatorType.getIssuer());
	}
	if (attributeDesignatorType.getMustBePresentXSBoolean() != null) {
	    domElement.setAttribute(
		    AttributeDesignatorType.MUST_BE_PRESENT_ATTRIB_NAME,
		    Boolean.toString(attributeDesignatorType
			    .getMustBePresentXSBoolean().getValue()));
	}

    }

}
