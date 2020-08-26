package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.MoneySend.MoneySendServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.UpdateCardMappingInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.UpdateCardMappingReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class UpdateCardMappingTests {

	@Test
	public void testOperationUpdateCardMappingBasicMapping()  {
		MoneySendServiceDefaultImpl serviceDefaultImpl = new MoneySendServiceDefaultImpl();
		UpdateCardMappingInputParametersDTO inputs = new UpdateCardMappingInputParametersDTO();
		inputs.setMappingId(0);
		inputs.setUpdateMappingRequest(null);
		UpdateCardMappingReturnDTO returnValue = serviceDefaultImpl.updateCardMapping(fullyAutheticatedSecurityContext, inputs);
		
		assertNotNull(returnValue);
		assertNotNull(returnValue.getResponseWrapper200UpdateCardMapping());				
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