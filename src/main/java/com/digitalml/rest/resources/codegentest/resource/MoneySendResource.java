package com.digitalml.rest.resources.codegentest.resource;
        	
import java.lang.IllegalArgumentException;
import java.security.AccessControlException;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.Object;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
	
// Customer specific imports

// Service specific imports
import com.digitalml.rest.resources.codegentest.service.MoneySendService;
	
import com.digitalml.rest.resources.codegentest.service.MoneySendService.InquireCardMappingReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.InquireCardMappingReturnDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.InquireCardMappingInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.CreateCardMappingReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.CreateCardMappingReturnDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.CreateCardMappingInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.TransferPost1ReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.TransferPost1ReturnDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.TransferPost1InputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.DeleteSubscriberReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.DeleteSubscriberReturnDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.DeleteSubscriberInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.CheckPANEligibilityReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.CheckPANEligibilityReturnDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.CheckPANEligibilityInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.TransferPostReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.TransferPostReturnDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.TransferPostInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.SanctionScoreReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.SanctionScoreReturnDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.SanctionScoreInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.TransferReversalPostReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.TransferReversalPostReturnDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.TransferReversalPostInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.UpdateCardMappingReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.UpdateCardMappingReturnDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.UpdateCardMappingInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.DeleteCardMappingReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.DeleteCardMappingReturnDTO;
import com.digitalml.rest.resources.codegentest.service.MoneySendService.DeleteCardMappingInputParametersDTO;
	
