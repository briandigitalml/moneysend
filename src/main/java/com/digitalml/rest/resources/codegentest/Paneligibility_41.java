package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Paneligibility_41:
{
  "type": "object",
  "properties": {
    "RequestId": {
      "description": "This is the unique identifier for API service request. Details- Numeric, variable length without zero padding",
      "type": "string"
    },
    "SendingEligibility": {
      "$ref": "Sendingeligibility_42"
    },
    "ReceivingEligibility": {
      "$ref": "Receivingeligibility_46"
    }
  }
}
*/


public class Paneligibility_41 {

	@Size(max=1)
	private String requestId;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Sendingeligibility_42 sendingEligibility;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Receivingeligibility_46 receivingEligibility;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    requestId = null;
	    sendingEligibility = null;
	    receivingEligibility = null;
	}
@ApiModelProperty(notes = "This is the unique identifier for API service request. Details- Numeric, variable length without zero padding")
	public String getRequestId() {
		return requestId;
	}
	
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public com.digitalml.rest.resources.codegentest.Sendingeligibility_42 getSendingEligibility() {
		return sendingEligibility;
	}
	
	public void setSendingEligibility(com.digitalml.rest.resources.codegentest.Sendingeligibility_42 sendingEligibility) {
		this.sendingEligibility = sendingEligibility;
	}

	public com.digitalml.rest.resources.codegentest.Receivingeligibility_46 getReceivingEligibility() {
		return receivingEligibility;
	}
	
	public void setReceivingEligibility(com.digitalml.rest.resources.codegentest.Receivingeligibility_46 receivingEligibility) {
		this.receivingEligibility = receivingEligibility;
	}
}