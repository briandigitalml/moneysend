package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Transactionhistory_30:
{
  "type": "object",
  "properties": {
    "Transaction": {
      "minItems": 0,
      "description": "Information for one transaction.",
      "type": "array",
      "items": {
        "$ref": "Transaction_31"
      }
    }
  }
}
*/


public class Transactionhistory_30 {

	@Size(max=1)
	private List<com.digitalml.rest.resources.codegentest.Transaction_31> transaction;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    transaction = new ArrayList<com.digitalml.rest.resources.codegentest.Transaction_31>();
	}
@ApiModelProperty(notes = "Information for one transaction.")
	public List<com.digitalml.rest.resources.codegentest.Transaction_31> getTransaction() {
		return transaction;
	}
	
	public void setTransaction(List<com.digitalml.rest.resources.codegentest.Transaction_31> transaction) {
		this.transaction = transaction;
	}
}