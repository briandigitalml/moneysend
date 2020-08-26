package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Transferreversalrequest_33_wrapper:
{
  "type": "object",
  "properties": {
    "TransferReversalRequest": {
      "$ref": "Transferreversalrequest_33"
    }
  }
}
*/


public class Transferreversalrequest_33_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Transferreversalrequest_33 transferReversalRequest;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    transferReversalRequest = null;
	}

	public com.digitalml.rest.resources.codegentest.Transferreversalrequest_33 getTransferReversalRequest() {
		return transferReversalRequest;
	}
	
	public void setTransferReversalRequest(com.digitalml.rest.resources.codegentest.Transferreversalrequest_33 transferReversalRequest) {
		this.transferReversalRequest = transferReversalRequest;
	}
}