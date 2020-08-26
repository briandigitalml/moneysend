package com.digitalml.rest.resources.codegentest;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Paneligibilityrequest_38_wrapper:
{
  "type": "object",
  "properties": {
    "PanEligibilityRequest": {
      "$ref": "Paneligibilityrequest_38"
    }
  }
}
*/


public class Paneligibilityrequest_38_wrapper {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Paneligibilityrequest_38 panEligibilityRequest;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    panEligibilityRequest = null;
	}

	public com.digitalml.rest.resources.codegentest.Paneligibilityrequest_38 getPanEligibilityRequest() {
		return panEligibilityRequest;
	}
	
	public void setPanEligibilityRequest(com.digitalml.rest.resources.codegentest.Paneligibilityrequest_38 panEligibilityRequest) {
		this.panEligibilityRequest = panEligibilityRequest;
	}
}