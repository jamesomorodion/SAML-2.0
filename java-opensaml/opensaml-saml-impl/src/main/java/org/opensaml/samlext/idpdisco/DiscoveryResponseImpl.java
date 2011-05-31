/*
 * Copyright [2006] [University Corporation for Advanced Internet Development, Inc.]
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

package org.opensaml.samlext.idpdisco;

import org.opensaml.saml2.metadata.impl.IndexedEndpointImpl;

/**
 * This plugs into the standard opensaml2 parser framework to allow us to get use <code> DiscoverResponse </code>
 * elements in our extensions.
 */
public class DiscoveryResponseImpl extends IndexedEndpointImpl implements DiscoveryResponse {
    
    /**
     * Constructor.
     * 
     * @param namespaceURI the Uri
     * @param elementLocalName the local name
     * @param namespacePrefix the prefix
     */
    protected DiscoveryResponseImpl(String namespaceURI, String elementLocalName, String namespacePrefix) {
        super(namespaceURI, elementLocalName, namespacePrefix);
    }
}