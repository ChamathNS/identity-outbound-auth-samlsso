/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.authenticator.outbound.saml2sso.request;

import org.wso2.carbon.identity.gateway.processor.request.CallbackAuthenticationRequest;

public class SAML2ACSRequest extends CallbackAuthenticationRequest {

    protected String samlResponse;

    protected SAML2ACSRequest(SAML2ACSRequestBuilder builder) {
        super(builder);
        this.samlResponse = builder.saml2SSOResponse;
    }

    public String getSamlResponse() {
        return samlResponse;
    }

    public static class SAML2ACSRequestBuilder extends CallbackAuthenticationRequest.CallbackAuthenticationRequestBuilder {

        protected String saml2SSOResponse;

        public SAML2ACSRequestBuilder setSAML2SSOResponse(String saml2SSOResponse) {
            this.saml2SSOResponse = saml2SSOResponse;
            return this;
        }

        @Override
        public SAML2ACSRequest build() {
            return new SAML2ACSRequest(this);
        }
    }

}
