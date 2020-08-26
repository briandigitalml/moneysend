package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.MoneySend.MoneySendServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.TransferPost1InputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.TransferPost1ReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class TransferPost1Tests {

	@Test
	public void testOperationTransferPost1BasicMapping()  {
		MoneySendServiceDefaultImpl serviceDefaultImpl = new MoneySendServiceDefaultImpl();
		TransferPost1InputParametersDTO inputs = new TransferPost1InputParametersDTO();
		inputs.setFundingRequestV3(null);
		TransferPost1ReturnDTO returnValue = serviceDefaultImpl.transferPost1(fullyAutheticatedSecurityContext, inputs);
		
		assertNotNull(returnValue);
		assertNotNull(returnValue.getResponseWrapper200TransferPost1());				
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