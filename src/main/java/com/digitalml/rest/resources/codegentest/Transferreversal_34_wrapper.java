package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Transferreversal_34_wrapper:
{
  "type": "object",
  "properties": {
    "TransferReversal": {
      "$ref": "Transferreversal_34"
    }
  }
}
*/


public class Transferreversal_34_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Transferreversal_34 transferReversal;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    transferReversal = null;
	}

	public com.digitalml.rest.resources.codegentest.Transferreversal_34 getTransferReversal() {
		return transferReversal;
	}
	
	public void setTransferReversal(com.digitalml.rest.resources.codegentest.Transferreversal_34 transferReversal) {
		this.transferReversal = transferReversal;
	}
}