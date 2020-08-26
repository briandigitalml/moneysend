package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Deletesubscriberidrequest_74_wrapper:
{
  "type": "object",
  "properties": {
    "DeleteSubscriberIdRequest": {
      "$ref": "Deletesubscriberidrequest_74"
    }
  }
}
*/


public class Deletesubscriberidrequest_74_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Deletesubscriberidrequest_74 deleteSubscriberIdRequest;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    deleteSubscriberIdRequest = null;
	}

	public com.digitalml.rest.resources.codegentest.Deletesubscriberidrequest_74 getDeleteSubscriberIdRequest() {
		return deleteSubscriberIdRequest;
	}
	
	public void setDeleteSubscriberIdRequest(com.digitalml.rest.resources.codegentest.Deletesubscriberidrequest_74 deleteSubscriberIdRequest) {
		this.deleteSubscriberIdRequest = deleteSubscriberIdRequest;
	}
}