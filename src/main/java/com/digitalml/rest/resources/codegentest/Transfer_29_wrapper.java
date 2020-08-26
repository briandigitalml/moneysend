package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Transfer_29_wrapper:
{
  "type": "object",
  "properties": {
    "Transfer": {
      "$ref": "Transfer_29"
    }
  }
}
*/


public class Transfer_29_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Transfer_29 transfer;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    transfer = null;
	}

	public com.digitalml.rest.resources.codegentest.Transfer_29 getTransfer() {
		return transfer;
	}
	
	public void setTransfer(com.digitalml.rest.resources.codegentest.Transfer_29 transfer) {
		this.transfer = transfer;
	}
}