package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Inquiremappingrequest_57_wrapper:
{
  "type": "object",
  "properties": {
    "InquireMappingRequest": {
      "$ref": "Inquiremappingrequest_57"
    }
  }
}
*/


public class Inquiremappingrequest_57_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Inquiremappingrequest_57 inquireMappingRequest;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    inquireMappingRequest = null;
	}

	public com.digitalml.rest.resources.codegentest.Inquiremappingrequest_57 getInquireMappingRequest() {
		return inquireMappingRequest;
	}
	
	public void setInquireMappingRequest(com.digitalml.rest.resources.codegentest.Inquiremappingrequest_57 inquireMappingRequest) {
		this.inquireMappingRequest = inquireMappingRequest;
	}
}