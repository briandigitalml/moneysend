package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Deletesubscriberid_75_wrapper:
{
  "type": "object",
  "properties": {
    "DeleteSubscriberId": {
      "$ref": "Deletesubscriberid_75"
    }
  }
}
*/


public class Deletesubscriberid_75_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Deletesubscriberid_75 deleteSubscriberId;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    deleteSubscriberId = null;
	}

	public com.digitalml.rest.resources.codegentest.Deletesubscriberid_75 getDeleteSubscriberId() {
		return deleteSubscriberId;
	}
	
	public void setDeleteSubscriberId(com.digitalml.rest.resources.codegentest.Deletesubscriberid_75 deleteSubscriberId) {
		this.deleteSubscriberId = deleteSubscriberId;
	}
}