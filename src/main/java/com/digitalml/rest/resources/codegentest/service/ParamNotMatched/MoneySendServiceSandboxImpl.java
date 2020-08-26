package com.digitalml.rest.resources.codegentest.service.MoneySend;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Principal;

import com.digitalml.rest.resources.codegentest.service.MoneySendService;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang.StringUtils;

/**
 * Sandbox implementation for: MoneySend
 * 120
 *
 * @author admin
 * @version V3
 *
 */

public class MoneySendServiceSandboxImpl extends MoneySendService {
	

    public InquireCardMappingCurrentStateDTO inquireCardMappingUseCaseStep1(InquireCardMappingCurrentStateDTO currentState) {
    

        InquireCardMappingReturnStatusDTO returnStatus = new InquireCardMappingReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public CreateCardMappingCurrentStateDTO createCardMappingUseCaseStep1(CreateCardMappingCurrentStateDTO currentState) {
    

        CreateCardMappingReturnStatusDTO returnStatus = new CreateCardMappingReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public TransferPost1CurrentStateDTO transferPost1UseCaseStep1(TransferPost1CurrentStateDTO currentState) {
    

        TransferPost1ReturnStatusDTO returnStatus = new TransferPost1ReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public DeleteSubscriberCurrentStateDTO deleteSubscriberUseCaseStep1(DeleteSubscriberCurrentStateDTO currentState) {
    

        DeleteSubscriberReturnStatusDTO returnStatus = new DeleteSubscriberReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public CheckPANEligibilityCurrentStateDTO checkPANEligibilityUseCaseStep1(CheckPANEligibilityCurrentStateDTO currentState) {
    

        CheckPANEligibilityReturnStatusDTO returnStatus = new CheckPANEligibilityReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public TransferPostCurrentStateDTO transferPostUseCaseStep1(TransferPostCurrentStateDTO currentState) {
    

        TransferPostReturnStatusDTO returnStatus = new TransferPostReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public SanctionScoreCurrentStateDTO sanctionScoreUseCaseStep1(SanctionScoreCurrentStateDTO currentState) {
    

        SanctionScoreReturnStatusDTO returnStatus = new SanctionScoreReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public TransferReversalPostCurrentStateDTO transferReversalPostUseCaseStep1(TransferReversalPostCurrentStateDTO currentState) {
    

        TransferReversalPostReturnStatusDTO returnStatus = new TransferReversalPostReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public UpdateCardMappingCurrentStateDTO updateCardMappingUseCaseStep1(UpdateCardMappingCurrentStateDTO currentState) {
    

        UpdateCardMappingReturnStatusDTO returnStatus = new UpdateCardMappingReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public DeleteCardMappingCurrentStateDTO deleteCardMappingUseCaseStep1(DeleteCardMappingCurrentStateDTO currentState) {
    

        DeleteCardMappingReturnStatusDTO returnStatus = new DeleteCardMappingReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


	/**
	 * Creates and returns a {@link Method} object using reflection and handles the possible exceptions.
	 * <br/>
	 * Aids with calling the process step method based on the outcome of the control logic
	 * 
	 * @param methodName
	 * @param clazz
	 * @return
	 */
	private Method getMethod(String methodName, Class clazz) {
		Method method = null;
		try {
			method = MoneySendService.class.getMethod(methodName, clazz);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		return method;
	}
	
	/**
	 * For use when calling provider systems.
	 * <p>
	 * TODO: Implement security logic here
	 */
	protected SecurityContext securityContext = new SecurityContext() {

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