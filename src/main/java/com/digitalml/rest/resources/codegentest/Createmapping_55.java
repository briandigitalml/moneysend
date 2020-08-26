package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Createmapping_55:
{
  "type": "object",
  "properties": {
    "RequestId": {
      "description": "This is the Unique identifier for API Web service request. Numeric value, variable length without zero padding.",
      "type": "string"
    },
    "Mapping": {
      "$ref": "Mapping_56"
    }
  }
}
*/


public class Createmapping_55 {

	@Size(max=1)
	private String requestId;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Mapping_56 mapping;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    requestId = null;
	    mapping = null;
	}
@ApiModelProperty(notes = "This is the Unique identifier for API Web service request. Numeric value, variable length without zero padding.")
	public String getRequestId() {
		return requestId;
	}
	
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public com.digitalml.rest.resources.codegentest.Mapping_56 getMapping() {
		return mapping;
	}
	
	public void setMapping(com.digitalml.rest.resources.codegentest.Mapping_56 mapping) {
		this.mapping = mapping;
	}
}