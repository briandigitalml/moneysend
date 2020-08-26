package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Transfer_29:
{
  "type": "object",
  "properties": {
    "RequestId": {
      "description": "This is the Unique identifier for API Web service request. Details- numeric, variable length without zero padding",
      "type": "string"
    },
    "TransactionReference": {
      "description": "This is the Unique identifier for the entire MoneySend Transfer provided in the request. Details-  alphanumeric, 19",
      "type": "string"
    },
    "TransactionHistory": {
      "$ref": "Transactionhistory_30"
    },
    "SanctionScore": {
      "description": "Sanction score is the SDN value recevied from SPS. Details- Numeric, 3.",
      "type": "string"
    }
  }
}
*/


public class Transfer_29 {

	@Size(max=1)
	private String requestId;

	@Size(max=1)
	private String transactionReference;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Transactionhistory_30 transactionHistory;

	@Size(max=1)
	private String sanctionScore;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    requestId = null;
	    transactionReference = null;
	    transactionHistory = null;
	    sanctionScore = null;
	}
@ApiModelProperty(notes = "This is the Unique identifier for API Web service request. Details- numeric, variable length without zero padding")
	public String getRequestId() {
		return requestId;
	}
	
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
@ApiModelProperty(notes = "This is the Unique identifier for the entire MoneySend Transfer provided in the request. Details-  alphanumeric, 19")
	public String getTransactionReference() {
		return transactionReference;
	}
	
	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

	public com.digitalml.rest.resources.codegentest.Transactionhistory_30 getTransactionHistory() {
		return transactionHistory;
	}
	
	public void setTransactionHistory(com.digitalml.rest.resources.codegentest.Transactionhistory_30 transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
@ApiModelProperty(notes = "Sanction score is the SDN value recevied from SPS. Details- Numeric, 3.")
	public String getSanctionScore() {
		return sanctionScore;
	}
	
	public void setSanctionScore(String sanctionScore) {
		this.sanctionScore = sanctionScore;
	}
}