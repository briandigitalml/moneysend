package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Sanctionscoreserviceresponse_51:
{
  "type": "object",
  "properties": {
    "RequestId": {
      "description": "Request id. Details- Numeric, 1-19 in length, value is unique identifier.",
      "type": "string"
    },
    "TransactionReference": {
      "description": "Transaction reference. Details- Numeric, 19 in length, value is unique reference number.",
      "type": "string"
    },
    "Status": {
      "description": "Status of the sanction score request. Status of 0 indicates successful call. There will not be a status in failure scenarios. Details- Numeric",
      "type": "integer",
      "format": "int32"
    },
    "Score": {
      "description": "Sanction score. There will not be a score in failure scenarios. Details- Numeric, 3 in length.",
      "type": "integer",
      "format": "int32"
    },
    "MatchList": {
      "description": "Highest Match List. Details- String.",
      "type": "string"
    }
  }
}
*/


public class Sanctionscoreserviceresponse_51 {

	@Size(max=1)
	private String requestId;

	@Size(max=1)
	private String transactionReference;

	@Size(max=1)
	private Integer status;

	@Size(max=1)
	private Integer score;

	@Size(max=1)
	private String matchList;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    requestId = null;
	    transactionReference = null;
	    status = null;
	    score = null;
	    matchList = null;
	}
@ApiModelProperty(notes = "Request id. Details- Numeric, 1-19 in length, value is unique identifier.")
	public String getRequestId() {
		return requestId;
	}
	
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
@ApiModelProperty(notes = "Transaction reference. Details- Numeric, 19 in length, value is unique reference number.")
	public String getTransactionReference() {
		return transactionReference;
	}
	
	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}
@ApiModelProperty(notes = "Status of the sanction score request. Status of 0 indicates successful call. There will not be a status in failure scenarios. Details- Numeric")
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
@ApiModelProperty(notes = "Sanction score. There will not be a score in failure scenarios. Details- Numeric, 3 in length.")
	public Integer getScore() {
		return score;
	}
	
	public void setScore(Integer score) {
		this.score = score;
	}
@ApiModelProperty(notes = "Highest Match List. Details- String.")
	public String getMatchList() {
		return matchList;
	}
	
	public void setMatchList(String matchList) {
		this.matchList = matchList;
	}
}