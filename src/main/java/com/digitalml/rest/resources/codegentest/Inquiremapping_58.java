package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Inquiremapping_58:
{
  "type": "object",
  "properties": {
    "RequestId": {
      "description": "This is the Unique identifier for API Web service request. Numeric value, variable length without zero padding.",
      "type": "string"
    },
    "Mappings": {
      "$ref": "Mappings_59"
    }
  }
}
*/


public class Inquiremapping_58 {

	@Size(max=1)
	private String requestId;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Mappings_59 mappings;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    requestId = null;
	    mappings = null;
	}
@ApiModelProperty(notes = "This is the Unique identifier for API Web service request. Numeric value, variable length without zero padding.")
	public String getRequestId() {
		return requestId;
	}
	
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public com.digitalml.rest.resources.codegentest.Mappings_59 getMappings() {
		return mappings;
	}
	
	public void setMappings(com.digitalml.rest.resources.codegentest.Mappings_59 mappings) {
		this.mappings = mappings;
	}
}