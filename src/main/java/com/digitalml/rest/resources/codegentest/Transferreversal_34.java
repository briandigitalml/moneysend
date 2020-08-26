package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Transferreversal_34:
{
  "type": "object",
  "properties": {
    "RequestId": {
      "description": "This is the Unique identifier for API Web service request. Details- numeric, variable length without zero padding",
      "type": "string"
    },
    "OriginalRequestId": {
      "description": "This is the Request ID for the original MoneySend Transfer request.Details- numeric value, 1-20",
      "type": "string"
    },
    "TransactionReference": {
      "description": "This is the Unique identifier for the entire MoneySend Transfer provided in the request. Details-  alphanumeric, 19",
      "type": "string"
    },
    "TransactionHistory": {
      "$ref": "Transactionhistory_35"
    }
  }
}
*/


public class Transferreversal_34 {

	@Size(max=1)
	private String requestId;

	@Size(max=1)
	private String originalRequestId;

	@Size(max=1)
	private String transactionReference;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Transactionhistory_35 transactionHistory;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    requestId = null;
	    originalRequestId = null;
	    transactionReference = null;
	    transactionHistory = null;
	}
@ApiModelProperty(notes = "This is the Unique identifier for API Web service request. Details- numeric, variable length without zero padding")
	public String getRequestId() {
		return requestId;
	}
	
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
@ApiModelProperty(notes = "This is the Request ID for the original MoneySend Transfer request.Details- numeric value, 1-20")
	public String getOriginalRequestId() {
		return originalRequestId;
	}
	
	public void setOriginalRequestId(String originalRequestId) {
		this.originalRequestId = originalRequestId;
	}
@ApiModelProperty(notes = "This is the Unique identifier for the entire MoneySend Transfer provided in the request. Details-  alphanumeric, 19")
	public String getTransactionReference() {
		return transactionReference;
	}
	
	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

	public com.digitalml.rest.resources.codegentest.Transactionhistory_35 getTransactionHistory() {
		return transactionHistory;
	}
	
	public void setTransactionHistory(com.digitalml.rest.resources.codegentest.Transactionhistory_35 transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
}