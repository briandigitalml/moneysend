package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Transactionhistory_35:
{
  "type": "object",
  "properties": {
    "Transaction": {
      "minItems": 0,
      "description": "Information for one transaction.",
      "type": "array",
      "items": {
        "$ref": "Transaction_36"
      }
    }
  }
}
*/


public class Transactionhistory_35 {

	@Size(max=1)
	private List<com.digitalml.rest.resources.codegentest.Transaction_36> transaction;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    transaction = new ArrayList<com.digitalml.rest.resources.codegentest.Transaction_36>();
	}
@ApiModelProperty(notes = "Information for one transaction.")
	public List<com.digitalml.rest.resources.codegentest.Transaction_36> getTransaction() {
		return transaction;
	}
	
	public void setTransaction(List<com.digitalml.rest.resources.codegentest.Transaction_36> transaction) {
		this.transaction = transaction;
	}
}