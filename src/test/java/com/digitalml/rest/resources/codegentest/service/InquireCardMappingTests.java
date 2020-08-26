package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.MoneySend.MoneySendServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.InquireCardMappingInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.InquireCardMappingReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class InquireCardMappingTests {

	@Test
	public void testOperationInquireCardMappingBasicMapping()  {
		MoneySendServiceDefaultImpl serviceDefaultImpl = new MoneySendServiceDefaultImpl();
		InquireCardMappingInputParametersDTO inputs = new InquireCardMappingInputParametersDTO();
		inputs.setInquireMappingRequest(null);
		InquireCardMappingReturnDTO returnValue = serviceDefaultImpl.inquireCardMapping(fullyAutheticatedSecurityContext, inputs);
		
		assertNotNull(returnValue);
		assertNotNull(returnValue.getResponseWrapper200InquireCardMapping());				
	}
	

	private SecurityContext fullyAutheticatedSecurityContext = new SecurityContext() {

		@Override
		public boolean isUserInRole(String arg0) {
			return true;
		}

		@Override
		public boolean isSecure() {
			return false;
		}

		@Override
		public Principal getUserPrincipal() {
			return null;
		}

		@Override
		public String getAuthenticationScheme() {
			return null;
		}
	};
}