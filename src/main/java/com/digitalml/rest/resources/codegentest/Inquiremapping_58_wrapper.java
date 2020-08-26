package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Inquiremapping_58_wrapper:
{
  "type": "object",
  "properties": {
    "InquireMapping": {
      "$ref": "Inquiremapping_58"
    }
  }
}
*/


public class Inquiremapping_58_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Inquiremapping_58 inquireMapping;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    inquireMapping = null;
	}

	public com.digitalml.rest.resources.codegentest.Inquiremapping_58 getInquireMapping() {
		return inquireMapping;
	}
	
	public void setInquireMapping(com.digitalml.rest.resources.codegentest.Inquiremapping_58 inquireMapping) {
		this.inquireMapping = inquireMapping;
	}
}