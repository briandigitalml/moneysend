package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.MoneySend.MoneySendServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.DeleteSubscriberInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.DeleteSubscriberReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class DeleteSubscriberTests {

	@Test
	public void testOperationDeleteSubscriberBasicMapping()  {
		MoneySendServiceDefaultImpl serviceDefaultImpl = new MoneySendServiceDefaultImpl();
		DeleteSubscriberInputParametersDTO inputs = new DeleteSubscriberInputParametersDTO();
		inputs.setDeleteSubscriberIdRequest(null);
		DeleteSubscriberReturnDTO returnValue = serviceDefaultImpl.deleteSubscriber(fullyAutheticatedSecurityContext, inputs);
		
		assertNotNull(returnValue);
		assertNotNull(returnValue.getResponseWrapper200DeleteSubscriber());				
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