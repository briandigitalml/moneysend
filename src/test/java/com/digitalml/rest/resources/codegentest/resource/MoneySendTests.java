package com.digitalml.rest.resources.codegentest.resource;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public class MoneySendTests {

	@Test
	public void testResourceInitialisation() {
		MoneySendResource resource = new MoneySendResource();
		Assert.assertNotNull(resource);
	}

	@Test
	public void testResourcePing() {
		MoneySendResource resource = new MoneySendResource();
		Response response = resource.pingMoneySend();
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationInquireCardMappingNoSecurity() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(null);

		Response response = resource.inquireCardMapping(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationInquireCardMappingAuthorised() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.inquireCardMapping(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationCreateCardMappingNoSecurity() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(null);

		Response response = resource.createCardMapping(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationCreateCardMappingAuthorised() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.createCardMapping(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationTransferPost1NoSecurity() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(null);

		Response response = resource.transferPost1(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationTransferPost1Authorised() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.transferPost1(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationDeleteSubscriberNoSecurity() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(null);

		Response response = resource.deleteSubscriber(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationDeleteSubscriberAuthorised() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.deleteSubscriber(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationCheckPANEligibilityNoSecurity() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(null);

		Response response = resource.checkPANEligibility(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationCheckPANEligibilityAuthorised() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.checkPANEligibility(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationTransferPostNoSecurity() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(null);

		Response response = resource.transferPost(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationTransferPostAuthorised() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.transferPost(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationSanctionScoreNoSecurity() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(null);

		Response response = resource.sanctionScore(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationSanctionScoreAuthorised() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.sanctionScore(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationTransferReversalPostNoSecurity() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(null);

		Response response = resource.transferReversalPost(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationTransferReversalPostAuthorised() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.transferReversalPost(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationUpdateCardMappingNoSecurity() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(null);

		Response response = resource.updateCardMapping(0, null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationUpdateCardMappingAuthorised() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.updateCardMapping(0, null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationDeleteCardMappingNoSecurity() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(null);

		Response response = resource.deleteCardMapping(0);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationDeleteCardMappingAuthorised() {
		MoneySendResource resource = new MoneySendResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.deleteCardMapping(0);
		Assert.assertEquals(200, response.getStatus());
	}

	private SecurityContext unautheticatedSecurityContext = new SecurityContext() {

		@Override
		public boolean isUserInRole(String arg0) {
			return false;
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