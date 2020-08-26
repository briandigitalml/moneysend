package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Createmappingrequest_52_wrapper:
{
  "type": "object",
  "properties": {
    "CreateMappingRequest": {
      "$ref": "Createmappingrequest_52"
    }
  }
}
*/


public class Createmappingrequest_52_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Createmappingrequest_52 createMappingRequest;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    createMappingRequest = null;
	}

	public com.digitalml.rest.resources.codegentest.Createmappingrequest_52 getCreateMappingRequest() {
		return createMappingRequest;
	}
	
	public void setCreateMappingRequest(com.digitalml.rest.resources.codegentest.Createmappingrequest_52 createMappingRequest) {
		this.createMappingRequest = createMappingRequest;
	}
}