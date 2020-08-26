package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Deletesubscriberid_75:
{
  "type": "object",
  "properties": {
    "RequestId": {
      "description": "This is the Unique identifier for API Web service request. Numeric value, variable length without zero padding.",
      "type": "string"
    }
  }
}
*/


public class Deletesubscriberid_75 {

	@Size(max=1)
	private String requestId;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    requestId = null;
	}
@ApiModelProperty(notes = "This is the Unique identifier for API Web service request. Numeric value, variable length without zero padding.")
	public String getRequestId() {
		return requestId;
	}
	
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}