import com.digitalml.rest.resources.codegentest.*;
	
	/**
	 * Service: MoneySend
	 * 120
	 *
	 * @author admin
	 * @version V3
	 *
	 */
	
	@Produces({ MediaType.TEXT_PLAIN })
	public class MoneySendResource {
		
	private static final Logger LOGGER = LoggerFactory.getLogger(MoneySendResource.class);
	
	@Context
	private SecurityContext securityContext;

	@Context
	private javax.ws.rs.core.Request request;

	@Context
	private HttpServletRequest httpRequest;

	private MoneySendService delegateService;

	private String implementationClass = "com.digitalml.rest.resources.codegentest.service.MoneySend.MoneySendServiceDefaultImpl";

	public void setImplementationClass(String className) {
		implementationClass = className;
	}

	public void setImplementationClass(Class clazz) {
		if (clazz == null)
			throw new IllegalArgumentException("Parameter clazz cannot be null");

		implementationClass = clazz.getName();
	}
		
	private MoneySendService getCurrentImplementation() {

		Object object = null;
		try {
			Class c = Class.forName(implementationClass, true, Thread.currentThread().getContextClassLoader());
			object = c.newInstance();

		} catch (ClassNotFoundException exc) {
			LOGGER.error(implementationClass + " not found");
			return null;

		} catch (IllegalAccessException exc) {
			LOGGER.error("Cannot access " + implementationClass);
			return null;

		} catch (InstantiationException exc) {
			LOGGER.error("Cannot instantiate " + implementationClass);
			return null;
		}

		if (!(object instanceof MoneySendService)) {
			LOGGER.error(implementationClass + " is not an instance of " + MoneySendService.class.getName());
			return null;
		}

		return (MoneySendService)object;
	}
	
	{
		delegateService = getCurrentImplementation();
	}
	
	public void setSecurityContext(SecurityContext securityContext) {
		this.securityContext = securityContext;
	}


	/**
	Method: inquireCardMapping
		This resource will allow a customer to view the existing Card Mappings
associated with the customer&#x27;s MoneySend subscription using an API call. 
A
customer has the ability to view card mappings created under the customer&#x27;s
MoneySend subscription. In addition, the Card Mapping Inquire will provide
certain data necessary to submit a MoneySend Transfer transaction, Update Card
Mapping, or Delete Card Mapping if that information is not already
available.Card Mappings are stored in a secure encrypted environment which is a
PCI compliant data storage facility managed by Mastercard.

	*/
	
	@ApiOperation(nickname = "inquireCardMapping", httpMethod = "PUT", value = "inquireCardMapping" , notes = "This resource will allow a customer to view the existing Card Mappings associated with the customer&#x27;s MoneySend subscription using an API call.  A customer has the ability to view card mappings created under the customer&#x27;s MoneySend subscription. In addition, the Card Mapping Inquire will provide certain data necessary to submit a MoneySend Transfer transaction, Update Card Mapping, or Delete Card Mapping if that information is not already available.Card Mappings are stored in a secure encrypted environment which is a PCI compliant data storage facility managed by Mastercard.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@PUT
	public javax.ws.rs.core.Response inquireCardMapping(
		 com.digitalml.rest.resources.codegentest.Inquiremappingrequest_57_wrapper inquireMappingRequest) {

		InquireCardMappingInputParametersDTO inputs = new MoneySendService.InquireCardMappingInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setInquireMappingRequest(inquireMappingRequest);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			InquireCardMappingReturnDTO returnValue = delegateService.inquireCardMapping(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: createCardMapping
		Allows a customer to create a card mapping for their MoneySend subscription
using an API call.
 Creation of a Card Mapping allows a Mastercard customer to
associate their card account to a unique identifier or ‘alias&#x27; within the
customer&#x27;s MoneySend enrollment profile. This unique identifier can be used to
send or receive funds via the MoneySend service without sharing card account
information.This also enables MoneySend to execute transactions between senders
and receivers who bank with different Mastercard Members while protecting the
card account information of each customer.Card Mappings are stored in a secure
encrypted environment which is a PCI compliant data storage facility managed by
Mastercard.
	*/
	
	@ApiOperation(nickname = "createCardMapping", httpMethod = "POST", value = "createCardMapping" , notes = "Allows a customer to create a card mapping for their MoneySend subscription using an API call.  Creation of a Card Mapping allows a Mastercard customer to associate their card account to a unique identifier or ‘alias&#x27; within the customer&#x27;s MoneySend enrollment profile. This unique identifier can be used to send or receive funds via the MoneySend service without sharing card account information.This also enables MoneySend to execute transactions between senders and receivers who bank with different Mastercard Members while protecting the card account information of each customer.Card Mappings are stored in a secure encrypted environment which is a PCI compliant data storage facility managed by Mastercard.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@POST
	public javax.ws.rs.core.Response createCardMapping(
		 com.digitalml.rest.resources.codegentest.Createmappingrequest_52_wrapper createMappingRequest) {

		CreateCardMappingInputParametersDTO inputs = new MoneySendService.CreateCardMappingInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setCreateMappingRequest(createMappingRequest);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			CreateCardMappingReturnDTO returnValue = delegateService.createCardMapping(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: transferPost1
		Use the Transfer resource to transfer funds to a recipient with an eligible
Mastercard card account.
	*/
	
	@ApiOperation(nickname = "transferPost1", httpMethod = "POST", value = "transferPost1" , notes = "Use the Transfer resource to transfer funds to a recipient with an eligible Mastercard card account.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@POST
	public javax.ws.rs.core.Response transferPost1(
		 com.digitalml.rest.resources.codegentest.Fundingrequestv3_18_wrapper fundingRequestV3) {

		TransferPost1InputParametersDTO inputs = new MoneySendService.TransferPost1InputParametersDTO();
		// Prepare and check all input parameters

		inputs.setFundingRequestV3(fundingRequestV3);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			TransferPost1ReturnDTO returnValue = delegateService.transferPost1(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: deleteSubscriber
		This resource allows the removal of a Subscriber ID profile, along with all Card
Mappings, using an API call. If a customer chooses to change their Subscriber
ID, the current Subscriber ID should be deleted and a new Subscriber ID created.
This resource would also be used if the Subscriber ID was no longer needed for
participation in the MoneySend service. 
	*/
	
	@ApiOperation(nickname = "deleteSubscriber", httpMethod = "PUT", value = "deleteSubscriber" , notes = "This resource allows the removal of a Subscriber ID profile, along with all Card Mappings, using an API call. If a customer chooses to change their Subscriber ID, the current Subscriber ID should be deleted and a new Subscriber ID created. This resource would also be used if the Subscriber ID was no longer needed for participation in the MoneySend service.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@PUT
	public javax.ws.rs.core.Response deleteSubscriber(
		 com.digitalml.rest.resources.codegentest.Deletesubscriberidrequest_74_wrapper deleteSubscriberIdRequest) {

		DeleteSubscriberInputParametersDTO inputs = new MoneySendService.DeleteSubscriberInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setDeleteSubscriberIdRequest(deleteSubscriberIdRequest);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			DeleteSubscriberReturnDTO returnValue = delegateService.deleteSubscriber(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: checkPANEligibility
		The Primary Account Number (PAN) is the card number. The Mastercard MoneySend
Platform is a global offering, however there may be specific countries,
receiving institutions (RIs) or account ranges that are blocked from
participation in the offering. The Card is eligible if it hasn&#x27;t been blocked
for receiving a MoneySend payment. PAN eligibility provides the capability to
check the sending and receiving card for a transaction in a single call.  This
resource enables you to verify that a cardholder&#x27;s account is eligible to
receive MoneySend transactions and provides additional information for sending
and receiving cards: the Interbank Card Association (ICA) code of the issuer,
currency code (alpha and numeric), country code (alpha and numeric), brand
acceptance code, and brand product code will be returned. 
	*/
	
	@ApiOperation(nickname = "checkPANEligibility", httpMethod = "PUT", value = "checkPANEligibility" , notes = "The Primary Account Number (PAN) is the card number. The Mastercard MoneySend Platform is a global offering, however there may be specific countries, receiving institutions (RIs) or account ranges that are blocked from participation in the offering. The Card is eligible if it hasn&#x27;t been blocked for receiving a MoneySend payment. PAN eligibility provides the capability to check the sending and receiving card for a transaction in a single call.  This resource enables you to verify that a cardholder&#x27;s account is eligible to receive MoneySend transactions and provides additional information for sending and receiving cards: the Interbank Card Association (ICA) code of the issuer, currency code (alpha and numeric), country code (alpha and numeric), brand acceptance code, and brand product code will be returned.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@PUT
	public javax.ws.rs.core.Response checkPANEligibility(
		 com.digitalml.rest.resources.codegentest.Paneligibilityrequest_38_wrapper panEligibilityRequest) {

		CheckPANEligibilityInputParametersDTO inputs = new MoneySendService.CheckPANEligibilityInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setPanEligibilityRequest(panEligibilityRequest);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			CheckPANEligibilityReturnDTO returnValue = delegateService.checkPANEligibility(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: transferPost
		Use the Transfer resource to transfer funds to a recipient with an eligible
Mastercard card account.
	*/
	
	@ApiOperation(nickname = "transferPost", httpMethod = "POST", value = "transferPost" , notes = "Use the Transfer resource to transfer funds to a recipient with an eligible Mastercard card account.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@POST
	public javax.ws.rs.core.Response transferPost(
		 com.digitalml.rest.resources.codegentest.Paymentrequestv3_1_wrapper paymentRequestV3) {

		TransferPostInputParametersDTO inputs = new MoneySendService.TransferPostInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setPaymentRequestV3(paymentRequestV3);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			TransferPostReturnDTO returnValue = delegateService.transferPost(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: sanctionScore
		MoneySend™ Sanction Screening ServiceMastercard® provides the capability for
financial institutions to screen a Sender&#x27;s or Recipient&#x27;s name against OFAC&#x27;s
Specially Designated Nationals and Blocked Persons List (OFAC SDN List), and
other select lists from the sending and receiving countries. Originating
Institutions (OIs) and Receiving Institutions (RIs) that would like to screen
the sender or recipient&#x27;s name can now take advantage of the MoneySend Sanction
Screening Service.The service is intended to help financial institutions meet
Anti-Money Laundering (AML) compliance obligations.How it works1. The OI or RI
sends the sender or recipient name and country to screen. 2. Based on the
likelihood of a match, a score between 000 and 100 is generated per name. A
higher score indicates a closer match to names on the applicable screening list,
while lower scores indicate a less likely match.The service uses advanced
matching algorithms:Proprietary artificial intelligence and advanced algorithms
such as: pattern matching, phonetics algorithms, field matching, and fuzzy
logic.Phonetics algorithms deal with the different spelling and variations form
of a name: Meier and Meyer or Sinclair and St. Clair, etc.Fuzzy logics deals
with nicknames or short forms of given names: Bob for Robert, Liz for Elizabeth,
or a variation of the surname- Westy for West.3. The service returns the list
name of the list with the highest score*. 4. OIs and RIs may use the score to
determine if the sender or recipient meets their AML obligations.*Screening
lists are available on the Publications page, List of Manuals, on Mastercard
Connect. Screening lists will be set by region. The regions sanctions lists are
configurable. Use Sanction Scoring inquiry to get the sanction screening score
which will help to effectively manage money transfers
	*/
	
	@ApiOperation(nickname = "sanctionScore", httpMethod = "POST", value = "sanctionScore" , notes = "MoneySend™ Sanction Screening ServiceMastercard® provides the capability for financial institutions to screen a Sender&#x27;s or Recipient&#x27;s name against OFAC&#x27;s Specially Designated Nationals and Blocked Persons List (OFAC SDN List), and other select lists from the sending and receiving countries. Originating Institutions (OIs) and Receiving Institutions (RIs) that would like to screen the sender or recipient&#x27;s name can now take advantage of the MoneySend Sanction Screening Service.The service is intended to help financial institutions meet Anti-Money Laundering (AML) compliance obligations.How it works1. The OI or RI sends the sender or recipient name and country to screen. 2. Based on the likelihood of a match, a score between 000 and 100 is generated per name. A higher score indicates a closer match to names on the applicable screening list, while lower scores indicate a less likely match.The service uses advanced matching algorithms:Proprietary artificial intelligence and advanced algorithms such as: pattern matching, phonetics algorithms, field matching, and fuzzy logic.Phonetics algorithms deal with the different spelling and variations form of a name: Meier and Meyer or Sinclair and St. Clair, etc.Fuzzy logics deals with nicknames or short forms of given names: Bob for Robert, Liz for Elizabeth, or a variation of the surname- Westy for West.3. The service returns the list name of the list with the highest score*. 4. OIs and RIs may use the score to determine if the sender or recipient meets their AML obligations.*Screening lists are available on the Publications page, List of Manuals, on Mastercard Connect. Screening lists will be set by region. The regions sanctions lists are configurable. Use Sanction Scoring inquiry to get the sanction screening score which will help to effectively manage money transfers")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@POST
	public javax.ws.rs.core.Response sanctionScore(
		 com.digitalml.rest.resources.codegentest.Sanctionscoreservicerequest_50_wrapper sanctionScoreServiceRequest) {

		SanctionScoreInputParametersDTO inputs = new MoneySendService.SanctionScoreInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setSanctionScoreServiceRequest(sanctionScoreServiceRequest);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			SanctionScoreReturnDTO returnValue = delegateService.sanctionScore(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: transferReversalPost
		The Transfer Reversal resource is a request to reverse a previously submitted
Transfer and is only available in extremely limited circumstances. Transfer
reversal must be submitted within 24 hours of processing the original transfer
request - this applies to the payment transaction only. Reversal ProcessingThe
following limited reversals or corrections are permitted for MoneySend Payment
Transactions:1.Capability to reverse a Funding Transaction and credit the refund
to the sender&#x27;s Funding Account.2.Capability to process an online reversal
request within one calendar day of the date the MoneySend Payment Transaction
was authorized only in the event of a documented clerical error.3.Capability to
ensure that the Receiving Institution has approved the MoneySend Payment
Transaction reversal request, prior to crediting the refund to the sender&#x27;s
Funding Account.  Use this resource to reverse a previously submitted Transfer. 
	*/
	
	@ApiOperation(nickname = "transferReversalPost", httpMethod = "POST", value = "transferReversalPost" , notes = "The Transfer Reversal resource is a request to reverse a previously submitted Transfer and is only available in extremely limited circumstances. Transfer reversal must be submitted within 24 hours of processing the original transfer request - this applies to the payment transaction only. Reversal ProcessingThe following limited reversals or corrections are permitted for MoneySend Payment Transactions:1.Capability to reverse a Funding Transaction and credit the refund to the sender&#x27;s Funding Account.2.Capability to process an online reversal request within one calendar day of the date the MoneySend Payment Transaction was authorized only in the event of a documented clerical error.3.Capability to ensure that the Receiving Institution has approved the MoneySend Payment Transaction reversal request, prior to crediting the refund to the sender&#x27;s Funding Account.  Use this resource to reverse a previously submitted Transfer.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@POST
	public javax.ws.rs.core.Response transferReversalPost(
		 com.digitalml.rest.resources.codegentest.Transferreversalrequest_33_wrapper transferReversalRequest) {

		TransferReversalPostInputParametersDTO inputs = new MoneySendService.TransferReversalPostInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setTransferReversalRequest(transferReversalRequest);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			TransferReversalPostReturnDTO returnValue = delegateService.transferReversalPost(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: updateCardMapping
		This resource will allow a customer to update an existing Card Mapping
associated with the customer&#x27;s MoneySend subscription using an API call. The
information provided in the update request becomes the newly-updated record.  A
customer has the ability to change certain information in an existing card
mapping in order to keep the account information current. The data fields
available for update are: Alias, Default Indicator, Account information,
Cardholder Name, and Cardholder Address information. The account mapping is
uniquely identified by a combination of Subscriber ID, Subscriber Type, Account
Usage, and Alias data elements.Card Mappings are stored in a secure encrypted
environment which is a PCI compliant data storage facility managed by
Mastercard.
	*/
	
	@ApiOperation(nickname = "updateCardMapping", httpMethod = "PUT", value = "updateCardMapping" , notes = "This resource will allow a customer to update an existing Card Mapping associated with the customer&#x27;s MoneySend subscription using an API call. The information provided in the update request becomes the newly-updated record.  A customer has the ability to change certain information in an existing card mapping in order to keep the account information current. The data fields available for update are: Alias, Default Indicator, Account information, Cardholder Name, and Cardholder Address information. The account mapping is uniquely identified by a combination of Subscriber ID, Subscriber Type, Account Usage, and Alias data elements.Card Mappings are stored in a secure encrypted environment which is a PCI compliant data storage facility managed by Mastercard.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@PUT
	public javax.ws.rs.core.Response updateCardMapping(
		@QueryParam("mappingId") int mappingId,
		 com.digitalml.rest.resources.codegentest.Updatemappingrequest_67_wrapper updateMappingRequest) {

		UpdateCardMappingInputParametersDTO inputs = new MoneySendService.UpdateCardMappingInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setMappingId(mappingId);
		inputs.setUpdateMappingRequest(updateMappingRequest);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			UpdateCardMappingReturnDTO returnValue = delegateService.updateCardMapping(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: deleteCardMapping
		This resource will allow a customer to delete an existing Card Mapping
associated with the customer&#x27;s MoneySend subscription using an API call.
	*/
	
	@ApiOperation(nickname = "deleteCardMapping", httpMethod = "DELETE", value = "deleteCardMapping" , notes = "This resource will allow a customer to delete an existing Card Mapping associated with the customer&#x27;s MoneySend subscription using an API call.")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@DELETE
	public javax.ws.rs.core.Response deleteCardMapping(
		@QueryParam("mappingId") int mappingId) {

		DeleteCardMappingInputParametersDTO inputs = new MoneySendService.DeleteCardMappingInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setMappingId(mappingId);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			DeleteCardMappingReturnDTO returnValue = delegateService.deleteCardMapping(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	

	/**
	* Generic ping method to allow callers to check if the service is up and running.
	*/
	@ApiResponses({ @ApiResponse(code = 200, message = "I'm alive!") })
	@GET
	@Path("/ping")
	public javax.ws.rs.core.Response pingMoneySend() {
		javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok();
		return builder.build();
	}
}