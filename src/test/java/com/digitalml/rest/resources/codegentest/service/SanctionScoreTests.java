package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.MoneySend.MoneySendServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.SanctionScoreInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.SanctionScoreReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class SanctionScoreTests {

	@Test
	public void testOperationSanctionScoreBasicMapping()  {
		MoneySendServiceDefaultImpl serviceDefaultImpl = new MoneySendServiceDefaultImpl();
		SanctionScoreInputParametersDTO inputs = new SanctionScoreInputParametersDTO();
		inputs.setSanctionScoreServiceRequest(null);
		SanctionScoreReturnDTO returnValue = serviceDefaultImpl.sanctionScore(fullyAutheticatedSecurityContext, inputs);
		
		assertNotNull(returnValue);
		assertNotNull(returnValue.getResponseWrapper200SanctionScore());				
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